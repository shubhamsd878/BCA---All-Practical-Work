//calculate area of the circle using Interface class.

interface get{                     //creating interface get and declaring a method inside it.
void get_r(int r);
}

interface ar{                     //creating interface ar and declaring a method inside it.
void area();
}

class calc implements get,ar{       //importing interface using "implements" keyword.
final float pi=3.14f;

float r,ar;                                         

public void get_r(int r){
this.r= r;                               //for taking input from user.
}
public void area(){
ar=pi*r*r;                                     //calculating area using formula.
System.out.println("The area of circle is : " + ar);
}
}

class _02_multiple_inhertance{
public static void main(String args[]){
calc obj=new calc();            //creating object using derived class.
obj.get_r(4);                    //calling get_r function using object.
obj.area();                     //calling area function using object.

System.out.println("");

get obj1=new calc();           //creating object using the interface class.
obj1.get_r(6);               //calling get_r function using object but we can't call the other methods available in the calc because get interface has only get_r function.
}
}
