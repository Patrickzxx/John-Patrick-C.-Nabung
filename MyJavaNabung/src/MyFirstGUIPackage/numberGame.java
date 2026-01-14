package MyFirstGUIPackage;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class numberGame {

    private JFrame frame;
    private JButton btnCheckGuess;
    private JTextField txtPutYourGuess;
    private JLabel lblInstruction;
    private JLabel lblHeading;

    private int randomNumber = (int)(Math.random() * 10) + 1;  // random number 1–10

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                numberGame window = new numberGame();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public numberGame() {
        initialize();
        createEvent();
    }

    private void initialize() {

        frame = new JFrame();
        frame.setBounds(100, 100, 450, 330);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Big Heading
        lblHeading = new JLabel("Guess The Number!");
        lblHeading.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblHeading.setBounds(115, 20, 250, 40);
        frame.getContentPane().add(lblHeading);

        // Instruction label
        lblInstruction = new JLabel("Guess the Number from 1 to 10");
        lblInstruction.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        lblInstruction.setBounds(115, 70, 220, 25);
        frame.getContentPane().add(lblInstruction);

        // Guess input field
        txtPutYourGuess = new JTextField("   Put your guess here!");
        txtPutYourGuess.setBounds(150, 110, 140, 22);
        frame.getContentPane().add(txtPutYourGuess);
        txtPutYourGuess.setColumns(10);

        // Click-to-clear placeholder
        txtPutYourGuess.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtPutYourGuess.setText("");
            }
        });

        // Button
        btnCheckGuess = new JButton("Check the number");
        btnCheckGuess.setBackground(SystemColor.textHighlight);
        btnCheckGuess.setBounds(150, 150, 140, 25);
        frame.getContentPane().add(btnCheckGuess);
    }

    private void createEvent() {

        btnCheckGuess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int userGuess = Integer.parseInt(txtPutYourGuess.getText().trim());

                    if (userGuess < 1 || userGuess > 10) {
                        JOptionPane.showMessageDialog(frame, "Out of range! Please enter a number between 1 and 10.");
                    } else if (userGuess == randomNumber) {
                        JOptionPane.showMessageDialog(frame, "Correct!");
                        randomNumber = (int)(Math.random() * 10) + 1; // new number
                    } else {
                        JOptionPane.showMessageDialog(frame, "Wrong! Try again.");
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number!");
                }
            }
        });
    }
}
