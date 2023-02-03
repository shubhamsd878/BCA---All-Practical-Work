class A extends Thread{
public void run(){
for(int i = 1; i<5; i++){
System.out.println("Display A");
}
System.out.println("exit A");

}
}

class B extends Thread{
public void run(){	
for(int i = 1; i<5; i++){
System.out.println("Display B");
}
System.out.println("exit B");

}

}

class _01_using_thread{
public static void main(String[] args){

A obj1 = new A();
B obj2 = new B();

obj1.start();
obj2.start();
}

}