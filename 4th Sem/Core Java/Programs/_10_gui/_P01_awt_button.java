// package _10_gui;
import java.awt.*;

class awtButton{
public awtButton()  
{  
Frame f = new Frame();  
Button btn=new Button("Hello World");  
btn.setBounds(80, 80, 100, 50);  
//adding Button.
f.add(btn);                               
//setting size of frame.
f.setSize(500, 250);        
// frame title
f.setTitle("Shubham");            
f.setLayout(null);  
f.setVisible(true);                   //set frame visibility true.  
}  
}
public class _P01_awt_button {
public static void main(String[] args) {  
awtButton awt = new awtButton();    //creating frame.  
}  
}
