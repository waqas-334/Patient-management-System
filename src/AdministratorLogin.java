import java.sql.*; 
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class AdministratorLogin extends JFrame implements ActionListener
{
     private JButton LoginButton;
    private JLabel WelcomeLabel;
    private JLabel UserNameLabel;
    private JLabel PasswordLabel;
    private JPasswordField PasswordField;
    private JTextField UserNameTextField;
    
    public AdministratorLogin ()
    {
        super("LOGIN");
        WelcomeLabel = new JLabel();
        UserNameTextField = new JTextField();
        UserNameLabel = new JLabel();
        PasswordLabel = new JLabel();
        PasswordField = new JPasswordField();
        LoginButton = new JButton();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WelcomeLabel.setFont(new Font("Tahoma", 3, 12)); // NOI18N
        WelcomeLabel.setForeground(new Color(0, 102, 153));
        WelcomeLabel.setText("Login to Patient Managment System");
        WelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        //WelcomeLabel.setAlignmentX(1.0F);

        UserNameLabel.setText("User Name");

        PasswordLabel.setText("Password");

        LoginButton.setText("Login");
        
        LoginButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            LoginButtonActionPerformed(evt);
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserNameLabel, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserNameTextField)
                    .addComponent(PasswordField, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(WelcomeLabel, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(LoginButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WelcomeLabel, GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserNameTextField, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(UserNameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, GroupLayout.PREFERRED_SIZE,34,GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(LoginButton)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }
    
    
     private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) 
     {    
         
         String userName = UserNameTextField.getText();
         String password = PasswordField.getText();
          // variables
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
 
        // Step 1: Loading or 
        // registering Oracle JDBC driver class
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {
            System.out.println("Problem in loading"
                    + " MS Access JDBC driver");
            cnfex.printStackTrace();
        }
 
        // Step 2: Opening database connection
        try {
            // Step 2.A: Create and 
            // get connection using DriverManager class
            connection = DriverManager.getConnection(DB.DB_URL); 
 
            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();
 
            // Step 2.C: Executing SQL and
            // retrieve data into ResultSet
            resultSet = statement
                    .executeQuery("SELECT * FROM  Administrator" );
           

 
           resultSet.next();
            // processing returned data and printing into console
            if(userName.contains(resultSet.getString("UserName")) && password.contains(resultSet.getString("Password")))
            //    if(true)
            { 
       
                JOptionPane.showMessageDialog(null,"Login Successfull");

                Administrator Admin = new Administrator();
                Admin.setVisible(true);
                dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please Enter Correctly");
            }
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        finally {
            // Step 3: Closing database connection
            try {
                if(null != connection) {
 
                    // cleanup resources, once after processing
                    resultSet.close();
                    statement.close();
 
                    // and then finally close connection
                    connection.close();
                }
            }
            catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
     }
         
   
        
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
        


     
/* public static void main (String args[])
     {
         AdministratorLogin L = new AdministratorLogin();
         L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         L.setSize(400, 400);
         L.setVisible(true);
     }

*/
}    
