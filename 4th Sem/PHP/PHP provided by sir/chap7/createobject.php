<html>
<head>
<title>Creating an object</title>
</head>
<body>
<h1>Creating an object</h1>
<?php

class Person
{
public $name;			//public declared

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
echo "The name of your friend is : ",$ralph->name,".";
?>
</body>
</html>