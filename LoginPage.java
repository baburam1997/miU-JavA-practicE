import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {
    /*********Font family size and type ********/
    final Font mainFont = new Font("Sergoe print",Font.BOLD, 20);
    final Font formFont = new Font("Sergoe print",Font.BOLD, 15);
    final Font btnFont = new Font("Sergoe print",Font.BOLD, 17);
    final Font lbFont = new Font("Sergoe print",Font.BOLD, 15);
    final Font tfFont = new Font("Sergoe print",Font.BOLD, 16);

    private JTextField tfUserName;
    private JPasswordField tfPassword;
    private JButton btnLogin, btnClear;

    public LoginPage() {
        /*label, button, and textfields*/
        JLabel lbUserName = new JLabel("Username:");
        lbUserName.setFont(lbFont);
        tfUserName = new JTextField();
        tfUserName.setFont(tfFont);

        JLabel lbPassword = new JLabel("Password:");
        lbPassword.setFont(lbFont);
        tfPassword = new JPasswordField();
        tfPassword.setFont(tfFont);

        btnLogin = new JButton("Login");
        btnLogin.setFont(btnFont);
        btnLogin.addActionListener(this);

        btnClear = new JButton("Clear");
        btnClear.setFont(btnFont);
        btnClear.setSize(5, 2);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfUserName.setText("");
                tfPassword.setText("");
            }
        });

        /*Form Panel*/
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(2, 2,10,10));
        formPanel.setFont(formFont);
        formPanel.setOpaque(false);
        formPanel.add(lbUserName,BorderLayout.WEST);
        formPanel.add(tfUserName,BorderLayout.EAST);
        formPanel.add(lbPassword,BorderLayout.WEST);
        formPanel.add(tfPassword,BorderLayout.EAST);


        /*Button Panel*/
        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(2, 2,10,10));
        btnPanel.setFont(btnFont);
        btnPanel.setOpaque(false);
        btnPanel.add(btnLogin,BorderLayout.WEST);
        btnPanel.add(btnClear,BorderLayout.EAST);
        btnPanel.add(new JLabel());
        btnPanel.add(new JLabel());

        /*Main Panel*/
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1,10,10));
        mainPanel.setBackground(new Color(128,128,255));
        mainPanel.setFont(mainFont);
        mainPanel.add(formPanel,BorderLayout.NORTH);
        mainPanel.add(btnPanel,BorderLayout.SOUTH);

        /* Main Frame */ 
        add(mainPanel);
        setTitle("Welcome - Student Information System");
        setSize(400, 300);
        setMinimumSize(new Dimension(200, 150));
        setMinimumSize(new Dimension(getPreferredSize()));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        String username = tfUserName.getText();
        char[] password = tfPassword.getPassword();
        if (authenticate(username, password)) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Login failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Clear the password field
        tfUserName.setText("");
        tfPassword.setText("");
    }

    private boolean authenticate(String username, char[] password) {
        String correctUsername = "admin";
        String correctPassword = "password";

        return username.equals(correctUsername) && new String(password).equals(correctPassword);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginPage loginPage = new LoginPage();
            loginPage.setVisible(true);
        });
    }
}
