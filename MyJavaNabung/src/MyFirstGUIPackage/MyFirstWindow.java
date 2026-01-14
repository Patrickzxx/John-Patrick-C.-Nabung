package MyFirstGUIPackage;

import java.awt.EventQueue;
import javax.swing.*;

public class MyFirstWindow {

    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MyFirstWindow window = new MyFirstWindow();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public MyFirstWindow() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Username Label
        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(50, 50, 80, 25);
        frame.getContentPane().add(lblUsername);

        // Username Field with click-to-clear placeholder
        usernameField = new JTextField("type your username here");
        usernameField.setBounds(150, 50, 200, 25);
        frame.getContentPane().add(usernameField);

        usernameField.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (usernameField.getText().equals("type your username here")) {
                    usernameField.setText("");
                }
            }
        });

        // Password Label
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(50, 100, 80, 25);
        frame.getContentPane().add(lblPassword);

        // Password Field with click-to-clear placeholder
        passwordField = new JPasswordField("type your password here");
        passwordField.setEchoChar((char)0);
        passwordField.setBounds(150, 100, 200, 25);
        frame.getContentPane().add(passwordField);

        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (String.valueOf(passwordField.getPassword()).equals("type your password here")) {
                    passwordField.setText("");
                    passwordField.setEchoChar('•');
                }
            }
        });

        // Login Button
        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(150, 150, 100, 30);
        frame.getContentPane().add(btnLogin);

        // Button Action with validation and credential check
        btnLogin.addActionListener(e -> {
            String username = usernameField.getText().trim();
            String password = new String(passwordField.getPassword()).trim();

            boolean usernameEmpty = username.isEmpty() || username.equals("type your username here");
            boolean passwordEmpty = password.isEmpty() || password.equals("type your password here");

            // Validation for empty fields
            if (usernameEmpty && passwordEmpty) {
                JOptionPane.showMessageDialog(frame,
                        "Please enter a username and password.");
                return;
            }

            if (usernameEmpty) {
                JOptionPane.showMessageDialog(frame,
                        "Please enter a username.");
                return;
            }

            if (passwordEmpty) {
                JOptionPane.showMessageDialog(frame,
                        "Please enter a password.");
                return;
            }

            // Check credentials
            String correctUsername = "admin";
            String correctPassword = "1234";

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                JOptionPane.showMessageDialog(frame, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(frame, "Incorrect username or password.");
            }
        });
    }
}
