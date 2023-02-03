<html>
<head>
<title>Using Form Arrays</title>
</head>
<body>
<h1>Using Form Arrays.</h1>
Your name is
<?php
$data=$_REQUEST['data'];
echo $data['name'], "<br>";
?>
Your favorite flavour is
<?php
$data=$_REQUEST['data'];
echo $data['flavor'],"<br>';
?> 
</body>
</html>
