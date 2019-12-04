package research.diffsearch;

import java.util.List;

import info.debatty.java.stringsimilarity.NGram;

public class Score {
	private String code;
	private double jaccard_score;
	private double ngrams_score;
	
	Score(String c, List<String> list_parent_child, List<String> list_change_parent_child, String tree_query, String tree_change){
		code = c;
		jaccard_score = Matching_Methods.jaccard_similarity(list_parent_child,list_change_parent_child);
		
		 NGram twogram = new NGram(2);
		 ngrams_score = Matching_Methods.round2(1 - twogram.distance(tree_query, tree_change));
	}
	
	public String get_score() {
		return code + ' ' + jaccard_score + ' ' + ngrams_score;
	}

}
