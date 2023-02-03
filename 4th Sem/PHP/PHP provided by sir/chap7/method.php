<html>
<head>
<title>Using Method Private Access</title>
</head>
<body>
<h1>Using Method Private Access</h1>
<?php
class Person
{
var $name;

function set_name($data)
{
	$this->name=get_name();
}

function private get_name()
{
	return $this->name;
}
}

$hello=new Person();
$hello->set_name("Ralph");
echo "The name of your friend is :  " , $hello->get_name() ,  ".";
?>
</body>
</html>