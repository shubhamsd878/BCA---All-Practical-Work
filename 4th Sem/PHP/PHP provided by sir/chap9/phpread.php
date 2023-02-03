<html>
<head>
<title>Reading from a File</title>
</head>
<body>
<h1>Reading from a File</h1>
<?php
$handle=fopen("c:\f.txt","r");
while(!feof($handle))
{
$text=fgets($handle);
echo $text,"<br>";
}
fclose($handle);
?>
</body>
</html>