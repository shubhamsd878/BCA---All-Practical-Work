import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class _03_JCheckBox extends JFrame
{
public _03_JCheckBox()
{
//creating JCheckBox.
JCheckBox jcb = new JCheckBox("First");   
//adding JCheckBox to frame.
add(jcb);               

jcb = new JCheckBox("Second");        
add(jcb);                               

jcb = new JCheckBox("Dahiya");     
add(jcb);                               

setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(400, 100);
setVisible(true);
}
public static void main(String[] args)
{
new _03_JCheckBox();
}
}
