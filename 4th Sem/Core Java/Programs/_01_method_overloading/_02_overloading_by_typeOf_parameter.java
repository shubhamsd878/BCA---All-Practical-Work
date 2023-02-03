
public class _02_overloading_by_typeOf_parameter {
// this method accepts int
private static void display(int a){
System.out.println("Integer data.");
}

// this method accepts String object
private static void display(String a){
System.out.println("String object.");
}

public static void main(String[] args) {
display(1);
display("Hello");
}

}
