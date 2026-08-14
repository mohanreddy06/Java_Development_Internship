package Level_3.DesktopApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentManagementSystem extends JFrame {

    private JTextField nameField;
    private JTextField rollNumberField;
    private JTextField courseField;

    private JTextArea displayArea;

    public StudentManagementSystem() {

        // Window title
        setTitle("Student Management System");

        // Window size
        setSize(500, 500);

        // Close application when window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the window
        setLocationRelativeTo(null);


        // Main panel
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(6, 2, 10, 10));

        panel.setBorder(
                BorderFactory.createEmptyBorder(
                        20, 20, 20, 20
                )
        );


        // Heading
        JLabel titleLabel =
                new JLabel("Student Management System");

        titleLabel.setFont(
                new Font("Arial", Font.BOLD, 20)
        );


        // Labels
        JLabel nameLabel = new JLabel("Student Name:");
        JLabel rollNumberLabel = new JLabel("Roll Number:");
        JLabel courseLabel = new JLabel("Course:");


        // Text fields
        nameField = new JTextField();
        rollNumberField = new JTextField();
        courseField = new JTextField();


        // Buttons
        JButton addButton =
                new JButton("Add Student");

        JButton clearButton =
                new JButton("Clear");


        // Display area
        displayArea = new JTextArea();

        displayArea.setEditable(false);

        displayArea.setFont(
                new Font("Arial", Font.PLAIN, 14)
        );


        // Add button event
        addButton.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        addStudent();
                    }
                }
        );


        // Clear button event
        clearButton.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        clearFields();
                    }
                }
        );


        // Add components
        panel.add(titleLabel);
        panel.add(new JLabel(""));

        panel.add(nameLabel);
        panel.add(nameField);

        panel.add(rollNumberLabel);
        panel.add(rollNumberField);

        panel.add(courseLabel);
        panel.add(courseField);

        panel.add(addButton);
        panel.add(clearButton);

        panel.add(new JLabel("Student Details:"));
        panel.add(new JLabel(""));


        // Main layout
        setLayout(new BorderLayout());

        add(panel, BorderLayout.NORTH);

        add(
                new JScrollPane(displayArea),
                BorderLayout.CENTER
        );


        // Make window visible
        setVisible(true);
    }


    // Add student details
    private void addStudent() {

        String name = nameField.getText();
        String rollNumber = rollNumberField.getText();
        String course = courseField.getText();


        if (name.isEmpty()
                || rollNumber.isEmpty()
                || course.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please fill all fields.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }


        displayArea.append(
                "Name: " + name + "\n"
                        + "Roll Number: " + rollNumber + "\n"
                        + "Course: " + course + "\n"
                        + "-----------------------------\n"
        );


        clearFields();
    }


    // Clear input fields
    private void clearFields() {

        nameField.setText("");
        rollNumberField.setText("");
        courseField.setText("");
    }


    // Main method
    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                () -> new StudentManagementSystem()
        );
    }
}
