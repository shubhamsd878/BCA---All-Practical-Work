import java.util.*;

public class _21_Stack {

public static void main(String[] args){
Stack<Integer> stack = new Stack();

stack.push(1);
stack.push(2);
stack.push(3);

stack.pop();

System.out.println("peek: " + stack.peek());
System.out.println("empty: " + stack.empty());
System.out.println("search 2: " + stack.search(2));
System.out.println("search 4: " + stack.search(4));

stack.pop();
stack.pop();
System.out.println("empty: " + stack.empty());

}
}
