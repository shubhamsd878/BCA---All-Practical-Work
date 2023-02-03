
class Parent {
public void sayHello() {
System.out.println("Hello from Parent");
}
}

class Child extends Parent {
@Override
public void sayHello() {
System.out.println("Hello from Child");
}
}

public class _01_Overriding {
public static void main(String[] args) {

// create an object of Child class
Child j1 = new Child();
j1.sayHello();

// create an object of Parent class
Parent l1 = new Parent();
l1.sayHello();
}
}
