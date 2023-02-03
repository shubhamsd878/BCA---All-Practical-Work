//method overloading by parameters

public class _01_overloading_by_parameters {
private static void display(int a){
System.out.println("Arguments: " + a);
}

private static void display(int a, int b){
System.out.println("Arguments: " + a + " and " + b);
}

public static void main(String[] args) {
display(1);
display(1, 4);
}

}
