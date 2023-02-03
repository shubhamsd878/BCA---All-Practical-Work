import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// <applet code="_09_scroll" height="300"width="300" > </applet>

public class _09_scroll extends Applet implements AdjustmentListener {
Scrollbar hsb, vsb;
int x = 0, y = 0;
public void init(){
vsb = new Scrollbar(Scrollbar.VERTICAL,0, 70, 0, 300);
hsb = new Scrollbar(Scrollbar.HORIZONTAL,0, 70, 0, 300);

vsb.setBounds(300, 300, 500, 300);
hsb.setBounds(300, 300, 500, 300);

add(hsb);
add(vsb);

vsb.addAdjustmentListener(this);
hsb.addAdjustmentListener(this);
}
@Override
public void adjustmentValueChanged(AdjustmentEvent e) {
// if( e.get)
// x = e.getValue();
repaint();        
}

public void paint(Graphics g){
x = hsb.getValue();
y = vsb.getValue();
showStatus(x + " " + y);

g.drawString("*", x, y);
}

}
