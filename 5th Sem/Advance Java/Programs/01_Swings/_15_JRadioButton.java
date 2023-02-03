import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class _15_JRadioButton extends JFrame
{
public _15_JRadioButton()
{
//creating JRadioButton.
JRadioButton jcb = new JRadioButton("A.");	
//adding JRadioButton to frame.
add(jcb);					

jcb = new JRadioButton("B.");			
add(jcb);					

jcb = new JRadioButton("C.");
add(jcb);					

jcb = new JRadioButton("D.");
add(jcb);

setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(400, 100);
setVisible(true);
}
public static void main(String[] args)
{
new _15_JRadioButton();
}
}
