import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TaskManagerApp");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new TaskManagerApp().mainPanel);
        frame.pack();
        frame.setSize(500, 500);
    }
}