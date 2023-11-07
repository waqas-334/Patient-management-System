
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.LayoutStyle;


public class Guest extends JFrame
{
    private JMenuItem AboutUsGue;
    private JMenuItem ChangePasswordGue;
    private JMenu HelpGue;
    private JButton PrintButtonGue;
    private JMenu PrintRecordMenuGue;
    private JButton SearchButtonGue;
    private JMenuItem SearchByAgeGue;
    private JMenuItem SearchByIdGue;
    private JMenuItem SearchByNameGue;
    private JMenu SearchRecordMenuGue;
    private JMenuBar jMenuBar;
    
    
    public Guest()
    {
     super("GUEST");  
        SearchButtonGue = new JButton();
        PrintButtonGue = new JButton();
       
        SearchRecordMenuGue = new JMenu();
        SearchByNameGue = new JMenuItem();
        SearchByIdGue = new JMenuItem();
        SearchByAgeGue = new JMenuItem();
        PrintRecordMenuGue = new JMenu();
        HelpGue = new JMenu();
        ChangePasswordGue = new JMenuItem();
        AboutUsGue = new JMenuItem();
        jMenuBar = new JMenuBar();
        
       // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchButtonGue.setText("Search");
        SearchButtonGue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SearchButtonGueActionPerformed(evt);
            }
        });

        PrintButtonGue.setText("Print");
        PrintButtonGue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PrintButtonGueActionPerformed(evt);
            }
        });

        SearchRecordMenuGue.setText("Search Record");

        SearchByNameGue.setText("Search By Name");
        SearchByNameGue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SearchByNameGueActionPerformed(evt);
            }
        });
        SearchRecordMenuGue.add(SearchByNameGue);

        SearchByIdGue.setText("Search By ID");
        SearchByIdGue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SearchByIdGueActionPerformed(evt);
            }
        });
        SearchRecordMenuGue.add(SearchByIdGue);

        SearchByAgeGue.setText("Search By Age");
        SearchByAgeGue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SearchByAgeGueActionPerformed(evt);
            }
        });
        SearchRecordMenuGue.add(SearchByAgeGue);
        jMenuBar.add(SearchRecordMenuGue);
        
        PrintRecordMenuGue.setText("Print Record");
        PrintRecordMenuGue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PrintRecordMenuGueActionPerformed(evt);
            }

            private void PrintRecordMenuGueActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        jMenuBar.add(PrintRecordMenuGue);
        
        
        HelpGue.setText("Help");
        
        ChangePasswordGue.setText("Change Password");
        ChangePasswordGue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ChangePasswordGueActionPerformed(evt);
            }
        });
        HelpGue.add(ChangePasswordGue);

        AboutUsGue.setText("About Us");
        AboutUsGue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AboutUsGueActionPerformed(evt);
            }
        });
        HelpGue.add(AboutUsGue);
        jMenuBar.add(HelpGue);

        setJMenuBar(jMenuBar);
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SearchButtonGue)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrintButtonGue)
                .addGap(0, 79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchButtonGue)
                    .addComponent(PrintButtonGue))
                .addGap(0, 63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void SearchButtonGueActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void PrintButtonGueActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void SearchByNameGueActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void SearchByIdGueActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void SearchByAgeGueActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void ChangePasswordGueActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void AboutUsGueActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }
  /* public static void main (String args[])
     {
         Guest L = new Guest();
         L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         L.setSize(300, 200);
         L.setVisible(true);
     }
  */
}
