import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _12_JButton implements ActionListener {
JFrame jframe;
JButton btn1, btn2;
JLabel jLabel;
_12_JButton(){
jframe = new JFrame("JButton | Shubham");
jframe.setSize(500, 400);
jframe.setVisible(true);
jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

jframe.getContentPane().setLayout(new FlowLayout());

btn1 = new JButton("First Btn");
btn2 = new JButton("Second Btn");
btn1.addActionListener(this);
btn2.addActionListener(this);

btn1.setBounds(10, 20, 100, 40);
btn2.setBounds(40, 20, 100, 40);
btn2.setSize(50, 10);

jLabel = new JLabel("Press a button");
jframe.add(btn1);
jframe.add(btn2);
jframe.add(jLabel);
}

int a = 0, b = 0;

@Override
public void actionPerformed(ActionEvent e) {
if( e.getActionCommand().equals("First Btn")){
jLabel.setText(e.getActionCommand() + " is pressed " + a++ + " times");
}
if( e.getActionCommand().equals("Second Btn")){
jLabel.setText(e.getActionCommand() + " is pressed " + b++ + " times");
}
}

public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new _12_JButton();
}
});
}
}
