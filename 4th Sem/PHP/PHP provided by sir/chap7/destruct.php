<html>
<head>
<title>Using Destructor</title>
</head>
<body>
<h1>Using a Destructor</h1>
<?php
class Person
{
var $name;

function __construct($data)
{
echo "Constructing  : ",$data,".....<br>";
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

function __destruct()
{
echo "Destructing   :  ",$this->name,"....... <br>";
}
}
$dan=new Person("Dan");
echo "The name of your friend is :   ",$dan->get_name(), "<br>";

?>
</body>
</html>
