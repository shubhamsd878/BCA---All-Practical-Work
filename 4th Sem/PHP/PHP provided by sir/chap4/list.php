<html>
<head>
<title>Returning lists from functions</title>
</head>
<body>
<h1>Returning lists from functions</h1>
<?php
list($first,$second,$third)=create_list(3);
echo "Here is the first list:<br>";
echo "$first,$second,$third<br>";

list($first,$second,$third,$forth)=create_list(4);
echo "Here is the first list:<br>";
echo "$first,$second,$third,$forth<br>";


function create_list($number)
{
for($loop=0;$loop<$number;$loop++)
{
$array[]=$loop;
}
return $array;
}
?>
</body>
</html>