import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class MainFrame extends JFrame{
    
    /*********Font family size and type ********/

    final Font mainFont = new Font("Sergoe print",Font.BOLD, 15);

    /******************varaibles**************/
    JTextField tfFirstName;
    JTextField tfLastName;
    JLabel lbWelcome;

    public void initialize(){
        /************Labels and textfields********/
        JLabel lbFirstName = new JLabel("First Name: ");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel("Last Name: ");
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        /***************Form Pannel******************/
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(1,1,5,5));
        formPanel.setOpaque(false);
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);

        /********Buttons*********/
        JButton btnOk = new JButton("OK");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                if (firstName.length() > 0  | lastName.length() > 0){
                    lbWelcome.setText("Hello I am " + firstName + " " + lastName);
                }else{

                    lbWelcome.setText("Sorry Both First Name and Last Name are Empty...");
                }
            }
            
        });
        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }
        });
        /***************BUtton Pannel******************/
        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(1,2,5,5));
        btnPanel.add(btnOk);
        btnPanel.add(btnClear);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128,128,255));
        mainPanel.add(formPanel,BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(btnPanel, BorderLayout.SOUTH);

        /* Main Frame */ 
        add(mainPanel);
        setTitle("Welcome - Student Information System");
        setSize(800, 600);
        setMinimumSize(new Dimension(400, 300));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.initialize();
    }
}