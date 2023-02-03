<html>
<head<<title>PHP Programs</title></head>
<body>
<?php
$a=10.29;
print "<br>";
print getType($a);
print "<br>";
print $a;
print "<br>";
setType($a,boolean);
print getType($a);
print "<br>";
print $a;

print "<hr>";
$b=20.78;
print "<br>";
print getType($b);
print "<br>";
print $b;
print "<br>";
$holder=(integer)$b;
print getType($holder);
print "<br>";
print $holder;
?>
</body>
</html>