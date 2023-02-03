package _04_Inheritance;
// package Inheritance;
 
class A {
    public void printA() { System.out.println("Class A"); }
}
  
class B extends A {
    public void printB() { System.out.println("Class B"); }
}
  
class C extends A {
    public void printC() { System.out.println("Class C"); }
}
  
class D extends A {
    public void printD() { System.out.println("Class D"); }
}

public class _03_hierarchial {
    public static void main(String[] args)
    {
        B objB = new B();
        objB.printA();
        objB.printB();
  
        C objC = new C();
        objC.printA();
        objC.printC();
  
        D objD = new D();
        objD.printA();
        objD.printD();
    }
}
