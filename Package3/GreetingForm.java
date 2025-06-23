import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreetingForm {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("Greeting Form");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(350, 150);
            frame.setLayout(new FlowLayout());

            JLabel label = new JLabel("Enter your name:");

            JTextField textField = new JTextField(20);

            JButton greetButton = new JButton("Greet");

            greetButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = textField.getText().trim();
                    if (!name.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please enter your name.");
                    }
                }
            });

            frame.add(label);
            frame.add(textField);
            frame.add(greetButton);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
