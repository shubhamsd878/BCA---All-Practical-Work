class Pattern {

// method without parameter
public void display() {
for (int i = 0; i < 10; i++) {
System.out.print(".");
}
}

// method with single parameter
public void display(char symbol) {
for (int i = 0; i < 10; i++) {
System.out.print(symbol);
}
}
}

public class _02_Overloading {
public static void main(String[] args) {
Pattern d1 = new Pattern();

d1.display();
System.out.println();
d1.display('#');
}
}