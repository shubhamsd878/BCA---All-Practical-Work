interface printable{  
void print();  
}  
class Subclass implements printable{  
public void print(){System.out.println("Hello from subclass defined method inherited from interface");}  
}  
public class _01 {
public static void main(String args[]){  
Subclass obj = new Subclass();  
obj.print();  
}  
}
