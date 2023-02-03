<html>
<head>
<title>Using String Formating</title>
</head>
<body>
<h1>Using String Formating</h1>
<?Php
printf("I have %s pants and %s shirts.<br><br>",4,12);
$string=sprintf("After the sale I have %s pants and %s shirts.<br>",6,21);
echo $string,"<br>";
$price=2789.992;
echo "The price is ";
printf("\$%01.2f<br><br>",$price);
?>
</body>
</html>