<!-- Function g$GLOBALS instead of global program | Shubham Dahiya -->
<!DOCTYPE html>
<html>
<body>

<?php  
    $x = 5;  
    echo "value of x: " .$x;  
    function mytest()  
    {  
        global $x;
        $x = 7;  
        echo "value of x: " .$x;  
    }  
    mytest();  
    echo "value of x: " .$x;  

?> 

</body>
</html>