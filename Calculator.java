import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    // Components of the Calculator
    private JTextField number1Field, number2Field, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    // Constructor to set up the GUI
    public Calculator() {
        // Frame setup
        setTitle("Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Labels and TextFields
        add(new JLabel("Number 1:"));
        number1Field = new JTextField();
        add(number1Field);

        add(new JLabel("Number 2:"));
        number2Field = new JTextField();
        add(number2Field);

        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        // Buttons
        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
    }

    // Action performed method to handle button clicks
    public void actionPerformed(ActionEvent e) {
        try {
            // Get numbers from the text fields
            double number1 = Double.parseDouble(number1Field.getText());
            double number2 = Double.parseDouble(number2Field.getText());
            double result = 0;

            // Determine which button was clicked and perform the operation
            if (e.getSource() == addButton) {
                result = number1 + number2;
            } else if (e.getSource() == subtractButton) {
                result = number1 - number2;
            } else if (e.getSource() == multiplyButton) {
                result = number1 * number2;
            } else if (e.getSource() == divideButton) {
                result = number1 / number2;
            }

            // Display the result in the result text field
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        } catch (ArithmeticException ex) {
            resultField.setText("Error");
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }
}
