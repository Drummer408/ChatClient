package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import client.Client;

public class ChatPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    private DefaultListModel<String> model;
    private JList<String> lstMessages;
    private JTextField txtMessage;

    private Client client;

    public ChatPanel() {
        setupContent();
        client = new Client("45.55.139.8", 4444);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    String message = client.receiveMessage();
                    model.addElement(message);
                }
            }
        };
        new Thread(r).start();
    }

    private void setupContent() {
        this.setLayout(new BorderLayout());
        model = new DefaultListModel<>();
        lstMessages = new JList<>(model);
        txtMessage = new JTextField();
        txtMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = txtMessage.getText();
                txtMessage.setText("");
                client.sendMessage(message);
                model.addElement(message);
            }
        });

        this.add(lstMessages, BorderLayout.NORTH);
        this.add(txtMessage, BorderLayout.SOUTH);
    }
}
