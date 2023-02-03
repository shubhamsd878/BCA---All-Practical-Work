<html>
<head>
<title>
Reading data from check boxes
</title>
</head>
<body>
<h1>
You Selected:
<?php
if(isset($_REQUEST["check1"]))
{
echo $_REQUEST["check1"],"<br>";
}
if(isset($_REQUEST["check2"]))
{
echo $_REQUEST["check2"],"<br>";
}
?>
</body>
</html>