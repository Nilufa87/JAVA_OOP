import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StringWordCounter extends JFrame {
    private JTextField inputField;
    private JLabel charCountLabel;
    private JLabel wordCountLabel;
    private JButton countButton;

    public StringWordCounter() {
        setTitle("String and Word Counter");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputField = new JTextField(20);
        charCountLabel = new JLabel("Character Count: 0");
        wordCountLabel = new JLabel("Word Count: 0");
        countButton = new JButton("Count");

        add(new JLabel("Enter text:"));
        add(inputField);
        add(countButton);
        add(charCountLabel);
        add(wordCountLabel);

        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = inputField.getText();
                int charCount = text.length();
                String[] words = text.trim().split("\\s+");
                int wordCount = text.trim().isEmpty() ? 0 : words.length;

                charCountLabel.setText("Character Count: " + charCount);
                wordCountLabel.setText("Word Count: " + wordCount);
            }
        });

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StringWordCounter();
    }
}
