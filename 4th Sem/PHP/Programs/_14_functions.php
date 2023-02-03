<!-- Function global_variable program | Shubham Dahiya -->
<!DOCTYPE html>
<html>
<body>

<?php  
$name = "Shubham Dahiya";        //Global Variable  
function global_var()  
{  
global $name;       //can't access name without declaring like this inside function 
echo "Variable inside the function: ". $name;  
echo "</br>";  
}  
global_var();  
echo "Variable outside the function: ". $name;  
?>  

</body>
</html>