<!-- arithmetic + incremetn/decrement operator program | Shubham Dahiya -->
<!DOCTYPE html>
<html>
<body>

<?php
$a = 42;
$b = 20;

echo "a = $a <br> b = $b <br> <br>";

$result = $a + $b;
echo "Addtion Operator: $result <br/>";

$result = $a - $b;
echo "Substraction Operator: $result <br/>";

$result = $a * $b;
echo "Multiplication Operator: $result <br/>";

$result = $a / $b;
echo "Division Operator: $result <br/>";

$result = $a % $b;
echo "Modulus Operator: $result <br/>";

//  exponential operator not working
//  $result = $a ** $b;
//  echo "Exponential Operator : $result <br/>";

$result = $a++; 
echo "Increment Operator: $result <br/>";

$result = $a--; 
echo "Decrement Operator: $result <br/>";
?>

</body>
</html>