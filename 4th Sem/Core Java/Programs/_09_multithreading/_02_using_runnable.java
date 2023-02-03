class A implements Runnable{
public void run(){
for(int i = 1; i<5; i++){
System.out.println("Display A");
}
System.out.println("exit A");

}
}

class B implements Runnable{
public void run(){	
for(int i = 1; i<5; i++){
System.out.println("Display B");
}
System.out.println("exit B");
}

}

class _02_using_runnable{
public static void main(String[] args){

Thread obj1 = new Thread (new A());
Thread obj2 = new Thread(new B());

obj1.start();
obj2.start();
}

}