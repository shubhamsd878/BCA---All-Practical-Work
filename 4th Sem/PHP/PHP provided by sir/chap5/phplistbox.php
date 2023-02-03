<html>
<head>
<title>Reading data with ListBoxes</title>
</head>
<body>
<h1>Reading data from listboxes</h1>
Your ice cream flavours:
<br>
<?php
foreach($_REQUEST["ice_cream"] as $flavour)
{
echo $flavour,"<br>";
}
?>
</body>
</html>