public class _10_linearSearch {
public static int linearSearch(int[] arr, int element){    
for(int i=0;i<arr.length;i++){    
if(arr[i] == element){    
return i;    
}    
}    
return -1;    
}    
public static void main(String a[]){    
int[] a1= {100, 110,120, 130, 140, 150, 180};    
int element = 130;    
System.out.println(element +" is at index: " + linearSearch(a1, element));    
}  

}
