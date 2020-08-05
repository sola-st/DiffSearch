
function search_function() {
    // Selecting the input element and get its value
    var inputVal = document.getElementById("query_old").value;
    var inputVal2 = document.getElementById("query_new").value;

    try {



         var ws = new WebSocket("ws://127.0.0.1:8372/");

         ws.onopen = function() {
             //alert("Opened!");
             ws.send("Hello Server");
         };
         /*

      /* ws.onmessage = function (evt) {
             alert("Message: " + evt.data);
         };

         ws.onclose = function() {
             alert("Closed!");
         };

         ws.onerror = function(err) {
             alert("Error: " + err);
         };*/


    } catch (error) {
        alert(error);
        // expected output: ReferenceError: nonExistentFunction is not defined
        // Note - error messages will vary depending on browser
    }

    document.getElementById("myParagraph0").innerHTML ="<pre><font size=\"16\"><span style='color:#ffffff'>Ten of the total code changes found are:\n\n</span></font></pre>";
    document.getElementById("myParagraph1").innerHTML = "<pre><font size=\"14\"><span style='color:#9c0101'>-" + inputVal + "</span>\n<span style='color:#008000'>+" + inputVal2 + "</span>\n\n"+ "</font></pre>";
    document.getElementById("myParagraph2").innerHTML ="<pre><font size=\"14\"><span style='color:#9c0101'>-" + inputVal + "</span>\n<span style='color:#008000'>+" + inputVal2 + "</span>\n\n"+ "</font></pre>";
    document.getElementById("myParagraph3").innerHTML ="<pre><font size=\"14\"><span style='color:#9c0101'>-" + inputVal + "</span>\n<span style='color:#008000'>+" + inputVal2 + "</span>\n\n"+ "</font></pre>";
    document.getElementById("myParagraph4").innerHTML ="<pre><font size=\"14\"><span style='color:#9c0101'>-" + inputVal + "</span>\n<span style='color:#008000'>+" + inputVal2 + "</span>\n\n"+ "</font></pre>";
    document.getElementById("myParagraph5").innerHTML ="<pre><font size=\"14\"><span style='color:#9c0101'>-" + inputVal + "</span>\n<span style='color:#008000'>+" + inputVal2 + "</span>\n\n"+ "</font></pre>";
    document.getElementById("myParagraph6").innerHTML = "<pre><font size=\"14\"><span style='color:#9c0101'>-" + inputVal + "</span>\n<span style='color:#008000'>+" + inputVal2 + "</span>\n\n"+ "</font></pre>";
    document.getElementById("myParagraph7").innerHTML ="<pre><font size=\"14\"><span style='color:#9c0101'>-" + inputVal + "</span>\n<span style='color:#008000'>+" + inputVal2 + "</span>\n\n"+ "</font></pre>";
    document.getElementById("myParagraph8").innerHTML ="<pre><font size=\"14\"><span style='color:#9c0101'>-" + inputVal + "</span>\n<span style='color:#008000'>+" + inputVal2 + "</span>\n\n"+ "</font></pre>";
    document.getElementById("myParagraph9").innerHTML ="<pre><font size=\"14\"><span style='color:#9c0101'>-" + inputVal + "</span>\n<span style='color:#008000'>+" + inputVal2 + "</span>\n\n"+ "</font></pre>";
    document.getElementById("myParagraph10").innerHTML ="<pre><font size=\"14\"><span style='color:#9c0101'>-" + inputVal + "</span>\n<span style='color:#008000'>+" + inputVal2 + "</span>\n\n"+ "</font></pre>";

}

