<html>
<head>
<title>Using For Each an Array
</title>
</head>
<body>
<h1>Using For Each loop to loop to an Array</h1>
<?php
$actors[0]="Carry Grant";
$actors[1]="Myrna Loy";
$actors[2]="Lorne Green";
$actors[3]="Pankaj Arora";

foreach($actors as $value)
{
echo  "Value :   =   " ,$value,"<br>";
}
echo "<hr>";
foreach($actors as $key=>$value)
{
echo  "Key :$key; Value: $value <br>";
}
?>

</body>
</html>