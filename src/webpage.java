import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JButton;



public class webpage implements ActionListener{
        JFrame frame = new JFrame();
        JButton loginButton = new JButton("Login");
        JButton resetButton = new JButton("Reset");

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");

        JLabel accessLabel = new JLabel();

        JPasswordField passwordField = new JPasswordField();
        JTextField textField = new JTextField();


        HashMap<String,String> databaseCopy = new HashMap<>();



        webpage(HashMap<String,String> database){
            databaseCopy = database;

            loginButton.setBounds(50,250,100,25);
            resetButton.setBounds(200,250,100,25);
            passwordField.setBounds(200,170,200,25);
            textField.setBounds(200,125,200,25);
            passwordLabel.setBounds(50,170,100,25);
            usernameLabel.setBounds(50,125,100,25);
            accessLabel.setBounds(50,50,300,25);

            frame.setSize(500,500);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.add(loginButton);
            frame.add(resetButton);
            frame.add(passwordField);
            frame.add(textField);
            frame.add(passwordLabel);
            frame.add(usernameLabel);
            frame.add(accessLabel);
            resetButton.addActionListener(this);
            loginButton.addActionListener(this);

        }


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==resetButton) {
                textField.setText("");
                passwordField.setText("");

            }
            if (e.getSource()== loginButton)  {
                if (databaseCopy.get(textField.getText()).equals(String.valueOf(passwordField.getPassword())) ){
                    accessLabel.setForeground(Color.green);
                    accessLabel.setText("Access granted!");


                }else{
                    accessLabel.setForeground(Color.red);
                    accessLabel.setText("Access denied");
                }


            }



        }





}
