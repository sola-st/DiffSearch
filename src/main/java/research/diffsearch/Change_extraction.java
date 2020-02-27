package research.diffsearch;

import difflib.*;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;


public class Change_extraction {
    /**
     * Cloning and git diff computation of a git repository (not complete)
     *
     */
    static void git_diff(){
        Process git_diff_python;
        try {
            git_diff_python = Runtime.getRuntime().exec("python ./src/main/resources/Python/git_functions.py");
            BufferedReader br = new BufferedReader(new InputStreamReader(git_diff_python.getInputStream()));

            git_diff_python.waitFor();
            git_diff_python.destroy();
        } catch (Exception e) { e.printStackTrace();}

        System.out.println("PYTHON GIT DIFF STAGE DONE\n");
    }

    /**
     * Extraction of the changes from a git diff file. Each change is transformed in the form:
     * old code -> new code
     *
     * @return A list of changes in the form: old code -> new code
     */
    static long analyze_diff_file() {
        List<String> temporary_list_old = new ArrayList<String>();
        List<String> temporary_list_new = new ArrayList<String>();
        long change_number = 0;

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/changes_gitdiff.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        boolean flag = false;

        //List<String> allLines = null;
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(System.getProperty("user.dir") + "/src/main/resources/GitHub/" + Config.GITDIFF_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
           // assert scanner != null;
            while (scanner.hasNext()) {
                String line = scanner.nextLine() + "  ";

                //manage -old change
                if ((line.substring(0, 1).equals("-")) && (!line.substring(1, 2).equals("-"))) {

                    //Manage sequential change without interruption: -old +new -old +new
                    if (flag && temporary_list_old.size() > 0) {
                        ArrayList<String> change = new ArrayList<String>();

                        if (temporary_list_new.size() == 0) {
                            change.add(temporary_list_old.toString());
                            change.add("_\n");
                        } else {
                            if (temporary_list_old.size() == 0) {
                                change.add("_\n");
                                change.add(temporary_list_new.toString());
                            } else {
                                change.add(temporary_list_old.toString());
                                change.add(temporary_list_new.toString());
                            }
                        }

                        //changes_list.add(change);

                        if(change.get(0).equals("_\n")){
                            assert writer != null;
                            writer.println((change.get(0).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->","->") + "$$$");
                        }else
                        if(change.get(1).equals("_\n")){
                            assert writer != null;
                            writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).replace("\n,", "\n")).replace("\n->","->")+ "$$$");
                        }else {
                            assert writer != null;
                            writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->","->") + "$$$");
                        }
                        change_number++;
                      //  System.out.println(change_number + "\n");
                        if(change_number > 2000000)
                            break;

                        temporary_list_old.clear();
                        temporary_list_new.clear();
                        flag = false;
                    }

                    //Add -old in a  temporary list, managing the case: all whitespace
                    if(line.substring(1, line.length() - 1) .trim().length() > 0)
                        temporary_list_old.add(line.substring(1, line.length() - 1) + "\n");
                    else
                        temporary_list_old.add("_\n");

                } else
                    //manage +new change, managing the case: all whitespace
                    if ((line.substring(0, 1).equals("+")) && (!line.substring(1, 2).equals("+"))) {
                        if(line.substring(1, line.length() - 1) .trim().length() > 0)
                            temporary_list_new.add(line.substring(1, line.length() - 1) + "\n");
                        else
                            temporary_list_new.add("_\n");

                        flag = true;//-old +new is complete
                    } else {
                        // merge old and new code in the same list
                        if (flag || temporary_list_old.size() > 0) {
                            ArrayList<String> change = new ArrayList<String>();

                            //manage -old only
                            if (temporary_list_new.size() == 0) {
                                change.add(temporary_list_old.toString());
                                change.add("_\n");
                            } else {
                                //manage +new only
                                if (temporary_list_old.size() == 0) {
                                    change.add("_\n");
                                    change.add(temporary_list_new.toString());
                                } else {
                                    change.add(temporary_list_old.toString());
                                    change.add(temporary_list_new.toString());
                                }
                            }

                            //changes_list.add(change);
                            if(change.get(0).equals("_\n")){
                                assert writer != null;
                                writer.println((change.get(0).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->","->")+ "$$$");
                            }else
                            if(change.get(1).equals("_\n")){
                                assert writer != null;
                                writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).replace("\n,", "\n")).replace("\n->","->")+ "$$$");
                            }else {
                                assert writer != null;
                                writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->","->")+ "$$$");
                            }

                            change_number++;
                            if(change_number > 2000000)
                                break;
                            System.out.println(change_number + "\n");
                            temporary_list_old.clear();
                            temporary_list_new.clear();
                            flag = false;
                        }
                    }
            }

            //Last change
            if (flag) {
                ArrayList<String> change = new ArrayList<String>();
                change.add(temporary_list_old.toString());
                change.add(temporary_list_new.toString());


                if(change.get(0).equals("_\n")){
                    assert writer != null;
                    writer.println((change.get(0).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->","->"));
                }else
                if(change.get(1).equals("_\n")){
                    assert writer != null;
                    writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).replace("\n,", "\n")).replace("\n->","->")+ "$$$");
                }else {
                    assert writer != null;
                    writer.println((change.get(0).substring(1, change.get(0).length() - 1).replace("\n,", "\n") + "->" + change.get(1).substring(1, change.get(1).length() - 1).replace("\n,", "\n")).replace("\n->","->")+ "$$$");
                }

                change_number++;

                System.out.println(change_number + "\n");
            }

            assert writer != null;
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return change_number;
    }


    /**
     * Extraction of the changes from a git diff file. Each change is transformed in the form:
     * old code -> new code
     *
     * @return A list of changes in the form: old code -> new code
     */
    static long read_HTML_dataset() {
        List<String> temporary_list_old = new ArrayList<String>();
        List<String> temporary_list_new = new ArrayList<String>();
        long change_number = 0;
        long number = 0;


    PrintWriter writer = null;
    try {
        writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/Features_Vectors/GitHub/htmldiff.txt", "UTF-8");
    } catch (FileNotFoundException | UnsupportedEncodingException e) {
        e.printStackTrace();
    }

    for(int w = 0; w < 1; w++) {
    List<File> list_files = listf(System.getProperty("user.dir") + "/src/main/resources/Depth_Corpus/patterns", "sampleChange.html");

    for (File f : list_files) {
        boolean flag = false;

        //List<String> allLines = null;
        Scanner scanner = null;
        try {
            scanner = new Scanner(f);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String old = null, neo = null;

        while (scanner.hasNext()) {
            String line = scanner.nextLine() + "  ";

            if (line.contains("id=\"change\"") && !flag) {
                old = line.replace("<a id=\"change\">", "").replace("</a>", "").replace("\t", "").replace("  ", " ") + "$$$";
                flag = true;
            } else {
                if (line.contains("id=\"change\"") && flag) {
                    neo = line.replace("<a id=\"change\">", "").replace("</a>", "").replace("\t", "").replace("  ", " ") + "$$$";

                    flag = false;
                }
            }
        }

        assert writer != null;
        writer.println(old + "->" + neo);

    }number += list_files.size();
    }
    writer.close();

        return number;//list_files.size();
    }

    public static List<File> listf(String directoryName, String filename) {
        List<File> allFiles = new ArrayList<File>();
        Queue<File> dirs = new LinkedList<File>();
        dirs.add(new File(directoryName));
        while (!dirs.isEmpty()) {
            for (File f : dirs.poll().listFiles()) {
                if (f.isDirectory()) {
                    dirs.add(f);
                } else if (f.isFile() && f.toString().contains(filename)) {
                    allFiles.add(f);
                }
            }
        }
        //System.out.println(fList);
        return allFiles;
    }

    /**
     * Extraction of the changes from a git diff file. Each change is transformed in the form:
     * old code -> new code
     *
     * @return A list of changes in the form: old code -> new code
     */
    static long read_HTML_dataset2() {
        List<String> temporary_list_old = new ArrayList<String>();
        List<String> temporary_list_new = new ArrayList<String>();
        long change_number = 0;
        long number = 0;


        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/GitHub/htmldiff.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        for(int w = 0; w < 1; w++) {
            List<File> list_files = listf(System.getProperty("user.dir") + "/src/main/resources/Depth_Corpus/patterns", "sampleChange.html");

            for (File f : list_files) {
                boolean flag = false;

                //List<String> allLines = null;
                Scanner scanner = null;
                String html = null;
                Document doc = null;
                try {
                    scanner = new Scanner(f);
                    if (scanner.hasNext())
                        html = scanner.useDelimiter("\\A").next();
                    else
                        continue;
                    scanner.close();
                    if(html != null)
                        doc = Jsoup.parse(html);
                } catch (IOException e) {
                    e.printStackTrace();
                    continue;
                }

                String old = null, neo = null;

                Element before = doc.select("code").first();
                List<String> beforeList = new ArrayList<String>(Arrays.asList(before.text().split("\n")));
                Element after = doc.select("code").last();
                List<String> afterList = new ArrayList<String>(Arrays.asList(after.text().split("\n")));


                Patch patch = DiffUtils.diff(beforeList, afterList);

                List<String> pp;

                pp = DiffUtils.generateUnifiedDiff("Before", "After", beforeList, patch, 0);

                assert writer != null;
                for(String str: pp)
                    writer.println(str);

            }

            number += list_files.size();
        }
        writer.close();

        return number;//list_files.size();
    }

    /**
     * Extraction of the changes from a git diff file. Each change is transformed in the form:
     * old code -> new code
     *
     * @return A list of changes in the form: old code -> new code
     */
    static long read_HTML_dataset3() {
        long change_number = 0;
        long number = 0;


        PrintWriter writer = null;
        try {
            writer = new PrintWriter(System.getProperty("user.dir") + "/src/main/resources/GitHub/htmldiff.txt", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        for(int w = 0; w < 1; w++) {
            List<File> list_files = listf(System.getProperty("user.dir") + "/src/main/resources/Depth_Corpus/patterns", "details.html");

            for (File f : list_files) {
                boolean flag = false;

                //List<String> allLines = null;
                Scanner scanner = null;
                String html = null;
                Document doc = null;
                try {
                    scanner = new Scanner(f);
                    if (scanner.hasNext())
                        html = scanner.useDelimiter("\\A").next();
                    else
                        continue;
                    scanner.close();
                    if(html != null)
                        doc = Jsoup.parse(html);
                } catch (IOException e) {
                    e.printStackTrace();
                    continue;
                }

                String old = null, neo = null;

                assert doc != null;
              //  Element before = doc.select("code").first();
              //  List<String> beforeList = new ArrayList<String>(Arrays.asList(before.text().split("\n")));
               // Element after = doc.select("code").last();
                //List<String> afterList = new ArrayList<String>(Arrays.asList(after.text().split("\n")));

                Elements links = doc.select("a");

                for(Element el : links){
                    String url = el.attr("href");
                    if(!url.equals("sampleChange.html")) {
                        try {
                            Git git = Git.cloneRepository()
                                    .setURI(url)
                                    .setDirectory(new File(System.getProperty("user.dir") + "/src/main/resources/Cloning"))
                                    .call();
                        } catch (GitAPIException ex) {
                            ex.printStackTrace();
                        }/*
                        Process gitclone;
                        try {
                            gitclone = Runtime.getRuntime().exec("git clone " + url + " " + System.getProperty("user.dir") + "/src/main/resources/Cloning");

                            int exitCode = gitclone.waitFor();
                            if (exitCode != 0) {
                                throw new IOException("git clone exited with error " + exitCode + ".\n");
                            }
                            gitclone.destroy();
                        } catch (Exception e) { e.printStackTrace();}*/
                    }
                }

                number += list_files.size();
            }


        }
        writer.close();

        return number;//list_files.size();
    }
    
}

