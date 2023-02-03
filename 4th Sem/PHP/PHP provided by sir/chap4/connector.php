<html>
<head>
<title>Passing variable arguments to function </title>
</head>
<body>
<h1>Passing variable arguments to function</h1>

<?php

echo "Passing 'How' 'are' 'things?' to connector.....<br>";
echo  "Getting this result :";
connector("How","are","things?");

function connector()
{
$data = " " ;
$arguments=func_get_args();

for($loop1=0; $loop1< func_num_args() ; $loop1++)
{
$data .= $arguments[loop1]. " " ;
}
echo $data;
}
 
?>
</body>
</html>