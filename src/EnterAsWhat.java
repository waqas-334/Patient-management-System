
import javax.swing.*;


public class EnterAsWhat extends JFrame
{
    private JButton AdministratorButton;
    private JLabel EnterAsAwhatLabel;
    private JButton GuestButton;
    
    
   public EnterAsWhat()
    {
        super("Patient Managment System");
        EnterAsAwhatLabel = new JLabel();
        AdministratorButton = new JButton();
        GuestButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        EnterAsAwhatLabel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        EnterAsAwhatLabel.setForeground(new java.awt.Color(51, 0, 255));
        EnterAsAwhatLabel.setHorizontalAlignment(SwingConstants.CENTER);
        EnterAsAwhatLabel.setText("Please Confirm Who are You");

        AdministratorButton.setText("ADMINISTRATOR");
        AdministratorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministratorButtonActionPerformed(evt);
            }
        });

        GuestButton.setText("GUEST");
        GuestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuestButtonActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(EnterAsAwhatLabel, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(AdministratorButton, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(GuestButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EnterAsAwhatLabel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdministratorButton, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(GuestButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void AdministratorButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
    AdministratorLogin Log = new AdministratorLogin();
    Log.setVisible(true);
    dispose();
// TODO add your handling code here:
    }                                                   

    private void GuestButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        Guest G = new Guest();
        G.setVisible(true);
        dispose();
// TODO add your handling code here:
    }
    
 public static void main (String args[])
     {
         EnterAsWhat newApp = new EnterAsWhat();
         newApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         newApp.setSize(400, 400);
         newApp.setVisible(true);
     }

    }

