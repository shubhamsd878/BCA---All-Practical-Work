package _04_Inheritance;
// package Inheritance;

class Super_class {
int num = 20;

// display method of superclass
public void display() {
System.out.println("This is display method of superclass");
}
}

class Sub_class extends Super_class {
int num = 10;

// display method of sub class
public void display() {
System.out.println("This is display method of subclass");
}

public void my_method() {
// Instantiating subclass
Sub_class sub = new Sub_class();

// Invoking the display() method of sub class
sub.display();

// Invoking the display() method of superclass
super.display();

// printing the value of variable num of subclass
System.out.println("variable named num in sub class:"+ sub.num);

// printing the value of variable num of superclass
System.out.println("variable named num in super class:"+ super.num);
}
}

public class _04_super {
public static void main(String args[]) {
Sub_class obj = new Sub_class();
obj.my_method();
}
}
