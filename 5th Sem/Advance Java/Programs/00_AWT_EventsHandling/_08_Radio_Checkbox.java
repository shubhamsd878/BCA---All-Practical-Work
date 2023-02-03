import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// <applet code="_08_Radio_Checkbox" height="200"width="500" > </applet>


public class _08_Radio_Checkbox extends Applet implements ItemListener{
Checkbox apple, mango, grapes, banana;
CheckboxGroup group;
public void init(){

group = new CheckboxGroup();

apple = new Checkbox("apple", group, false);
mango = new Checkbox("mango", group, false);
grapes = new Checkbox("grapes", group, true);
banana = new Checkbox("banana", group, false);

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
String str = "currently selected: ";
str += group.getSelectedCheckbox().getLabel();

g.drawString(str, 10, 100);
}

}
