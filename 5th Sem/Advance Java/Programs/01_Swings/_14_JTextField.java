import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class _14_JTextField extends JFrame
{
public _14_JTextField()
{
//creating JTextField.  
JTextField jtf = new JTextField(20);  
//adding JTextField to frame.
add(jtf);                        
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(400, 100);
setVisible(true);
}
public static void main(String[] args)
{
new _14_JTextField();
}
}
