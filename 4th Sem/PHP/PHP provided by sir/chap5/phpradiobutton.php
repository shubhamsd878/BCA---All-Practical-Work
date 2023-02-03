<html>
<head>
<title>Reading data from radio buttons</title>
</head>
<body>
<h1>Reading data from radio buttons</h1>
You Selected:
<?php
if(isset($_REQUEST["radios"]))
{
echo $_REQUEST["radios"];
}
else
{
echo "No radio Button was selected.<br>";
}


?>
</body>
</html>