import javax.swing.*;  
import java.awt.event.*;  

public class TextFieldExample implements ActionListener {  
    JTextField tf1, tf2, tf3;  
    JButton b1, b2;  

    TextFieldExample() {  
        JFrame f = new JFrame("Simple Calculator");  
        
        // Initialize text fields
        tf1 = new JTextField();  
        tf1.setBounds(50, 50, 150, 20);  
        tf2 = new JTextField();  
        tf2.setBounds(50, 100, 150, 20);  
        tf3 = new JTextField();  
        tf3.setBounds(50, 150, 150, 20);  
        tf3.setEditable(false);  // Make tf3 non-editable
        
        // Initialize buttons
        b1 = new JButton("+");  
        b1.setBounds(50, 200, 50, 50);  
        b2 = new JButton("-");  
        b2.setBounds(120, 200, 50, 50);  
        
        // Add action listeners to buttons
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        
        // Add components to the frame
        f.add(tf1); 
        f.add(tf2); 
        f.add(tf3); 
        f.add(b1); 
        f.add(b2);  
        
        // Frame settings
        f.setSize(300, 300);  
        f.setLayout(null);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the application on window close
        f.setVisible(true);  
    }         
    
    public void actionPerformed(ActionEvent e) {  
        try {
            String s1 = tf1.getText();  
            String s2 = tf2.getText();  
            
            // Parse integers from text fields
            int a = Integer.parseInt(s1);  
            int b = Integer.parseInt(s2);  
            int c = 0;  
            
            // Perform addition or subtraction based on button pressed
            if (e.getSource() == b1) {  
                c = a + b;  
            } else if (e.getSource() == b2) {  
                c = a - b;  
            }  
            
            // Set the result in tf3
            tf3.setText(String.valueOf(c));  
        } catch (NumberFormatException ex) {
            tf3.setText("Invalid input");
        }
    }  
    
    public static void main(String[] args) {  
        new TextFieldExample();  
    } 
}
