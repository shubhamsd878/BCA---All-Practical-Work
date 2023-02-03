import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// <applet code="_06_List" height="200"width="500" > </applet>

public class _06_List extends Applet implements ActionListener {
List grocery, dev_field;
public void init(){
grocery = new List(5, true);
dev_field = new List(4, false );

grocery.add("apple");
grocery.add("Mango");
grocery.add("Grapes");
grocery.add("Banana");
grocery.add("Pineapple");
grocery.add("Strawberry");
grocery.add("Pulse");
grocery.add("Ladyfinger");
grocery.add("Potato");
grocery.add("Tomato");
grocery.select(2);

dev_field.add("Web Development");
dev_field.add("Android Development");
dev_field.add("iOS Development");
dev_field.select(0);

add(grocery);
add(dev_field);

grocery.addActionListener(this);
dev_field.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
repaint();
}

public void paint(Graphics g){
String gr = "Current selcted groceries are: ";

int idx[] = grocery.getSelectedIndexes();
for(int i:idx)
gr+=grocery.getItem(i) +",";


String f = "Currently selected dev_field ";
f += dev_field.getSelectedItem();

g.drawString(gr, 10, 100);
g.drawString(f, 10, 120);

}

}
