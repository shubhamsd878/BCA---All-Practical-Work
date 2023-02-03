public class _P02_Arithmethic_Exception {
public static void main(String[] args) {
try {
// code that generates exception
int result = 5 / 0;
}

catch (ArithmeticException e) {
System.out.println("ArithmeticException => " + e.getMessage());
}

finally {
System.out.println("This is the finally block and always executed whether exception exit or not");
}
}
}
