import java.awt.*;
import java.awt.event.*;
import java.applet.*;;

// <applet code="_10_Textarea" height="250"width="500" > </applet>

public class _10_Textarea extends Applet implements TextListener{
TextArea a;
public void init(){
a = new TextArea("Hello start with this");
a.setColumns(27);
a.setRows(5);

add(a);
a.addTextListener(this);

} 

@Override
public void textValueChanged(TextEvent e) {
repaint();        
}

public void paint(Graphics g){
String s = a.getText();
g.drawString(s, 10, 200);
}

}
