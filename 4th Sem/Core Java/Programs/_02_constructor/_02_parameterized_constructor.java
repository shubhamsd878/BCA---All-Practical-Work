// package _02_constructor;

class Main {

String name;

// constructor accepting single value
Main(String n) {
name = n;
System.out.println("Hello " + name);
}
}

public class _02_parameterized_constructor {

public static void main(String[] args) {

// call constructor by passing a single value
Main obj1 = new Main("Shubham ");
Main obj2 = new Main("Java");
Main obj3 = new Main("World");
}
}
