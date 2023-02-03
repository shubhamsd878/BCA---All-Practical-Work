<!-- switch program | Shubham Dahiya -->
<!DOCTYPE html>
<html>
<body>

<?php
$day = "5";
echo "day= $day <br> <br>";

switch ($day) {
case "1":
echo "day is Monday!";
break;
case "2":
echo "day is today!";
break;
case "3":
echo "day is Wednesday!";
break;
case "4":
echo "day is Thursday!";
break;
case "5":
echo "day is Friday!";
break;
case "6":
echo "day is Saturday!";
break;
case "7":
echo "day is Sunday!";
break;
default:
echo "Invalid number!";
}
?>

</body>
</html>