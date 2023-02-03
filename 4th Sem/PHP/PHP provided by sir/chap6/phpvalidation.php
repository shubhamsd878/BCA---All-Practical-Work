<html>
<head>
<title>Checking Required Data</title>
</head>
<body>
<h1>Checking Required  Data<h1>

<?php
$errors_array=array();

if(isset($_REQUEST["welcome_already_seen"]))
{

check_data();
if(count($errors_array)!=0)
	{
show_errors();
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


function show_welcome()
{
echo "<form  method='post'>";
echo "What's your favourite ice cream flavor?";
echo "<br>";
echo "<input type='text' name='flavor'>";
echo "<br>";
echo "<br>";
echo "<input type='submit'  value='submit'> ";
echo "<input type='hidden'  name='welcome_already_seen' value='already_seen'>";
echo  "</form>";
}

function check_data()
{
global $errors_array;
if($_REQUEST["flavor"]=="")
	{
$errors_array[]="<font color='red' >Please enter your flavor</font>";

	}
}


function  show_errors()
{
global $errors_array;
foreach($errors_array as $err)
		{
echo $err,"<br>";
	}
}

function handle_data()
{
echo "Your favourite ice creamflavour is :";
echo $_REQUEST["flavor"];
}  


?>

</body>
</html>