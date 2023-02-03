<html>
<head>
<title>Reading Data from password controls.</title>
</head>
<body>
<h1>Reading Data from password controls.</h1>

<?php
if($_REQUEST["password"]=="ajaybajaj"){

?>

<h2>Password accepted:</h2>

OK, you are in.<br>

Please act responsibility.

<?php
}
else{
?>

<h2>
Password Denied:
</h2>
You did not enyter the correct password.<br>
What are you,some hind of hacker?

<?php
}
?>

</body>
</html>