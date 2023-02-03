<html>
<head>
<title>Handling HTML inuser Input</title>
</head>
<body>
<h1>Handling HTML in user input</h1>
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
echo "What is your  favourite ice cream flavour?";
echo "<br>";
echo "<input name='flavor' type='text'>";
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

if($_REQUEST["flavor"]=="")
	{
	$error_array[]="<font color='red'>Enter your  favoutite flavor .</font>";
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
echo "Your favourite flavor  is :   ";
#$ok_text=htmlentities($_REQUEST["flavor"]);
$ok_text=strip_tags($_REQUEST["flavor"]);
echo $ok_text;
}



?>
</body>
</html>