import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame() {
        this.setTitle("Task Manager");
        this.setSize(new Dimension(500, 660));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        this.setVisible(true);
    }
}
