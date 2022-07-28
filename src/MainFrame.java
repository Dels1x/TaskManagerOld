import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame() {
        Font font1 = new Font("Consolas", Font.PLAIN, 32);
        this.setTitle("Task Manager");
        this.setSize(new Dimension(500, 660));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());


        JPanel switchPanelsPanel = new JPanel(new GridLayout());

        JButton completedButton = new JButton("Completed");
        JButton uncompletedButton = new JButton("Uncompleted");

        completedButton.setFont(font1);
        completedButton.setFocusable(false);

        uncompletedButton.setFont(font1);
        uncompletedButton.setFocusable(false);

        switchPanelsPanel.setPreferredSize(new Dimension(500, 60));
        switchPanelsPanel.add(completedButton);
        switchPanelsPanel.add(uncompletedButton);

        this.add(switchPanelsPanel);
        this.setVisible(true);
    }
}
