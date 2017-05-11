package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    private JTextField txtUsername;
    private JButton btnLogin;

    public LoginPanel() {
        txtUsername = new JTextField(12);
        btnLogin = new JButton("Login");

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }
}
