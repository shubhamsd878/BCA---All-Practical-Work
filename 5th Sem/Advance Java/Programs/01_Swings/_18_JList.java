import javax.swing.*; 

public class _18_JList extends JFrame{
private JList<String> langages;

public _18_JList() 
{
//create the model and add elements
DefaultListModel<String> model = new DefaultListModel<>();
model.addElement("Java");
model.addElement("JEE");
model.addElement("Python");
model.addElement("C++");
model.addElement("C#");
model.addElement("Pascal");
model.addElement("Ruby");

//create the list of languages
langages = new JList<>(model);
add(langages);

this.setTitle("JList Example");  
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
this.setSize(200,200);
this.setLocationRelativeTo(null);
this.setVisible(true);
}

public static void main(String[] args) 
{
SwingUtilities.invokeLater(new Runnable() 
{
@Override
public void run() 
{
new _18_JList();
}
});
}       
}
