import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class TaskManagerApp {

    LinkedList<JPanel> uncompletedTasks = new LinkedList<>();

    private JButton completedButton;
    private JButton uncompletedButton;
    private JPanel switchPanelsPanel;
    JPanel mainPanel;
    private JPanel switchPanel;
    private JPanel uncompletedPanel;
    private JPanel completedPanel;
    private JPanel functionalityPanel;
    private JButton addButton;

    public TaskManagerApp() {
        completedButton.addActionListener(e -> {
            uncompletedPanel.setVisible(false);
            completedPanel.setVisible(true);
        });
        uncompletedButton.addActionListener(e -> {
            uncompletedPanel.setVisible(true);
            completedPanel.setVisible(false);
        });
        addButton.addActionListener(e -> {
            JPanel taskPanel = new JPanel();
            taskPanel.setPreferredSize(new Dimension(500, 45));

            JButton completeButton = new JButton("Complete");
            JLabel taskName = new JLabel("Task " + (uncompletedTasks.size() + 1));
            JButton removeButton = new JButton("Remove");

            taskPanel.add(completeButton);
            taskPanel.add(taskName);
            taskPanel.add(removeButton);

            uncompletedPanel.add(taskPanel);
            uncompletedTasks.add(taskPanel);

            uncompletedPanel.revalidate();
            uncompletedPanel.repaint();
        });
    }
}
