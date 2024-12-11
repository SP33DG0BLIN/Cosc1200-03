/* * Name: bhavin
 * Program Name: COSC1200
 * Description: this program is for a vet clinice, its gets the owners info and the pets name and stuff
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
public class vetclinic  {
    public static void main(String[] args) {
        //for main frame
        JFrame frame = new JFrame("Vet Clinic Registration");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); //for simpler layout

        //labels and text stuf
        JLabel patientLabel = new JLabel("Pet's Name:");
        patientLabel.setBounds(20, 20, 100, 25);
        frame.add(patientLabel);

        JTextField patientField = new JTextField();
        patientField.setBounds(130, 20, 200, 25);
        frame.add(patientField);

        JLabel ownerLabel = new JLabel("Owner Name:");
        ownerLabel.setBounds(20, 60, 100, 25);
        frame.add(ownerLabel);

        JTextField ownerField = new JTextField();
        ownerField.setBounds(130, 60, 200, 25);
        frame.add(ownerField);

        JLabel emailLabel = new JLabel("Email Address:");
        emailLabel.setBounds(20, 100, 100, 25);
        frame.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(130, 100, 200, 25);
        frame.add(emailField);

        //buttons for vet stuff
        JLabel vetLabel = new JLabel("Select Vet:");
        vetLabel.setBounds(20, 140, 100, 25);
        frame.add(vetLabel);

          JRadioButton vet1 = new JRadioButton("Dr. Adam Smith");
        vet1.setBounds(130, 140, 100, 25);
        JRadioButton vet2 = new JRadioButton("Dr. Jason Wang");
        vet2.setBounds(230, 140, 100, 25);
        JRadioButton vet3 = new JRadioButton("Dr. Prabhakarna Sripalvardana");
        vet3.setBounds(330, 140, 100, 25);

        ButtonGroup vetGroup = new ButtonGroup();
        vetGroup.add(vet1);
        vetGroup.add(vet2);
        vetGroup.add(vet3);
        frame.add(vet1);
        frame.add(vet2);
        frame.add(vet3);

        // more buttons
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(20, 200, 100, 30);
        frame.add(registerButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(140, 200, 100, 30);
        frame.add(clearButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(260, 200, 100, 30);
        frame.add(exitButton);

        //for message
        JLabel messageLabel = new JLabel();
        messageLabel.setBounds(20, 240, 350, 25);
        frame.add(messageLabel);

        //listerner stuff
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String patientName = patientField.getText();
            String ownerName = ownerField.getText();
            String email = emailField.getText();
            String selectedVet = null;

             if (vet1.isSelected()) {
                selectedVet = "Dr. Smith";
                } else if (vet2.isSelected()) {
                selectedVet = "Dr. Lee";
                } else if (vet3.isSelected()) {
                selectedVet = "Dr. Patel";
                }

                //validatiiion stuff
                if (patientName.isEmpty() || ownerName.isEmpty() || email.isEmpty() || selectedVet == null) {
                messageLabel.setText("Please fill in all fields and select a vet.");
                return;
                }

                if (!email.matches("^[\\w!#$%&'*+/=?{|}~^-]+(?:\\.[\\w!#$%&'*+/=?{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")) {
                messageLabel.setText("Invalid email format.");
                return;
                }
                //save ti file
                try (FileWriter writer = new FileWriter("registration.txt", true)) {
                writer.write("Patient Name: " + patientName + "\n");
                writer.write("Owner Name: " + ownerName + "\n");
                writer.write("Email: " + email + "\n");
                writer.write("Vet: " + selectedVet + "\n");
                writer.write("-----------------------------------\n");
                messageLabel.setText("Great Success!!!!!!!!");
                } catch (IOException ex) {
                messageLabel.setText("cant save to file");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                patientField.setText("");
                ownerField.setText("");
                emailField.setText("");
                vetGroup.clearSelection();
                messageLabel.setText("");
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //frame stuff
        frame.setVisible(true);
    }
}

