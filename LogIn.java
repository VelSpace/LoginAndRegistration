import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Objects;

public class LogIn extends JFrame implements ActionListener {

    HashMap<String,String> logInInfo;

    //create login button
    JButton loginButton = new JButton("LogIn");

    // create reset button
    JButton resetButton = new JButton("Reset");

    // create new register button
   JButton newUserButton = new JButton("SignUp");


    // create text fields for userID
    JTextField userIDField = new JTextField();
    // create password text field
    JPasswordField userPassWordFiled = new JPasswordField();

    // create labels for both user and password fields
    JLabel userIDLabel = new JLabel("Username");
    JLabel userPassWordLabel = new JLabel("Password");
    JLabel messageLabel = new JLabel();
    LogIn(HashMap<String,String> logInfoOriginal){
        logInInfo = logInfoOriginal;

        // add all labels
        userIDLabel.setBounds(50,100,75,25);
        this.add(userIDLabel);

        userPassWordLabel.setBounds(50,150,75,25);
        this.add(userPassWordLabel);

        messageLabel.setBounds(125,250,250,35);
        this.add(messageLabel);

        // add all textFields
        userIDField.setBounds(125,100,200,25);
        this.add(userIDField);

        userPassWordFiled.setBounds(125,150,200,25);
        this.add(userPassWordFiled);

        // add login and reset button
        loginButton.setBounds(125,200,95,25);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);
        this.add(loginButton);

        resetButton.setBounds(230,200,95,25);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);
        this.add(resetButton);

        //add new registration button
        newUserButton.setBounds(180,230,95,25);
        newUserButton.addActionListener(this);
        newUserButton.setFocusable(false);
        this.add(newUserButton);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == newUserButton){
            this.dispose();
            SignUpPage signUpPage = new SignUpPage();
        }
        if(e.getSource() == resetButton){
            userIDField.setText("");
            userPassWordFiled.setText("");
        }
        if(e.getSource() == loginButton){
            String userId = userIDField.getText();
            String password = String.valueOf(userPassWordFiled.getText());
            if(logInInfo.containsKey(userId) && Objects.equals(logInInfo.get(userId), password)){
                messageLabel.setForeground(Color.BLUE);
                messageLabel.setText("LoggedIn Successfully");
                this.dispose();
                //WelcomePage welcomePage = new WelcomePage(userId);
            }
            else if(!logInInfo.containsKey(userId)){
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Username is Incorrect");
            }
            else {
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Password is Incorrect");
            }
        }
    }
}
