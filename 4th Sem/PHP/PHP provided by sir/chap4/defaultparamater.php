<html>
<head>
<title>Passing default Parameter to function </title>
</head>
<body>
<h1>Passing default Parameter to function</h1>
<?php

echo "About to call the function......<br>";

echo "Passing data to the function.....<br>";

display("The default argument is :   ");

function display($greeting,$message="Hello There!")
{
echo $greeting;
echo $message;

}
 
?>
</body>
<html>