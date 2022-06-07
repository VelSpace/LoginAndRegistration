import javax.swing.*;
import java.awt.*;

public class WelcomePage extends JFrame {
    JLabel welcomeLabel = new JLabel();

    WelcomePage(String userId){

        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font("Times New Roman",Font.PLAIN,25));
        welcomeLabel.setText("Hello " + userId);


        this.add(welcomeLabel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        this.setVisible(true);
    }
}
