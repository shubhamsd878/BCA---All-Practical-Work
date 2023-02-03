<html>
<head>
<title>Creating an Array
</title>
</head>
<body>
<h1>Modifying an Array</h1>
<?php
echo  "<hr>";
$actors[0]="Carry Grant";
$actors[1]="Myrna Loy";
$actors[2]="Lorne Green";
$actors[3]="Pankaj Arora";
print_r($actors);
for($loop1=0;$loop1<count($actors);$loop1 ++)
{
echo  "\$actors[$loop1]    =   " ,$actors[$loop1],"<br>";
}

?>

</body>
</html>