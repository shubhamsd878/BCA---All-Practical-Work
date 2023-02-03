<html>
<head>
<title>Reading Submit Button</title>
</head>
<body>
<h1>Reading Submit Button</h1>
You Clicked:
<?php
if(isset($_REQUEST["button"]))
{
echo $_REQUEST["button"],"<br>";
}
?>
</body>
</html>