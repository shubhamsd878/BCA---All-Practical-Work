import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// <applet code="_04_Button" height="200"width="300" > </applet>

public class _04_Button extends Applet implements ActionListener {
Button b1, b2, b3;
String msg = "";
public void init(){
b1 = new Button("Shubham");
b2 = new Button("Dahiya");
b3 = new Button("HIM");

// adding to applet
add(b1);
add(b2);    
add(b3);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
msg = "you pressed " + e.getActionCommand();

showStatus("you pressed " + e.getActionCommand() );        
repaint();
}

public void paint(Graphics g){
g.drawString(msg, 10, 100);
}    
}