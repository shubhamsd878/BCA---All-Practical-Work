import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="_02_Mouse_Events" height="200" width="400" ></applet> 
*/

public class _02_Mouse_Events extends Applet implements MouseListener, MouseMotionListener {

int X, Y;

public void init(){
addMouseListener(this);
addMouseMotionListener(this);
}

@Override
public void mouseClicked(MouseEvent e) {
showStatus("Mouse clicked");        
}

@Override
public void mouseEntered(MouseEvent e) {
showStatus("Mouse Entered");
}

@Override
public void mouseExited(MouseEvent e) {
showStatus("Mouse Exited");        
}

// *****  ?  *****
@Override
public void mousePressed(MouseEvent e) {
showStatus("Mouse Pressed");
}

@Override
public void mouseReleased(MouseEvent e) {
showStatus("Mouse Release");        
}

@Override
public void mouseDragged(MouseEvent e) {
showStatus("Mouse Dragged, e-> X:" + e.getX() + ", Y: " + e.getY());        
X = e.getX();
Y = e.getY();
repaint();
}

@Override
public void mouseMoved(MouseEvent e) {
showStatus("Mouse Moved");   
}

public void paint(Graphics g){
g.drawString(X +" "+ Y, X, Y);
}
}
