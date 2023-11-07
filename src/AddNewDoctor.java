
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;


public class AddNewDoctor extends JFrame
{
   private JComboBox<String> DiseaseNameComboBox;
    private JLabel DiseaseNameLabel;
    private JLabel DoctorNameLabel;
    private JTextField DoctorNameTextField;
    private JButton SaveButton;
    private JButton CancelButton;
    private JLabel AddNewDoctorLabel; 
    
    public AddNewDoctor()
    {
        super("Please Add new Doctor");
        DoctorNameLabel = new JLabel();
        DiseaseNameLabel = new JLabel();
        DoctorNameTextField = new JTextField();
        DiseaseNameComboBox = new JComboBox<>();
        AddNewDoctorLabel = new JLabel();
        SaveButton = new JButton();
        CancelButton = new JButton();

       // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DoctorNameLabel.setText("Doctor Name");

        DiseaseNameLabel.setText("Disease Name");

        DoctorNameTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DoctorNameTextFieldActionPerformed(evt);
            }
        });

        DiseaseNameComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "HIV", "Typhoid", "Fever", "Ebola", "Flu", "Hepatitis A", "tuberculosis" }));
        DiseaseNameComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DiseaseNameComboBoxActionPerformed(evt);
            }
        });

        AddNewDoctorLabel.setFont(new Font("Tahoma", 3, 14)); // NOI18N
        AddNewDoctorLabel.setForeground(new Color(51, 0, 255));
        AddNewDoctorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        AddNewDoctorLabel.setText("Add New Doctor");

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

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(AddNewDoctorLabel, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(DoctorNameLabel, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DiseaseNameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(SaveButton, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(CancelButton)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(DoctorNameTextField)
                                .addComponent(DiseaseNameComboBox, 0, 135, Short.MAX_VALUE)))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddNewDoctorLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(DoctorNameLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addComponent(DoctorNameTextField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(DiseaseNameLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiseaseNameComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(CancelButton))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }

    private void DiseaseNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
         
         String DoctorName = DoctorNameTextField.getText();
         String DiseaseName =(String)DiseaseNameComboBox.getSelectedItem();
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
   String msAccessDBName ="/Users/waqasyounis/Downloads/Patient Managment System/Patient Managment System.accdb";
            String dbURL = "jdbc:ucanaccess:///Users/waqasyounis/Downloads/Patient Managment System/Patient Managment System.accdb";
 
            // Step 2.A: Create and 
            // get connection using DriverManager class
            connection = DriverManager.getConnection(dbURL); 
 
            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();
 
            // Step 2.C: Executing SQL and
            // retrieve data into ResultSet
            String Query ="INSERT INTO Doctor_Table(Doctor_Name,Disease_Name) Values('"+DoctorName+"','"+DiseaseName+"')";
            statement=connection.createStatement();
            statement.executeUpdate(Query);
                    
            JOptionPane.showMessageDialog(null, "Successfully Inserted");
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

        // TODO add your handling code here:                                        

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void DoctorNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }
 /*  public static void main (String args[])
     {
         AddNewDoctor L = new AddNewDoctor();
                 
                 
                 
         L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         L.setSize(400, 400);
         L.setVisible(true);
     }
   */ 
    }

