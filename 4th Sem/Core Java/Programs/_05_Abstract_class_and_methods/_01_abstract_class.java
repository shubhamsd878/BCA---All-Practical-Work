// package _05_Abstract_class_and_methods;

abstract class abstractClass {

// method of abstract class
public void display() {
System.out.println("This is Java Programming from method defined in abstract class");
}
}

class subclass extends abstractClass {

public subclass() {
display();
}
}

public class _01_abstract_class {
public static void main(String[] args) {
subclass obj = new subclass();
}
}
