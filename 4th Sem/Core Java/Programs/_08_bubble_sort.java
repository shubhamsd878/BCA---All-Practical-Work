import java.util.*;
public class _08_bubble_sort {

static void bubbleSort(int arr[]) {
int size = arr.length;

for (int i = 0; i < size - 1; i++)    
for (int j = 0; j < size - i - 1; j++)
if (arr[j] > arr[j + 1]) {

int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;

}
}

public static void main(String args[]) {

int[] arr = { 25, 35, 34, 1, 0 };

// call method using class name
bubbleSort(arr);

System.out.println("Sorted Array in Ascending Order:");
for(int i = 0; i<arr.length ; i++){
System.out.println(arr[i] );
}
}
}
