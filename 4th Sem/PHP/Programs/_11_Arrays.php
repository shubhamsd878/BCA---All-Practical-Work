<!-- Array program | Shubham Dahiya -->
<!DOCTYPE html>
<html>
<body>

<?php
/* 1st simple method */
$numbers = array( 1, 2, 3, 4, 5);

foreach( $numbers as $value ) {
echo "Value is $value <br />";
}

echo "<hr>";
/* Second method to create array. */
$numbers[0] = "one";
$numbers[1] = "two";
$numbers[2] = "three";
$numbers[3] = "four";
$numbers[4] = "five";

foreach( $numbers as $value ) {
echo "Value is $value <br />";
}
?>

</body>
</html>