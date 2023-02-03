<html>
<head>
<title>Passing Array to Functions</title>
</head>
<body>
<h1>Passing Array to Functions</h1>
<?php
$scores=array(65,32,78,98,66);
averager($scores);

function averager($array)
{
$total=0;
foreach($array as $value)>0){
$total +=$value;

}

if (count($array)>0)
{
echo "The average was : ",$total/count($array);
}
else
{
echo "No elements to average!";

}
}

?>
</body>
</html>