<html>
<head>
<title>Reading file data</title>
</head>
<body>
<h1>Reading file data</h1>
<br>
The File Contained:-
<br>
<?php
$handle=fopen($_FILES['userfile']['tmp_name']," r " );
echo $handle;
exit;
while (!feof($handle))
{
$text=fgets($handle);
echo $text ,"<br>";

}
fclose($handle);
?>
</body>
</html>