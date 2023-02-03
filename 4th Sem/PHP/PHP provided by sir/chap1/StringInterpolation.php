<html>
<head>
<title>Using String Interpolation</title>
</head>
<body>
<h1> Using String Interpolation</h1>

<?php 

echo "Setting the number of cheeseburgers to 1.<br>";
$cheeseburgers=1;
echo "Current number of cheeseburgers : $cheeseburgers <br>";
echo "Adding 3 more cheeseburgers.<br>";
# unset ($cheeseburgers);
$cheeseburgers=$cheeseburgers +3;
echo " Number of cheeseburgers now:   $cheeseburgers <br>";


$type="basket";
echo "The name  of the game is<b> {$type}ball. <br>";

?>
</body>
</html>