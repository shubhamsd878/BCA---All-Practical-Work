<html>
<head>
<title>Passing data to function by reference</title>
</head>
<body>
<h1>Passing data to function by reference</h1>
<?php
$value=4;
echo  "Before the call ,\$value hold $value <br>";
squarer($value);
echo  "After the call ,\$value hold  $value <br>"; 


function squarer(&$num)
{
$num *= $num;
}
?>
</body>
<html>