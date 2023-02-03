<html>
<head>
<title>Creating an Array
</title>
</head>
<body>
<h1>Creating an Array</h1>
<?php
echo  "<hr>";
$actors[0]="Carry Grant";
$actors[1]="Myrna Loy";
$actors[2]="Lorne Green";
echo "\$actors[0]   =   ",$actors[0],"<br>";
echo "\$actors[1]   =   ",$actors[1],"<br>";
echo "\$actors[2]   =   ",$actors[2],"<br>";
echo "<hr>";
$actors=array(1=>"CarryGrant","Myrana Loy","Lorne Green");
echo "\$actors[1]    =  "  ,$actors[1],"<br>";
echo "\$actors[2]    =  "  ,$actors[2],"<br>";
echo "\$actors[3]    =  "  ,$actors[3],"<br>";
echo   "<hr>";

$actors=array(1=>"CarryGrant",5=>"Myrana Loy",8=>"Lorne Green");
echo "\$actors[1]    =  "  ,$actors[1],"<br>";
echo "\$actors[5]    =  "  ,$actors[5],"<br>";
echo "\$actors[8]    =  "  ,$actors[8],"<br>";
echo   "<hr>";
?>

</body>
</html>