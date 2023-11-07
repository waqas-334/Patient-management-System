
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Boolean.TRUE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Administrator extends JFrame 
{
    private JMenuItem AboutUsSubMenu;
    private JButton AddDoctorButton;
    private JMenuItem AddNewDiseaseSubMenu;
    private JMenuItem AddNewDoctorSubMenu;
    private JMenuItem AddNewPatientSubMenu;
    private JButton AddPatientButton;
    private JMenuItem AgeSubMenu;
    private JMenuItem ChangePasswordSubMenu;
    private JMenuItem DeletePatientRecordSubMenu;
    private JMenuItem DiseaseSubMenu;
    private JMenuItem DoctorByNameSubMenu;
    private JMenuItem DoctorSubMenu;
    private JMenu HelpMenu;
    private JMenuItem IDSubMenu;
    private JMenu ManageMenu;
    private JMenuItem NameSubMenu;
    private JButton PrintButton;
    private JMenu SearchMenu;
    private JButton SearchPatientButton;
    private JMenuItem SpecializationSubMenu;
    private JMenuItem UpdateDoctorSubMenu;
    private JMenuItem UpdatePatientSubMenu;
    private JMenu UpdateRecordSubMenu;
    private JMenuBar jMenuBar1;   
    
    public Administrator()
    {
        super("Administrator");
     AddPatientButton = new JButton();
        SearchPatientButton = new JButton();
        AddDoctorButton = new JButton();
        PrintButton = new JButton();
        jMenuBar1 = new JMenuBar();
        ManageMenu = new JMenu();
        AddNewPatientSubMenu = new JMenuItem();
        AddNewDoctorSubMenu = new JMenuItem();
        AddNewDiseaseSubMenu = new JMenuItem();
        DeletePatientRecordSubMenu = new JMenuItem();
        UpdateRecordSubMenu = new JMenu();
        UpdatePatientSubMenu = new JMenuItem();
        UpdateDoctorSubMenu = new JMenuItem();
        SearchMenu = new JMenu();
        IDSubMenu = new JMenuItem();
        NameSubMenu = new JMenuItem();
        AgeSubMenu = new JMenuItem();
        DiseaseSubMenu = new JMenuItem();
        DoctorSubMenu = new JMenuItem();
        DoctorByNameSubMenu = new JMenuItem();
        SpecializationSubMenu = new JMenuItem();
        HelpMenu = new JMenu();
        ChangePasswordSubMenu = new JMenuItem();
        AboutUsSubMenu = new JMenuItem();

       // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(204, 204, 255));

        AddPatientButton.setText("Add Patient");
        AddPatientButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt) {
                AddPatientButtonActionPerformed(evt);
            }
        });

        SearchPatientButton.setText("Search Patient");
        SearchPatientButton.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                SearchPatientButtonActionPerformed(evt);
            }
        });

        AddDoctorButton.setText("Add Doctor");
        AddDoctorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddDoctorButtonActionPerformed(evt);
            }
        });

        PrintButton.setText("Print");
        PrintButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });

        ManageMenu.setText("Manage Record");

        AddNewPatientSubMenu.setText("Add New Patient");
        AddNewPatientSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddNewPatientSubMenuActionPerformed(evt);
            }
        });
        ManageMenu.add(AddNewPatientSubMenu);

        AddNewDoctorSubMenu.setText("Add New Doctor");
        AddNewDoctorSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddNewDoctorSubMenuActionPerformed(evt);
            }
        });
        ManageMenu.add(AddNewDoctorSubMenu);

        AddNewDiseaseSubMenu.setText("Add New Disease");
        AddNewDiseaseSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddNewDiseaseSubMenuActionPerformed(evt);
            }
        });
        ManageMenu.add(AddNewDiseaseSubMenu);

        DeletePatientRecordSubMenu.setText("Delete Patient Record");
        DeletePatientRecordSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DeletePatientRecordSubMenuActionPerformed(evt);
            }
        });
        ManageMenu.add(DeletePatientRecordSubMenu);

        UpdateRecordSubMenu.setText("Update Record");

        UpdatePatientSubMenu.setText("Update Patient");
        UpdatePatientSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdatePatientSubMenuActionPerformed(evt);
            }
        });
        UpdateRecordSubMenu.add(UpdatePatientSubMenu);

        UpdateDoctorSubMenu.setText("Update Doctor");
        UpdateDoctorSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateDoctorSubMenuActionPerformed(evt);
            }
        });
        UpdateRecordSubMenu.add(UpdateDoctorSubMenu);

        ManageMenu.add(UpdateRecordSubMenu);

        jMenuBar1.add(ManageMenu);

        SearchMenu.setText("Search Record");

        IDSubMenu.setText("By ID");
        IDSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                IDSubMenuActionPerformed(evt);
            }
        });
        SearchMenu.add(IDSubMenu);

        NameSubMenu.setText("By Name");
        NameSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NameSubMenuActionPerformed(evt);
            }
        });
        SearchMenu.add(NameSubMenu);

        AgeSubMenu.setText("By Age");
        AgeSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AgeSubMenuActionPerformed(evt);
            }
        });
        SearchMenu.add(AgeSubMenu);

        DiseaseSubMenu.setText("By Disease");
        DiseaseSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DiseaseSubMenuActionPerformed(evt);
            }
        });
        SearchMenu.add(DiseaseSubMenu);

        DoctorSubMenu.setText("By Doctor");
        DoctorSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DoctorSubMenuActionPerformed(evt);
            }
        });
        SearchMenu.add(DoctorSubMenu);

        DoctorByNameSubMenu.setText("Search Doctor By Name");
        DoctorByNameSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DoctorByNameSubMenuActionPerformed(evt);
            }
        });
        SearchMenu.add(DoctorByNameSubMenu);

        SpecializationSubMenu.setText("Search Doctor By Specialization");
        SpecializationSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SpecializationSubMenuActionPerformed(evt);
            }
        });
        SearchMenu.add(SpecializationSubMenu);

        jMenuBar1.add(SearchMenu);

        HelpMenu.setText("Help");

        ChangePasswordSubMenu.setText("Change Password");
        ChangePasswordSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ChangePasswordSubMenuActionPerformed(evt);
            }
        });
        HelpMenu.add(ChangePasswordSubMenu);

        AboutUsSubMenu.setText("About Us");
        AboutUsSubMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AboutUsSubMenuActionPerformed(evt);
            }
        });
        HelpMenu.add(AboutUsSubMenu);

        jMenuBar1.add(HelpMenu);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AddPatientButton)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(SearchPatientButton)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(AddDoctorButton)
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(PrintButton)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(AddPatientButton)
                    .addComponent(SearchPatientButton)
                    .addComponent(AddDoctorButton)
                    .addComponent(PrintButton))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        pack();
    }

    private void AddNewPatientSubMenuActionPerformed(ActionEvent evt) {                                                     
        AddNewPatient AddNew = new AddNewPatient();
        AddNew.setVisible(true);
        
// TODO add your handling code here:
    }                                                    

    private void AddNewDoctorSubMenuActionPerformed(ActionEvent evt) { 
        AddNewDoctor AddDoctor = new AddNewDoctor();
        AddDoctor.setVisible(true);
        // TODO add your handling code here:
    }                                                   

    private void AddNewDiseaseSubMenuActionPerformed(ActionEvent evt) { 
        AddNewDisease DM = new AddNewDisease();
        DM.setVisible(true);
        // TODO add your handling code here:
    }                                                    

    private void DeletePatientRecordSubMenuActionPerformed(ActionEvent evt) {                                                           
                
        String Del = JOptionPane.showInputDialog("Please Enter Patient ID to DELETE");
        int Del_Num = Integer.parseInt(Del);
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
            String Query ="DELETE FROM Patient_Table WHERE Patient_ID = '"+Del_Num+"'";
            statement=connection.createStatement();
            statement.executeUpdate(Query);
                    
            JOptionPane.showMessageDialog(null, "Successfully Delete Patient ID = "+Del_Num);
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
                                               

    private void UpdatePatientSubMenuActionPerformed(ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void UpdateDoctorSubMenuActionPerformed(ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void IDSubMenuActionPerformed(ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void NameSubMenuActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void AgeSubMenuActionPerformed(ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void DiseaseSubMenuActionPerformed(ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void DoctorSubMenuActionPerformed(ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void DoctorByNameSubMenuActionPerformed(ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void SpecializationSubMenuActionPerformed(ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void ChangePasswordSubMenuActionPerformed(ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void AboutUsSubMenuActionPerformed(ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void PrintButtonActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void AddDoctorButtonActionPerformed(ActionEvent evt) {                                                
    AddNewDoctor AddNew = new AddNewDoctor();
    AddNew.setVisible(true);
// TODO add your handling code here:
    }                                               

    private void SearchPatientButtonActionPerformed(ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void AddPatientButtonActionPerformed(ActionEvent evt) {                                                 
      AddNewPatient AddNew = new AddNewPatient();
      AddNew.setVisible(TRUE);
        // TODO add your handling code here:
    }
   /*  public static void main (String args[])
     {
         Administrator L = new Administrator();
         L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         L.setSize(400, 450);
         L.setVisible(true);
     }
*/
    }

