import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class _01_JButton extends JFrame
{

_01_JButton()
{
// Button.
JButton bt1 = new JButton("Shubham Dahiya");             
//adding close operation --> Monica mam way
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
setLayout(new FlowLayout());          //setting layout using FlowLayout object
setSize(400, 100);          // size of Jframe
//adding button to frame
add(bt1);               

setVisible(true);
}
public static void main(String[] args)
{
new _01_JButton();
}
}