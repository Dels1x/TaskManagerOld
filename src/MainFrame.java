import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class MainFrame extends JFrame implements ActionListener {

    LinkedList<JPanel> tasks = new LinkedList<>();

    JPanel completedPanel;
    JPanel uncompletedPanel;

    JButton completedButton;
    JButton uncompletedButton;
    JButton addButton;

    ImageIcon checkmarkIcon = new ImageIcon("src/Images/check-mark.png");
    ImageIcon deleteIcon = new ImageIcon("src/Images/delete.png");

    MainFrame() {
        Font font1 = new Font("Consolas", Font.PLAIN, 32);
        this.setTitle("Task Manager");
        this.setSize(new Dimension(500, 660));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        this.getContentPane().setBackground(new Color(0x222222));

        // Switch Panels Panel

        JPanel switchPanelsPanel = new JPanel(new GridLayout());

        completedButton = new JButton("Completed");
        uncompletedButton = new JButton("Uncompleted");

        completedButton.setFont(font1);
        completedButton.setFocusable(false);
        completedButton.addActionListener(this);
        completedButton.setBackground(new Color(0x222222));
        completedButton.setForeground(Color.white);

        uncompletedButton.setFont(font1);
        uncompletedButton.setFocusable(false);
        uncompletedButton.addActionListener(this);
        uncompletedButton.setBackground(new Color(0x222222));
        uncompletedButton.setForeground(Color.white);

        switchPanelsPanel.setPreferredSize(new Dimension(500, 60));
        switchPanelsPanel.add(completedButton);
        switchPanelsPanel.add(uncompletedButton);

        // Switch Panel

        JPanel switchPanel = new JPanel(new CardLayout());
        switchPanel.setPreferredSize(new Dimension(500, 516));

        // Uncompleted Tasks Panel

        uncompletedPanel = new JPanel(new FlowLayout());
        uncompletedPanel.setBackground(new Color(0x111111));

        switchPanel.add(uncompletedPanel);

        // Completed Tasks Panel

        completedPanel = new JPanel(new FlowLayout());
        completedPanel.setVisible(false);
        completedPanel.setBackground(new Color(0x111111));

        switchPanel.add(completedPanel);

        // Functionality Panel

        JPanel functionalityPanel = new JPanel(new FlowLayout());

        addButton = new JButton("Add");
        addButton.addActionListener(this);

        functionalityPanel.add(addButton);

        this.add(switchPanelsPanel);
        this.add(switchPanel);
        this.add(functionalityPanel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(completedButton)) {
            uncompletedPanel.setVisible(false);
            completedPanel.setVisible(true);
        }
        else if(e.getSource().equals(uncompletedButton)) {
            completedPanel.setVisible(false);
            uncompletedPanel.setVisible(true);
        }
        else if(e.getSource().equals(addButton)) {
            tasks.add(new JPanel());
            tasks.get(tasks.size()-1).setPreferredSize(new Dimension(500, 50));
            tasks.get(tasks.size()-1).setBackground(new Color(0x222222));

            JButton completeButton = new JButton("Complete");
            JLabel label = new JLabel("New Task");
            JButton deleteButton = new JButton("Delete");

            completeButton.setIcon(checkmarkIcon);
            completeButton.setFocusable(false);
            completeButton.setBackground(new Color(0x222222));
            completeButton.setForeground(Color.white);
            completeButton.addActionListener(this);

            deleteButton.setIcon(deleteIcon);
            deleteButton.setFocusable(false);
            deleteButton.setBackground(new Color(0x222222));
            deleteButton.setForeground(Color.white);
            deleteButton.addActionListener(this);

            label.setForeground(Color.white);
            label.setFont(new Font("Consolas", Font.PLAIN, 20));

            tasks.get(tasks.size()-1).add(completeButton);
            tasks.get(tasks.size()-1).add(label);
            tasks.get(tasks.size()-1).add(deleteButton);
            uncompletedPanel.add(tasks.get(tasks.size()-1));
            uncompletedPanel.revalidate();
            uncompletedPanel.repaint();

            System.out.println("lol");
        }
    }
}
