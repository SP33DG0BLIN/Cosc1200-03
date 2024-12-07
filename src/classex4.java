//bhavin shuseevan
//cosc1200
//this is a class excersice that shows that we fully understand swing and UI
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // for button click
public class classex4 {
    public static void main(String[] args) {
        // main window
        JFrame frame = new JFrame("login form");
        frame.setSize(600, 300); // window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // for closing w X
        JPanel panel = new JPanel(new GridLayout(3, 2));// small grid 3row 2 cols
        //usrname nd text area
        JLabel usernameLabel = new JLabel("username:");
        JTextField usernameField = new JTextField();
        panel.add(usernameLabel); 
        panel.add(usernameField);
        //pswrd
        JLabel passwordLabel = new JLabel("password:");
        JPasswordField passwordField = new JPasswordField();
        panel.add(passwordLabel); 
        panel.add(passwordField);
        //login bttn
        JButton loginButton = new JButton("login");
        panel.add(loginButton);
        loginButton.setToolTipText("click to log in");
        //panel in wndw
        frame.add(panel);
        // button stuff
        loginButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText(); // get username
        String password = new String(passwordField.getPassword()); // get password
        // check if username and password are correct
        if (username.equals("Spongebob") && password.equals("password")) {
        JOptionPane.showMessageDialog(frame, "you're in!");
        System.out.println("welcome, Krusty Krab Fry Cook!");
        } else {
        JOptionPane.showMessageDialog(frame, "Uh-oh, please try again.");
        System.out.println("LoG!n fAiL3d.");
        }
        }
        });
        //show wndow
        frame.setVisible(true);

    }
}


