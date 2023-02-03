<html>
<head>
<title>Persisting User data</title>
</head>
<body>
<h1>Persisting User Data</h1>
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
$first_name=isset($_REQUEST["first"])? $_REQUEST["first"] : "";
$last_name=isset($_REQUEST["last"])? $_REQUEST["last"] : "";
echo "<form method='post'>";
echo "Enter your First Name: ";
echo "<input name='first' type='text' value=' " , $first_name ," '>";
echo "<br>";
echo "<br>";
echo "Enter your Last Name: ";
echo "<input name='last' type='text' value=' " , $last_name, " '>";
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

if($_REQUEST["first"]=="")
	{
	$error_array[]="<font color='red'>Enter your First Name</font>";
	}
if($_REQUEST["last"]=="")
	{
	$error_array[]="<font color='red'>Enter your Last Name</font>";
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
echo "Here is your First Name    :   ";
echo $_REQUEST["first"];
echo "<br>Here is your Last Name    :   ";
echo $_REQUEST["last"];

}



?>
</body>
</html>