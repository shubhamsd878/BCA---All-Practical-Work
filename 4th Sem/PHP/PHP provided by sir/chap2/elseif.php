<html>
</head>
<title>Using the ElseIF Statement</title>
</head>
<body>
<h1>Using the ElseIf Statement</h1>
<?php
$temp=79;
if($temp<32)
{
echo "Too Cols";
}
elseif($temp<60)
{
echo "Pretty Chilly";
}
elseif($temp<70)
{
echo "Pretty nice outside";
}
elseif($temp<80)
{
echo "Pretty warm Outside";
}
else
{
echo "Too hot";
}

?>
</body>
</html>