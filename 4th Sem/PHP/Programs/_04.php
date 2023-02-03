<!-- comparison operator program | Shubham Dahiya -->
<!DOCTYPE html>
<html>
<body>

<?php
$a = 15;
$b = 20;

echo "a = $a <br> b = $b <br> <br>";


if( $a == $b ) {
echo "Result1 : a is equal to b<br/>";
}else {
echo "Result1 : a is not equal to b<br/>";
}

echo "<br>";
if( $a > $b ) {
echo "Result2 : a is greater than  b<br/>";
}else {
echo "Result2 : a is not greater than b<br/>";
}

echo "<br>";

if( $a < $b ) {
echo "Result3 : a is less than  b<br/>";
}else {
echo "Result3 : a is not less than b<br/>";
}
echo "<br>";

if( $a != $b ) {
echo "Result4 : a is not equal to b<br/>";
}else {
echo "Result4 : a is equal to b<br/>";
}
echo "<br>";

if( $a >= $b ) {
echo "Result5 : a is either greater than or equal to b<br/>";
}else {
echo "Result5 : a is neither greater than nor equal to b<br/>";
}
echo "<br>";

if( $a <= $b ) {
echo "Result6 : a is either less than or equal to b<br/>";
}else {
echo "Result6 : a is neither less than nor equal to b<br/>";
}
?>
</body>
</html>