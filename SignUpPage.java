import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpPage extends JFrame implements ActionListener {

    private JLabel FirstName;
    private JTextField firstName;

    private JLabel LastName;
    private JTextField lastName;

    private JLabel Email;
    private JTextField email;

    private JLabel UserName;
    private JTextField userName;

    private JLabel MobileNumber;
    private JTextField mobileNumber;

    private JLabel Password;
    private JTextField password;

    private JButton saveButton = new JButton("Register");


    SignUpPage(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450,190,1014,597);
        this.setResizable(true);

        //set location for title label
        JLabel title = new JLabel("New User Registration");
        title.setFont(new Font("Times New Roman", Font.BOLD, 25));
        title.setForeground(new Color(50,30,5));
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.LIGHT_GRAY);
        titlePanel.add(title);  // adds to center of panel's default BorderLayout.
        titlePanel.setBounds(362,52,325,50);
        titlePanel.setOpaque(true);

        // create textfield for user name
        FirstName = new JLabel("First Name");
        firstName = new JTextField();
        FirstName.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        FirstName.setBounds(70,130,300,50);
        firstName.setBounds(180,130,300,50);
        this.add(firstName);
        this.add(FirstName);

        // create textfield for userName
        FirstName = new JLabel("Username");
        firstName = new JTextField();
        FirstName.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        FirstName.setBounds(70,130,300,50);
        firstName.setBounds(180,130,300,50);
        this.add(firstName);
        this.add(FirstName);


        this.add(titlePanel);
        this.setLayout(null);
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
