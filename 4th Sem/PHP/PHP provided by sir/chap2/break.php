<html>
<head>
<title>Using the break Statement
</title>
</head>
<body>
<h1>Using the break Statement</h1>
<?php
for($loop=0;$loop<1000;$loop++)
{
echo "I 'am going to do this a thousand times unless you stop me!<br>";
if($loop==5)
{
echo "Alright,I 'm quitting.<br>";
break;
}
}
?>
</body>
</html>