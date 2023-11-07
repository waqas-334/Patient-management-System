
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;


public class AddNewDisease extends JFrame
{
    private JButton CancelButton;
    private JLabel DiseaseDescriptionLabel;
    private JTextArea DiseaseDescriptionTextField;
    private JLabel DiseaseNameLabel;
    private JTextField DiseaseNameTextField;
    private JButton SaveButton;
    private JScrollPane jScrollPane2;
    private JLabel welcomeLabel;
    
    public AddNewDisease()
    {
        super("PLEASE FILL DISEASE FORM ");
        welcomeLabel = new JLabel();
        DiseaseNameLabel = new JLabel();
        DiseaseDescriptionLabel = new JLabel();
        SaveButton = new JButton();
        CancelButton = new JButton();
        DiseaseNameTextField = new JTextField();
        jScrollPane2 = new JScrollPane();
        DiseaseDescriptionTextField = new JTextArea();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setFont(new Font("Tahoma", 3, 14)); // NOI18N
        welcomeLabel.setForeground(new Color(51, 0, 255));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setText("Disease Form");

        DiseaseNameLabel.setText("Disease Name");

        DiseaseDescriptionLabel.setText("Disease Description");

        SaveButton.setText("Save");
        SaveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        DiseaseDescriptionTextField.setColumns(20);
        DiseaseDescriptionTextField.setRows(5);
        DiseaseDescriptionTextField.setLineWrap(true); // Line will break and next line will start.
        jScrollPane2.setViewportView(DiseaseDescriptionTextField);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(DiseaseNameLabel, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                            .addComponent(DiseaseDescriptionLabel, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(DiseaseNameTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(welcomeLabel, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(SaveButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CancelButton)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(welcomeLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(DiseaseNameLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiseaseNameTextField, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(DiseaseDescriptionLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(CancelButton))
                .addGap(34, 34, 34))
        );

        pack();
    }                       

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
      String DiseaseName = DiseaseNameTextField.getText();
         String DiseaseDescription = DiseaseDescriptionTextField.getText();
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
   //String msAccessDBName ="/Users/waqasyounis/Downloads/Patient Managment System/Patient Managment System.accdb";
     //       String dbURL = "jdbc:ucanaccess:///Users/waqasyounis/Downloads/Patient Managment System/Patient Managment System.accdb";
 
            // Step 2.A: Create and 
            // get connection using DriverManager class
            connection = DriverManager.getConnection(DB.DB_URL); 
 
            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();
 
            // Step 2.C: Executing SQL and
            // retrieve data into ResultSet
            String Query ="INSERT INTO Disease_Table(Disease_Name,Disease_Discription) Values('"+DiseaseName+"','"+DiseaseDescription+"')";
            statement=connection.createStatement();
            statement.executeUpdate(Query);
                    
            JOptionPane.showMessageDialog(null, "Successfully Inserted into Disease Table");
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
                                         

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    
    }
   /* public static void main (String args[])
     {
         AddNewDisease L = new AddNewDisease();
         L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         L.setSize(500, 400);
         L.setVisible(true);
     }
*/
}
