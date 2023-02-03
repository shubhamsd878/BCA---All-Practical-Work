<html>
<head>
<title>
Using String Functions</title>
</head>
<body>
<h1>Using String Function</h1>
<?php
echo "The test String is 'No Problem'.<br>";
echo " 'No Problem is'   ", strlen("No Problem"), "  characters long<br>";
echo "The Substring substr('No Problem',3,7) is   " , substr("No Problem",3,7 ),"<br>'";
echo "The word 'problem' is at position ", strpos("No Problem","problem"),"<br>";
echo "Replacing 'problem'  with 'problems' gives: ",substr_replace("No Problem","problems",3,9),"<br>"; 
echo "Using ASCII codes :  ",chr(65),chr(66),chr(67),"<br>";
echo "Uppercaseing the First letter gives you  :",ucfirst("no problems"),"<br>";
echo "In upper case : " ,strtoupper("No Problem"),"<br>";
echo "In lower case : " ,strtolower("No Problem"),"<br>";
echo "In reverse case : " ,strrev("No Problem"),"<br>";
echo "'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;No Problem' trimmed is : '",trim("     No Problem"),"<br>";
echo "there are ",substr_count("No Problem","o")," o's in  'No problem',";
?>
</body>
</html>