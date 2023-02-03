<!-- Function g$GLOBALS instead of global program | Shubham Dahiya -->
<!DOCTYPE html>
<html>
<body>

<?php  
$num1 = 5;      //global variable  
$num2 = 13;     //global variable  
function global_var()  
{  
// IMPORTANT
$sum = $GLOBALS['num1'] + $GLOBALS['num2'];  
echo "Sum of global variables is: " .$sum;  
}  

global_var();  
?>  

</body>
</html>