import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// <applet code="_05_TextField" height="200"width="400" > </applet>

public class _05_TextField extends Applet implements ActionListener{
TextField name, password;
Label l1, l2;
String s1= "", s2 ="";
public void init(){
l1 = new Label("name", Label.LEFT);
l2 = new Label("password", Label.RIGHT);

name= new TextField(12);
password= new TextField(12);

add(l1);
add(name);
add(l2);
add(password);

name.addActionListener(this);
password.addActionListener(this);

}


@Override
public void actionPerformed(ActionEvent e) {
// s1 = "name:" + e.getActionCommand();
// s2 = "Password: " +e.getActionCommand();

s1 = "name: " + name.getText();
s2 = "password: " + password.getText();
repaint();
}


public void paint(Graphics g){
g.drawString(s1, 10, 100);
g.drawString(s2, 10, 120);
}
}