
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class GuestLogin extends JFrame
{
 
     private JButton LoginButton;
    private JLabel WelcomeLabel;
    private JLabel UserNameLabel;
    private JLabel PasswordLabel;
    private JPasswordField PasswordField;
    private JTextField UserNameTextField;
    
    public GuestLogin ()
    {
        super("GuestLogin");
        WelcomeLabel = new JLabel();
        UserNameTextField = new JTextField();
        UserNameLabel = new JLabel();
        PasswordLabel = new JLabel();
        PasswordField = new JPasswordField();
        LoginButton = new JButton();

        
        WelcomeLabel.setFont(new Font("Tahoma", 3, 12)); 
        WelcomeLabel.setForeground(new Color(0, 102, 153));
        WelcomeLabel.setText("Login to Patient Managment System");
        WelcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        //WelcomeLabel.setAlignmentX(1.0F);

        UserNameLabel.setText("User Name");

        PasswordLabel.setText("Password");

        LoginButton.setText("Login");
        
        LoginButton.addActionListener(new  ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
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
 
            String msAccessDBName ="E:\\Fifth Semester\\Java\\Java Projects\\Patient Managment System/Patient Managment System.accdb";
            String dbURL = "jdbc:ucanaccess://E:\\Fifth Semester\\Java\\Java Projects\\Patient Managment System\\Patient Managment System.accdb";
 
            // Step 2.A: Create and 
            // get connection using DriverManager class
            connection = DriverManager.getConnection(dbURL); 
 
            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();
 
            // Step 2.C: Executing SQL and
            // retrieve data into ResultSet
            String Query ="INSERT INTO Guest(UserName,Password) Values('"+userName+"','"+password+"')";
            statement=connection.createStatement();
            statement.executeUpdate(Query);
                    
            JOptionPane.showMessageDialog(null, "Please Welcome Your Our Guest , HAHAHA");
           Guest G = new Guest();
           G.setVisible(true);
  }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        finally {
            // Step 3: Closing database connection
            try {
                if(null != connection) {
 
                    // cleanup resources, once after processing
                   // resultSet.close();
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
        
     
     
}
