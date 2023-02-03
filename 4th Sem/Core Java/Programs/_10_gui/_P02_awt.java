import java.awt.*;
class Awt extends Frame{
Awt(){  
Label f_name = new Label("First Name");  
f_name.setBounds(20, 50, 80, 20);  

Label l_name = new Label("Last Name");  
l_name.setBounds(20, 80, 80, 20);  

Label dob = new Label("Date of Birth");  
dob.setBounds(20, 110, 80, 20);  

TextField f_ameTF = new TextField();  
f_ameTF.setBounds(120, 50, 100, 20);  

TextField l_NameTF = new TextField();  
l_NameTF.setBounds(120, 80, 100, 20);  

TextField dobTF = new TextField();  
dobTF.setBounds(120, 110, 100, 20);  

Button sbmt = new Button("Submit");  
sbmt.setBounds(20, 160, 100, 30);  

Button reset = new Button("Reset");  
reset.setBounds(120,160,100,30);  

add(f_name);  
add(l_name);  
add(dob);  
add(f_ameTF);  
add(l_NameTF);  
add(dobTF);  
add(sbmt);  
add(reset);  

setSize(300,200);  
setLayout(null);  
setVisible(true);  
}  
}
public class _P02_awt extends Frame {
public static void main(String[] args) {  
Awt awt = new Awt();    
}  
}
