
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;

public class AddNewPatient extends JFrame
{
    private JLabel AddNewPatientLabel;
    private JButton CancelButton;
    private JDateChooser DateOfBirthCalendar;
    private JLabel DateOfBirthLabel;
    private JLabel DiseaseHistoryLabel;
    private JTextField DiseaseHistoryTextField;
    private JTextField DoctorIDTextField;
    private JLabel DoctorIdLabel;
    private JLabel DoctorNameLabel;
    private JRadioButton FemaleRadioButton;
    private JRadioButton MaleRadioButton;
    private JLabel PatientFatherNameLabel;
    private JTextField PatientFatherNameTextField;
    private JLabel PatientIdLabel;
    private JTextField PatientIdTextField;
    private JLabel PatientNameLabel;
    private JTextField PatientNameTextField;
    private JLabel PrescriptionLabel;
    private JTextField PrescriptionTextField;
    private JButton SaveButton;
    private JLabel SexLabel;
    private JComboBox<String> DoctorNameComboBox;
    
    
    public AddNewPatient()
    {
    AddNewPatientLabel = new JLabel();
        PatientIdLabel = new JLabel();
        PatientNameLabel = new JLabel();
        PatientFatherNameLabel = new JLabel();
        SexLabel = new JLabel();
        DateOfBirthLabel = new JLabel();
        DoctorIdLabel = new JLabel();
        DoctorNameLabel = new JLabel();
        DiseaseHistoryLabel = new JLabel();
        PrescriptionLabel = new JLabel();
        PatientIdTextField = new JTextField();
        PatientNameTextField = new JTextField();
        PatientFatherNameTextField = new JTextField();
        MaleRadioButton = new JRadioButton();
        FemaleRadioButton = new JRadioButton();
        DoctorIDTextField = new JTextField();
        DiseaseHistoryTextField = new JTextField();
        PrescriptionTextField = new JTextField();
        SaveButton = new JButton();
        CancelButton = new JButton();
        DateOfBirthCalendar = new com.toedter.calendar.JDateChooser();
        DoctorNameComboBox = new JComboBox<>();

     //   setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        AddNewPatientLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        AddNewPatientLabel.setForeground(new java.awt.Color(51, 51, 255));
        AddNewPatientLabel.setHorizontalAlignment(SwingConstants.CENTER);
        AddNewPatientLabel.setText("Add New Patient");

        PatientIdLabel.setText("Patient ID");

        PatientNameLabel.setText("Patient  Name");

        PatientFatherNameLabel.setText("Patient Father Name");

        SexLabel.setText("Sex");

        DateOfBirthLabel.setText("Date of Birth");

        DoctorIdLabel.setText("Doctor ID");

        DoctorNameLabel.setText("Doctor Name");

        DiseaseHistoryLabel.setText("Disease History");

        PrescriptionLabel.setText("Prescription");

        PatientIdTextField.setEditable(false);
        PatientIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientIdTextFieldActionPerformed(evt);
            }
        });

        PatientNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientNameTextFieldActionPerformed(evt);
            }
        });

        PatientFatherNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientFatherNameTextFieldActionPerformed(evt);
            }
        });

        MaleRadioButton.setText("Male");
        MaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioButtonActionPerformed(evt);
            }
        });

        FemaleRadioButton.setText("Female");
        FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRadioButtonActionPerformed(evt);
            }
        });
        
        DoctorIDTextField.setEditable(true);
        DoctorIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorIDTextFieldActionPerformed(evt);
            }
        });

        DiseaseHistoryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiseaseHistoryTextFieldActionPerformed(evt);
            }
        });

        PrescriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrescriptionTextFieldActionPerformed(evt);
            }
        });

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        DoctorNameComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Himatullah", "Amjid Rehman", "Nouman Gardiwal", "Abid Stanikzai", "Aliullah", "Waris", "Khalid", " ", " " }));
        DoctorNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorNameComboBoxActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(AddNewPatientLabel, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(PatientIdLabel, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientNameLabel, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientFatherNameLabel)
                            .addComponent(SexLabel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateOfBirthLabel, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorIdLabel, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorNameLabel, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrescriptionLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(SaveButton)
                                .addComponent(DiseaseHistoryLabel, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(CancelButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DoctorIDTextField)
                                    .addComponent(PatientNameTextField)
                                    .addComponent(PatientFatherNameTextField)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MaleRadioButton, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FemaleRadioButton, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                                    .addComponent(DiseaseHistoryTextField)
                                    .addComponent(PrescriptionTextField)
                                    .addComponent(DateOfBirthCalendar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PatientIdTextField)
                                    .addComponent(DoctorNameComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AddNewPatientLabel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(PatientIdLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatientIdTextField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(PatientNameLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientNameTextField, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(PatientFatherNameLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientFatherNameTextField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SexLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(MaleRadioButton)
                        .addComponent(FemaleRadioButton)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(DateOfBirthLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateOfBirthCalendar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(DoctorIdLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addComponent(DoctorIDTextField, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(DoctorNameLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(DoctorNameComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(DiseaseHistoryLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiseaseHistoryTextField, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(PrescriptionLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrescriptionTextField, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(SaveButton)
                    .addComponent(CancelButton))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>                        

    private void PatientIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void PatientNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void PatientFatherNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        // TODO add your handling code here:
    }                                                          

    private void MaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void DoctorIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void DoctorNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void DiseaseHistoryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void PrescriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
     
     String PatientName = PatientNameTextField.getText();
     String PatientFatherName = PatientFatherNameTextField.getText();
     String Male =MaleRadioButton.getText();
     String Female = FemaleRadioButton.getText();
      Date date = new Date();
     date = DateOfBirthCalendar.getDate();
    // String Date = DateOfBirthCalendar.getName();
     //int DateInt = Integer.parseInt(Date);
     String DoctorName = (String)DoctorNameComboBox.getSelectedItem();
     String DiseaseHistory = DiseaseHistoryTextField.getText();
     String Prescription = PrescriptionTextField.getText();

        
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
 
            //String msAccessDBName ="../Patient Managment System.accdb";
            //String dbURL = "jdbc:ucanaccess://..\\Patient Managment System.accdb";
 
            // Step 2.A: Create and 
            // get connection using DriverManager class
            connection = DriverManager.getConnection(DB.DB_URL); 
 
            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();
 
            // Step 2.C: Executing SQL and
            // retrieve data into ResultSet
            String Query ="INSERT INTO Patient_Table"
                    + "(Patient_Name,Patient_Father_Name,Sex_x,DOB,Doctor_Name,Disease_History,Prescription_ss)"
                    + " Values('"+PatientName+"','"+PatientFatherName+"','"+Male+"','"+date+"','"+DoctorName+"'"
                    + ",'"+DiseaseHistory+"','"+Prescription+"')";
            statement=connection.createStatement();
            statement.executeUpdate(Query);
                    
            JOptionPane.showMessageDialog(null, "Successfully Inserted into Patient Table ");
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
       dispose();
        // TODO add your handling code here:
    }
   /* public static void main (String args[])
     {
         AddNewPatient L = new AddNewPatient();
         L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         L.setSize(500, 600);
         L.setVisible(true);
     }
    */
}
