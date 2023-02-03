<html>
<head>
<title>Opening a File</title>
</head>
<body>
<h1>Opening a File.</h1>
<?php
$handle=fopen("file.txt ", "r");
if($handle)
{
echo "File Opened Ok.";
}
?>
</body>
</html>