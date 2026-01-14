package MyGrud;

import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
 * ScheduleGRUD Class
 * ------------------
 * Ang class na ito ang nagha-handle ng GUI at GRUD
 * (Create, Read, Update, Delete) operations ng schedule system.
 */
public class ScheduleGRUD {

    // JFrame – ito ang pangunahing window ng application
    private JFrame frame;

    // Mga text field kung saan nag-iinput ang user
    private JTextField txtSubject, txtTime, txtTask, txtDeadline;

    // JTable – ginagamit para ipakita ang mga schedule
    private JTable table;

    // Table model – nagma-manage ng data sa JTable
    private DefaultTableModel model;

    /*
     * ArrayList – dito ini-store ang lahat ng Schedule objects.
     * Ito ang nagsisilbing temporary database ng system.
     */
    private ArrayList<Schedule> schedules = new ArrayList<>();

    /*
     * Constructor
     * -----------
     * Automatic na tinatawag kapag ginawa ang ScheduleGRUD object.
     * Dito sinisimulan ang paggawa ng GUI.
     */
    public ScheduleGRUD() {
        initialize();
    }

    /*
     * show() Method
     * -------------
     * Ginagamit para ipakita ang JFrame sa screen.
     */
    public void show() {
        frame.setVisible(true);
    }

    /*
     * initialize() Method
     * -------------------
     * Dito nililikha at inaayos ang lahat ng GUI components
     * at dito rin nilalagay ang functionality ng mga buttons.
     */
    private void initialize() {

        // Gumagawa ng main window
        frame = new JFrame("Personal Schedule GRUD");
        frame.setBounds(100, 100, 700, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Absolute positioning (manual ang ayos ng components)
        frame.getContentPane().setLayout(null);

        // ===== LABELS (pang-guide sa user) =====
        JLabel lblSubject = new JLabel("Subject:");
        lblSubject.setBounds(20, 20, 80, 25);
        frame.getContentPane().add(lblSubject);

        JLabel lblTime = new JLabel("Time:");
        lblTime.setBounds(20, 55, 80, 25);
        frame.getContentPane().add(lblTime);

        JLabel lblTask = new JLabel("Task:");
        lblTask.setBounds(20, 90, 80, 25);
        frame.getContentPane().add(lblTask);

        JLabel lblDeadline = new JLabel("Deadline:");
        lblDeadline.setBounds(20, 125, 80, 25);
        frame.getContentPane().add(lblDeadline);

        // ===== TEXT FIELDS (dito naglalagay ng input ang user) =====
        txtSubject = new JTextField();
        txtSubject.setBounds(100, 20, 180, 25);
        frame.getContentPane().add(txtSubject);

        txtTime = new JTextField();
        txtTime.setBounds(100, 55, 180, 25);
        frame.getContentPane().add(txtTime);

        txtTask = new JTextField();
        txtTask.setBounds(100, 90, 180, 25);
        frame.getContentPane().add(txtTask);

        txtDeadline = new JTextField();
        txtDeadline.setBounds(100, 125, 180, 25);
        frame.getContentPane().add(txtDeadline);

        // ===== BUTTONS (nagti-trigger ng GRUD actions) =====
        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(320, 20, 120, 25);
        frame.getContentPane().add(btnAdd);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.setBounds(320, 55, 120, 25);
        frame.getContentPane().add(btnUpdate);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(320, 90, 120, 25);
        frame.getContentPane().add(btnDelete);

        // ===== TABLE (dito ipinapakita ang mga schedule) =====
        model = new DefaultTableModel(
                new String[]{"Subject", "Time", "Task", "Deadline"}, 0
        );

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 180, 650, 180);
        frame.getContentPane().add(scrollPane);

        // ===== CREATE / ADD FUNCTION =====
        btnAdd.addActionListener(e -> {
            /*
             * Kinukuha ang laman ng text fields,
             * gumagawa ng Schedule object,
             * ini-store sa ArrayList,
             * at ipinapakita sa JTable.
             */
            Schedule s = new Schedule(
                    txtSubject.getText(),
                    txtTime.getText(),
                    txtTask.getText(),
                    txtDeadline.getText()
            );

            schedules.add(s); // save sa ArrayList

            model.addRow(new Object[]{ // display sa table
                    s.getSubject(), s.getTime(), s.getTask(), s.getDeadline()
            });

            clearFields(); // linisin ang text fields
        });

        // ===== UPDATE FUNCTION =====
        btnUpdate.addActionListener(e -> {
            int row = table.getSelectedRow();

            /*
             * Ina-update ang napiling schedule
             * sa ArrayList at JTable.
             */
            if (row >= 0) {
                Schedule s = schedules.get(row);

                s.setSubject(txtSubject.getText());
                s.setTime(txtTime.getText());
                s.setTask(txtTask.getText());
                s.setDeadline(txtDeadline.getText());

                model.setValueAt(s.getSubject(), row, 0);
                model.setValueAt(s.getTime(), row, 1);
                model.setValueAt(s.getTask(), row, 2);
                model.setValueAt(s.getDeadline(), row, 3);
            } else {
                JOptionPane.showMessageDialog(frame, "Pumili ng schedule para i-update");
            }
        });

        // ===== DELETE FUNCTION =====
        btnDelete.addActionListener(e -> {
            int row = table.getSelectedRow()+1;

            /*
             * Tinatanggal ang napiling schedule
             * mula sa ArrayList at JTable.
             */
            if (row >= 0) {
                schedules.remove(row);
                model.removeRow(row);
                clearFields();
            } else {
                JOptionPane.showMessageDialog(frame, "Pumili ng schedule para i-delete");
            }
        });

        // ===== READ FUNCTION =====
        table.getSelectionModel().addListSelectionListener(e -> {
            /*
             * Kapag pumili ng row sa table,
             * ipinapakita ang data pabalik sa text fields.
             */
            int row = table.getSelectedRow();

            if (row >= 0) {
                Schedule s = schedules.get(row);
                txtSubject.setText(s.getSubject());
                txtTime.setText(s.getTime());
                txtTask.setText(s.getTask());
                txtDeadline.setText(s.getDeadline());
            }
        });
    }

    /*
     * clearFields() Method
     * --------------------
     * Nililinis ang lahat ng text fields
     * pagkatapos ng Add, Update, o Delete.
     */
    private void clearFields() {
        txtSubject.setText("");
        txtTime.setText("");
        txtTask.setText("");
        txtDeadline.setText("");
    }
}
