<html>
<head>
<title>Using Switch Case</title>
</head>
<body>
<h1>Using Switch Case</h1>
<?php
$temp=76;
switch($temp)
{
case 70:
case 71:
case 72:
echo "Nice day Outside";
break;

case 73:
case 74:
case 75:
echo "Ok,but a little warm";
break;

case 76:
case 77:
case 78:
echo "A little warmer";
break;
default :
echo "Temperature outside the range this statement can handle";

}
?>
</body>
</html>