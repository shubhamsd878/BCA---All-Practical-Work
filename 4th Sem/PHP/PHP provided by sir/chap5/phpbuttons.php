<html>
<head>
<title>Reading buttons
</title>
</head>
<body>
<h1>Reading buttons.</h1>
<?php
if(isset($_REQUEST["button"]))
{
echo "You Clicked the : ",$_REQUEST["button"] ,"<br>";
}
?>
</body>
</html>