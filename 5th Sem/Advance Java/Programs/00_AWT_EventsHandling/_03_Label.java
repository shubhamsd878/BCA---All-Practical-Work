import java.awt.*;
import java.applet.*;

// <applet code="_03_Label" height="200"width="300" > </applet>
public class _03_Label extends Applet {
Label l1, l2, l3;
public void init(){
l1 = new Label("Shubham");
l2 = new Label("Dahiya");
l3 = new Label("HIM");

// adding to the window of applet
add(l1);
add(l2);
add(l3);
}

}