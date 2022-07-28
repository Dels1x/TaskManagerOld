import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo extends JFrame {
    GridBagLayoutDemo() {
        GridBagConstraints gbc = new GridBagConstraints();

        this.setTitle("GridBagLayout Demo");
        this.setSize(new Dimension(500, 660));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());

        JButton tempButton;

        for(int i = 0; i < 5; i++) {
            tempButton = new JButton(String.valueOf(i));
            tempButton.setFocusable(false);
            gbc.gridx = i;
            gbc.gridy = i;

            if(i == 2) {
                gbc.gridheight = 5;
                gbc.fill = GridBagConstraints.VERTICAL;
            } else if (i == 3) {
                gbc.gridheight = 1;
            }

            this.add(tempButton, gbc);
        }

        this.setVisible(true);
    }
}
