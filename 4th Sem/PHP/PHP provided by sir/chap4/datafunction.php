<html>
<head>
<title>
Passing Data to Functions
</title>
</head>
<body>
<h1>Passing data to Functions</h1>
<?php
echo  "About to call the Function......<br>";
echo "calling the Function.......<br>";
display("Hello","There");
function display($greeting,$message)
{
echo $greeting;
echo $message;


}

?>
</body>
</html>