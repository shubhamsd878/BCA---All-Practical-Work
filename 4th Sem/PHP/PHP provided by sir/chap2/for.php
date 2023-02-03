<html>
<head>
<title>Using FOR Loop</title>
</head>
<body>
<h1>Using FOR Loop</h1>
<?php
for($loop_counter=0;$loop_counter<6;$loop_counter++)
{
echo "<b>You are going to see this message six times.<br>";
}
echo "<hr>";
$loop1=2;
$loop2=2;
for($loop1=2,$loop2=2;$loop1 <= 6  &&  loop2 <= 6; $loop1 ++, $loop2++)
{
echo "$loop1 * $loop2 = " , $loop1*$loop2 , "<br>";
echo "<hr>";
}
?>
</body>
</html>