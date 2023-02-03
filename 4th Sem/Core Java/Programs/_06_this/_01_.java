// package _06_this;

class C1 {

int age;
C1(int age){
this.age = age;
}
}
public class _01_ {
public static void main(String[] args) {
C1 obj = new C1(8);
System.out.println("obj.age = " + obj.age);
}
}
