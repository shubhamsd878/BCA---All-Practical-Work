import javax.swing.*;

class _11_JLabel{
JFrame jframe;

_11_JLabel(){
jframe = new JFrame("My First Frame in Swing - Shubham");

jframe.setSize(300, 400);
jframe.setVisible(true);

JLabel label1 = new JLabel("Shubham Dahiya - 20012041042");

jframe.add(label1);
}

public static void main(String[] args){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new _11_JLabel();
}
});
}
}