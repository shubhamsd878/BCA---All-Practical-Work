package _04_Inheritance;
// package Inheritance;

class Add_Sub {
int result;

public void addition(int a, int b) {
result = a + b;
System.out.println("sum of numbers:" + result);
}

public void Subtraction(int a, int b) {
result = a - b;
System.out.println("difference between numbers:" + result);
}
}

//inherited class
class Add_Sub_Mul extends Add_Sub {
public void multiplication(int a, int b) {
result = a * b;
System.out.println("product of numbers:" + result);
}
}

public class _01_single_inheritance {

public static void main(String args[]) {
int a = 15, b = 10;
Add_Sub_Mul obj = new Add_Sub_Mul();
obj.addition(a, b);
obj.Subtraction(a, b);
obj.multiplication(a, b);
}
}
