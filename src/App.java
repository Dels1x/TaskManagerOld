import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    int i = 0;
    private JButton clickHereButton;
    private JPanel panelMain;
    private JScrollBar scrollBar1;

    public App() {
        clickHereButton.addActionListener(e -> {
            i++;
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new App().panelMain);
        frame.pack();
        frame.setSize(500, 500);
    }
}
