import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// <applet code="_07_Checkbox" height="200"width="400" > </applet>

public class _07_Checkbox extends Applet implements ItemListener {
Checkbox apple, mango, grapes, banana;
public void init(){
apple = new Checkbox("apple");
mango = new Checkbox("mango");
grapes = new Checkbox("grapes", null, true);
banana = new Checkbox("banana");

add(apple);
add(mango);
add(grapes);
add(banana);

apple.addItemListener(this);
mango.addItemListener(this);
grapes.addItemListener(this);
banana.addItemListener(this);
}
@Override
public void itemStateChanged(ItemEvent e) {
repaint();
}

public void paint(Graphics g){
String ap = "apple: ";
ap += apple.getState();
g.drawString(ap, 10, 100);

String ma = "mango: ";
ma += mango.getState();
g.drawString(ma, 10, 115);

String gr = "grapes: ";
gr += grapes.getState();
g.drawString(gr, 10, 130);

String ba = "banana: ";
ba += banana.getState();
g.drawString(ba, 10, 145);
}    

}
