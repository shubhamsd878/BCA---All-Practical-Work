import java.util.*;

public class _22_HashSet {
public static void main(String[] args) {
// Hashset Declaratin and creating object.
Set<String> hashSet = new HashSet<String>();

// Adding elements to it
hashSet.add("White");
hashSet.add("Pink");
hashSet.add("Blue");
hashSet.add("Green");
hashSet.add("Yellow");

// Adding duplicates
hashSet.add("White");
hashSet.add("White");
hashSet.add("White");
hashSet.add("Yellow");

// Iterating HashSet to print its values.

Iterator<String> it = hashSet.iterator();

while (it.hasNext()) {
System.out.println(it.next());
}
}
}
