import javax.swing.JFrame; 
import javax.swing.JButton; 
import javax.swing.JTextField;
import java.awt.Container; 
import java.awt.Dimension; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 


public class Calculator extends JFrame{

    JTextField input1 = new JTextField(); 
    JTextField input2 = new JTextField(); 
    public static void main(String[] args){
        new Calculator().display(); 
    }
    private void display(){
        setSize(new Dimension(400,200)); 
        Container c = getContentPane(); 
        c.setLayout(null);

        input1.setBounds(100,40,10,10); 
        input2.setBounds(100,100,20,5);


        c.add(input1); 
        c.add(input2);
        setVisible(true);
    }

    //Arithmetic 
    public static float Addition(float x, float y){
        float z = x + y; 
        return z; 
    }
    public static float Subtraction(float x, float y){
        float z = x - y; 
        return z; 
    }
    public static float Multiplication(float x, float y){
        float z = x * y; 
        return z; 
    }
    public static float Division(float x, float y){
        float z = x / y; 
        return z; 
    }
}