import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginPage {
    public static void main(String args[]){
        JFrame f = new JFrame("Login Page");
        f.setSize(400,300);
        f.setLayout(null);
         // Create JLabel for username and password
         JLabel usernameLabel = new JLabel("Username:");
         usernameLabel.setBounds(50, 50, 100, 30);
         f.add(usernameLabel);
 
         JLabel passwordLabel = new JLabel("Password:");
         passwordLabel.setBounds(50, 100, 100, 30);
         f.add(passwordLabel);

         // Create JTextField for username
        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 50, 150, 30);
        f.add(usernameField);

        // Create JPasswordField for password
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 150, 30);
        f.add(passwordField);

         // Create JButton for login
         JButton loginButton = new JButton("Login");
         loginButton.setBounds(150, 150, 100, 30);
         f.add(loginButton);
 
         // JLabel to display message
         JLabel messageLabel = new JLabel();
         messageLabel.setBounds(50, 200, 300, 30);
         messageLabel.setForeground(Color.RED);
         f.add(messageLabel);

         String validUsername = "admin";
         String validPassword = "password123";

          // Add ActionListener to login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = usernameField.getText();
                String enteredPassword = new String(passwordField.getPassword());

                if (enteredUsername.equals(validUsername) && enteredPassword.equals(validPassword)) {
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login successful!");
                } else {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Invalid username or password.");
                }
            }
        });

        // Set frame visibility
        f.setVisible(true);
 
 
    }
}
