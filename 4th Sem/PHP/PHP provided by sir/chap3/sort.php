<html>
<head>
<title>Sorting an Array
</title>
</head>
<body>
<h1>Sorting an Array</h1>
<?php
$ice[0]="orange";
$ice[1]="vanilla";
$ice[2]="rum raisin";

print_r($ice);
echo "<hr>";
echo "<h1>After Sort</h1>";
sort($ice);
print_r($ice);

echo "<hr>";
echo "<h1>Reverse Sort</h1>";
rsort($ice);
print_r($ice);

?>
</body>
</html>