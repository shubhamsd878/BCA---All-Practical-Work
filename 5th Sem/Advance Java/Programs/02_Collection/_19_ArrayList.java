import java.util.ArrayList;
public class _19_ArrayList {
public static void main(String args[]) {
ArrayList<Integer> arrlist1 = new ArrayList<Integer>(5);

//add​(E e)
arrlist1.add(12);
arrlist1.add(20);
arrlist1.add(45);
System.out.println("Printing list1:"+arrlist1);
ArrayList<Integer> arrlist2 = new ArrayList<Integer>(5);
arrlist2.add(25);
arrlist2.add(30);
arrlist2.add(31);
System.out.println("\nPrinting list2:"+arrlist2);

//addAll​(int index, Collection<? extends E> c)
arrlist1.addAll(arrlist2);
System.out.println("\nPrinting all the elements"+arrlist1);  

//contains​(Object o)
System.out.print("\nIs 30 present in the arraylist: ");
System.out.println(arrlist1.contains(30));

// indexOf​(Object o)
int pos =arrlist1.indexOf(45);
System.out.println("\nThe element 45 is at index : " + pos);

//isEmpty()
System.out.println("\nIs ArrayList Empty: "+arrlist1.isEmpty());      
}
}    

