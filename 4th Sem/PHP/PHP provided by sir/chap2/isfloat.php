<html>
<head>
<title>
Using hte is_float Function</title>
</head>
<body>
<h1>Using the is_float Function</h1>
<?php
$variable1=10.7;
$variable2=45;
if(is_float($variable1))
{
$variable1=$variable1+4.5;
echo "The value of float is :  ",var_dump($variable1),"<br>" ;
}

if(is_int($variable2))
{
$variable2=$variable2+45;
echo "The value of Integer is :  " ,var_dump($variable2), "<br>";
}
?>
</body>
</html>