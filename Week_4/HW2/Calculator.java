import javax.swing.JFrame; 
import javax.swing.JButton; 
import javax.swing.JTextField;
import java.awt.Container; 
import java.awt.Dimension; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 


public class Calculator extends JFrame{

    public static void main(String[] args){
        new Calculator().display(); 
    }
    private void display(){
        setSize(new Dimension(400,200)); 
        Container c = getContentPane(); 
        c.setLayout(null);

        inputTextBox goat = inputTextBox(goat);
        setVisible(true);
    }
    private void inputTextBox(JTextField name){
        name = new JTextField(); 
        name.setBounds(100,40,100,20); 
    }
}