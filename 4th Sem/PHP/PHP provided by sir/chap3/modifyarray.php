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
$actors[2]="Pankaj Arora";
$actors[]="Rajan";
echo "\$actors[0]   =   ",$actors[0],"<br>";
echo "\$actors[1]   =   ",$actors[1],"<br>";
echo "\$actors[2]   =   ",$actors[2],"<br>";
echo "\$actors[3]   =   ",$actors[3],"<br>";
echo "<hr>";
echo "<h1>Delete an Element from Array<h1>";
$actors[0]="";
unset($actors[1]);
echo "\$actors[0]= ",$actors[0],"<br>";
echo "\$actors[1]= ",$actors[1],"<br>";
?>

</body>
</html>