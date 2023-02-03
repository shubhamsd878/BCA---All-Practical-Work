<html>
<head>
<title>Requiring Integer Input</title>
</head>
<body>
<h1>Requiring Integer Input</h1>
<?php
$error_array=array();
if(isset($_REQUEST["welcome_already_seen"]))
{
check_data();
if(count($error_array)!=0)
	{
		show_error();
		show_welcome();
	}
	else
		{
			handle_data();
		}
}
else
{
show_welcome();
}


#*****************functions*****************

function show_welcome()
{
echo "<form method='post'>";
echo "Please enter your age as an integer";
echo "<br>";
echo "<input name='number' type='text'>";
echo "<br>";
echo "<br>";
echo "<input type='submit'  value='Submit'>";
echo "<br>";
echo "<br>";
echo "<input type='hidden' name='welcome_already_seen' value='already_seen'>";
echo "</form>";
}
#*************function check_data()************ 

function check_data()
{
global $error_array;

if(strcmp($_REQUEST["number"],strval(intval($_REQUEST["number"]))))
	{
	$error_array[]="<font color='red'>Please enter an integer number</font>";
	}
}

#******************function show_error()***************
function show_error()
{
global $error_array;

foreach($error_array as $err)
{
echo $err,"<br>";
}

}
#*****************function handle_data()***************

function handle_data()
{
echo "Your age is";
echo $_REQUEST["number"];
}



?>
</body>
</html>