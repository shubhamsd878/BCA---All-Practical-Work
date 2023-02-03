<html>
<head>
<title>
Comparying Arrays to Each Other
</title>
</head>
<body>
<h1>Comparying Arrays to Each Other</h1>
<?php
$ice1=array("vanilla","chocolate","strawberry");
$ice2=array("vanilla","chocolate","papaya");
$diff1=array_diff($ice1,$ice2);
foreach($diff1 as key=>$value)
{
echo  "Key  : ,$key;  Value   : $value \n";
}
?>
</body>
</html>