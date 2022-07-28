import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    private JButton clickHereButton;
    private JPanel panelMain;
    private JPanel landingPanel;
    private JPanel homePanel;
    private JLabel welcomeLabel;
    private JButton enterButton;
    private JButton backButton;
    private JButton goButton;

    public App() {

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                landingPanel.setVisible(false);
                homePanel.setVisible(true);
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                landingPanel.setVisible(true);
                homePanel.setVisible(false);
            }
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
