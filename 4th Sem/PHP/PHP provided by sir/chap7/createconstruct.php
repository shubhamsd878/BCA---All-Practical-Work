<html>
<head>
<title>Using a Constructor</title>
</head>
<body>
<h1>Using a Constructor</h1>
<?php

class Person
{
var $name;
	 function__construct($data)
	{
	$this->name=$data;

	}

	function set_name($data)
	{
	$this->name=$data;
	}

	function get_name()
	{
	return $this->name;
	}

}

$dan=new Person("Dan");
echo "The name of your friend is : ",$dan->get_name(), ".";
?>
</body>
</html>
