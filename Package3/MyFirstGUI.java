import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class MyFirstGUI {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("My First GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);

            JLabel label = new JLabel("Welcome to Java Swing!", JLabel.CENTER);

            frame.add(label);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
