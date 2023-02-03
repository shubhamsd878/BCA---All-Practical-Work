<!-- Associative Array program | Shubham Dahiya -->
<!DOCTYPE html>
<html>
<body>

<?php

$students = array("student1"=>"Shubham", "student2"=>"Ankit", "student3"=>"Lakshay Valecha");

foreach($students as $key => $value) {
echo "Key=" . $key . ", Value=" . $value;
echo "<br>";
}
?>

</body>
</html>