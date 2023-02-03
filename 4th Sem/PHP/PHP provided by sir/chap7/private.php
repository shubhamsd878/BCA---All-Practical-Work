<html>
<head>
<title>Using Private Access</title>
</head>
<body>
<h1>Using Private Access.</h1>
<?php

class Person
{
private  $name;			// private declared

function set_name($data)
{
$this->name=$data;
}

function get_name()
{
return $this->name;
}
}

$ralph=new Person();  			//create an object
$ralph->set_name("Ralph");
echo "The name of your friend is : ",$ralph->name //get_name(), ".";
?>
</body>
</html>