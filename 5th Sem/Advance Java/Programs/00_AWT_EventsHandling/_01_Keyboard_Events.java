import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="_01_Keyboard_Events" width="400" height="100" > </applet>
*/

// In case of Applet need to declare class Public else applet will not be able to access class
// KeyListener is from awt.event.KeyListener
public class _01_Keyboard_Events extends Applet implements KeyListener {

    String msg = "";

    // init is from java.applet.Applet
    public void init() {
        addKeyListener(this);
        requestFocus(); // *** what is this doing ***
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // showStatus was from java.applet.Applet
        showStatus(e.getKeyChar() + " key down");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        showStatus(e.getKeyChar() + " key up");
    }

    // repaint was from awt.Component.repaint
    @Override
    public void keyTyped(KeyEvent e) {
        // showStatus(e.getKeyChar() + " key typed");

        msg += e.getKeyChar();
        repaint();
    }

    // output text you typing
    public void paint(Graphics g) {
        g.drawString(msg, 10, 20);
    }

}