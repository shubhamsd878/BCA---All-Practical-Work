<html>
<head>
<title>Reading Data from text areas</title>
</head>
<body>
<h1>Reading Data from text areas</h1>
You Ordered a pizza with:<br>
<?php
$text = $_REQUEST["data"];
echo  str_replace("\n","<br>",$text);
?>
</body>
</html>