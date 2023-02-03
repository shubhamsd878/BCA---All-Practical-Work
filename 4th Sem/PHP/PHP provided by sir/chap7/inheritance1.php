<html>
<head>
<title>Inheriting with constructor</title>
</head>
<body>
<h1>Inheriting with constructor</h1>
<?php

class Person
{
var $name;

 function __construct($data)
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

class Friend extends Person
{
var $message;
function __construct($data,$msg)
{
parent::__construct($data);
$this->message=$msg;
}
function speak()
{
echo $this->message;
}

}

$nancy=new Friend("Nancy","Hi,Nancy here.");

echo "The name of your friend is ", $nancy->get_name(), ".<br>";
echo  $nancy->get_name() ,"says  \" ", $nancy->speak(),  " \  "<br>";

?>
</body>
</html>
