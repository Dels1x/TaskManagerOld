import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskManagerApp {
    private JButton completedButton;
    private JButton uncompletedButton;
    private JPanel switchPanelsPanel;
    JPanel mainPanel;
    private JPanel switchPanel;
    private JPanel uncompletedPanel;
    private JPanel completedPanel;
    private JLabel completedLabel;
    private JLabel uncompletedLabel;

    public TaskManagerApp() {
        completedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uncompletedPanel.setVisible(false);
                completedPanel.setVisible(true);
            }
        });
        uncompletedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uncompletedPanel.setVisible(true);
                completedPanel.setVisible(false);
            }
        });
    }
}
