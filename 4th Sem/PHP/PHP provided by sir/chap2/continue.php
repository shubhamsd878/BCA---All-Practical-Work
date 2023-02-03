<html>
<head>
<title>Using the break Statement
</title>
</head>
<body>
<h1>Using the Continue Statement</h1>
<?php
$loop=1;
for($loop = -1 ; $loop < 3 ; $loop++)
{
if($loop==0)
{
continue;
}

echo "1/$loop   =  ", 1/ $loop , "<br>";
//$loop++;
}
?>
</body>
</html>