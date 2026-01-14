package MyFirstGUIPackage;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class signIn {

    private JFrame frame;
    private JTextField textField_2;  // Last name
    private JTextField tf;           // First name
    private JTextField tx_1;         // Username
    
    private JRadioButton rdbMale;
    private JRadioButton rdbFemale;
    
    private JRadioButton rdbFree;
    private JRadioButton rdbPremium;

    private JComboBox<String> comboBoxAge;
    private JTextArea textArea;
    private JPasswordField passwordField_1;   // Password field

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                signIn window = new signIn();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public signIn() {
        initialize();
    }

    private void initialize() {

        frame = new JFrame();
        frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
        frame.setBounds(100, 100, 536, 617);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblTitle = new JLabel("Sign In!");
        lblTitle.setBounds(220, 33, 87, 46);
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
        frame.getContentPane().add(lblTitle);

        JLabel lblFirstName = new JLabel("First Name");
        lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblFirstName.setBounds(71, 87, 79, 19);
        frame.getContentPane().add(lblFirstName);

        tf = new JTextField();
        tf.setBounds(27, 117, 172, 20);
        frame.getContentPane().add(tf);

        JLabel lblUserName = new JLabel("User Name");
        lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblUserName.setBounds(71, 164, 79, 14);
        frame.getContentPane().add(lblUserName);

        tx_1 = new JTextField();
        tx_1.setBounds(27, 189, 172, 20);
        frame.getContentPane().add(tx_1);

        JLabel lblLastName = new JLabel("Last Name");
        lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblLastName.setBounds(365, 87, 79, 19);
        frame.getContentPane().add(lblLastName);

        textField_2 = new JTextField();
        textField_2.setBounds(310, 117, 172, 20);
        frame.getContentPane().add(textField_2);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblPassword.setBounds(365, 159, 79, 19);
        frame.getContentPane().add(lblPassword);

        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(310, 189, 172, 20);
        frame.getContentPane().add(passwordField_1);

        JLabel lblSex = new JLabel("Sex");
        lblSex.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblSex.setBounds(81, 241, 46, 14);
        frame.getContentPane().add(lblSex);

        rdbMale = new JRadioButton("Male");
        rdbMale.setBounds(27, 266, 58, 23);
        frame.getContentPane().add(rdbMale);

        rdbFemale = new JRadioButton("Female");
        rdbFemale.setBounds(106, 266, 72, 23);
        frame.getContentPane().add(rdbFemale);

        ButtonGroup sexGroup = new ButtonGroup();
        sexGroup.add(rdbMale);
        sexGroup.add(rdbFemale);

        JLabel lblSubscription = new JLabel("Subscription");
        lblSubscription.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblSubscription.setBounds(59, 293, 100, 21);
        frame.getContentPane().add(lblSubscription);

        rdbFree = new JRadioButton("Free");
        rdbFree.setBounds(27, 317, 58, 23);
        frame.getContentPane().add(rdbFree);

        rdbPremium = new JRadioButton("Premium");
        rdbPremium.setBounds(106, 317, 100, 23);
        frame.getContentPane().add(rdbPremium);

        ButtonGroup subGroup = new ButtonGroup();
        subGroup.add(rdbFree);
        subGroup.add(rdbPremium);

        JLabel lblAge = new JLabel("Age");
        lblAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblAge.setBounds(378, 238, 46, 20);
        frame.getContentPane().add(lblAge);

        comboBoxAge = new JComboBox<>();
        comboBoxAge.setModel(new DefaultComboBoxModel<>(
                new String[]{"10","11","12","13","14","15","16","17","18","19","20"}));
        comboBoxAge.setBounds(310, 266, 172, 22);
        frame.getContentPane().add(comboBoxAge);

        JButton btnSignIn = new JButton("Sign In");
        btnSignIn.setBounds(310, 294, 89, 23);
        frame.getContentPane().add(btnSignIn);

        textArea = new JTextArea();
        textArea.setBounds(27, 347, 469, 185);
        frame.getContentPane().add(textArea);

        btnSignIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createEvent();
            }
        });
    }

    private void createEvent() {
        String firstName = tf.getText().trim();
        String username = tx_1.getText().trim();
        String lastName = textField_2.getText().trim();
        String password = new String(passwordField_1.getPassword()).trim();

        String sex = rdbMale.isSelected() ? "Male" :
                     rdbFemale.isSelected() ? "Female" : "";

        String subscription = rdbFree.isSelected() ? "Free" :
                             rdbPremium.isSelected() ? "Premium" : "";

        String age = (String) comboBoxAge.getSelectedItem();

        StringBuilder output = new StringBuilder();

        if (!firstName.isEmpty())
            output.append("First Name: ").append(firstName).append("\n");

        if (!username.isEmpty())
            output.append("Username: ").append(username).append("\n");

        if (!lastName.isEmpty())
            output.append("Last Name: ").append(lastName).append("\n");

        if (!password.isEmpty())
            output.append("Password: ").append(password).append("\n");

        if (!sex.isEmpty())
            output.append("Sex: ").append(sex).append("\n");

        if (!subscription.isEmpty())
            output.append("Subscription: ").append(subscription).append("\n");

        if (age != null)
            output.append("Age: ").append(age).append("\n");

        textArea.setText(output.toString());
    }
}
