public class _P01 {
public static void main(String[] args) {
int[] arr= {5, 6, 8, 9, 2};
try {
for (int i = 0; i < 7; i++) {
System.out.println("Value at: " + i + " is: " + arr[i]);
}
}

catch (Exception e) {
System.out.println("Exception => " + e.getMessage());
}
}
}
