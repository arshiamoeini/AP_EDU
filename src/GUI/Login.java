package GUI;

import LOGIC.Command;
import MODELS.LoginDate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private static Login instance;

    private JPanel loginPane;
    private JTextField userIDField;
    private JPasswordField passwordField;
    private JCheckBox showPassword;
    private JButton loginButton;
    private JLabel userIDLabel;
    private JLabel PasswordLabel;

    static {
        instance = new Login();
    }

    public Login() {
        //setting
        setListener();
    }

    public static Login getInstance() { return instance; }

    private void setListener() {
        showPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordField.setEchoChar(showPassword.isSelected() ? (char)0 : '*');
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginDate date = new LoginDate(userIDField.getText(), passwordField.getText());

                switch (Command.getInstance().canLogin(date)) {
                    case WRONG_USER_ID:
                        JOptionPane.showMessageDialog(loginButton, "user ID is not valid");
                        break;
                    case WRONG_PASSWORD:
                        JOptionPane.showMessageDialog(loginButton, "password is not correct");
                        break;
                    case PASS:
                        //TODO
                }
            }
        });
    }

    public JPanel getLoginPane() {
        return loginPane;
    }
}
