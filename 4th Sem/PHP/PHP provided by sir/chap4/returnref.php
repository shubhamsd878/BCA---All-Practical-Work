<html>
<head>
<title>Returning Reference from functions</title>
</head>
<body>
<h1>Returning Reference from functions</h1>
<?php
$value=4;
echo "The current value is : ",$value,"<br>";
$ref=&return_ref($value);
$ref++;
echo "New Value is  :",$value ,"\n";

function &return_ref(& $ref)
{
return $ref;
}
?>
</body>
</html>