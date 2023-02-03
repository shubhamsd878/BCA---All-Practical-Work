import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _16_JToggleButton extends JFrame implements ItemListener{
private JToggleButton btn;
public _16_JToggleButton(){

setTitle("JToggleButton Example");
setLayout(new FlowLayout());
setJToggleButton();
setAction();
setSize(200, 100);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

private void setJToggleButton() {
btn = new JToggleButton("Deselected");
add(btn);
}
private void setAction() {
btn.addItemListener(this);
}
public void itemStateChanged(ItemEvent eve) {
if (btn.isSelected())
btn.setText("Selected");
else
btn.setText("Deselected");
}

public static void main(String[] args) {
new _16_JToggleButton();
}
}
