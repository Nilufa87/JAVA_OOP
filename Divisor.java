import java.awt.*;
import java.awt.event.*;

public class Divisor extends Frame { 
    TextField tf1; 
    TextField tf2; 
    Label l1; 
    Button b;

    Divisor() { 
        setTitle("Divisor"); 
        setLayout(null);  // Using no layout managers
        
        // Initialize TextFields
        tf1 = new TextField(); 
        tf1.setBounds(100, 50, 85, 20);
        tf2 = new TextField(); 
        tf2.setBounds(100, 100, 85, 20); 
        
        // Initialize Button
        b = new Button("Divisor"); 
        b.setBounds(110, 150, 80, 40);  // Adjusted position for better layout
        
        // Initialize Label
        l1 = new Label(""); 
        l1.setBounds(100, 200, 220, 20);  // Adjusted position for visibility
        
        // Divisor components to the frame
        add(tf1); 
        add(tf2); 
        add(b); 
        add(l1); 
        
        // Frame settings
        setSize(300, 300); 
        setVisible(true); 

        // Add action listener for the button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                try {
                    int a = Integer.parseInt(tf1.getText());
                    int b = Integer.parseInt(tf2.getText()); 
                    int c = a / b; 
                    l1.setText("Their Divisor is = " + c); 
                } catch (NumberFormatException ex) {
                    l1.setText("Invalid input");
                }
            } 
        });
        
        // Window closing handler
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    } 

    public static void main(String[] args) { 
        new Divisor();
    } 
}
