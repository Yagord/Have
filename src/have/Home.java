package have;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pierre-Nicolas
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelPane = new javax.swing.JPanel();
        panelHave = new javax.swing.JPanel();
        labelHave = new javax.swing.JLabel();
        panelButtonConsulter = new javax.swing.JPanel();
        labelConsulter = new javax.swing.JLabel();
        panelButtonAjouter = new javax.swing.JPanel();
        labelAjouter = new javax.swing.JLabel();
        panelButtonSupprimer = new javax.swing.JPanel();
        labelSupprimer = new javax.swing.JLabel();
        panelButtonModifier = new javax.swing.JPanel();
        labelModifier = new javax.swing.JLabel();
        panelData = new javax.swing.JPanel();
        scrollpaneDatabase = new javax.swing.JScrollPane();
        tableDatabase = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        panelMain.setBackground(new java.awt.Color(226, 226, 226));

        panelPane.setBackground(new java.awt.Color(24, 26, 31));
        panelPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHave.setBackground(new java.awt.Color(24, 26, 31));
        panelHave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelHave.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        labelHave.setForeground(new java.awt.Color(197, 56, 53));
        labelHave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHave.setText("HAVE");
        panelHave.add(labelHave, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 70));

        panelPane.add(panelHave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 180, 70));

        panelButtonConsulter.setBackground(new java.awt.Color(24, 26, 31));
        panelButtonConsulter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelConsulter.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelConsulter.setForeground(new java.awt.Color(197, 56, 53));
        labelConsulter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConsulter.setText("Consulter");
        panelButtonConsulter.add(labelConsulter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        panelPane.add(panelButtonConsulter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 280, 40));

        panelButtonAjouter.setBackground(new java.awt.Color(24, 26, 31));
        panelButtonAjouter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAjouter.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelAjouter.setForeground(new java.awt.Color(197, 56, 53));
        labelAjouter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAjouter.setText("Ajouter");
        panelButtonAjouter.add(labelAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        panelPane.add(panelButtonAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 280, 40));

        panelButtonSupprimer.setBackground(new java.awt.Color(24, 26, 31));
        panelButtonSupprimer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelSupprimer.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelSupprimer.setForeground(new java.awt.Color(197, 56, 53));
        labelSupprimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSupprimer.setText("Supprimer");
        panelButtonSupprimer.add(labelSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        panelPane.add(panelButtonSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 280, 40));

        panelButtonModifier.setBackground(new java.awt.Color(24, 26, 31));
        panelButtonModifier.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelModifier.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelModifier.setForeground(new java.awt.Color(197, 56, 53));
        labelModifier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModifier.setText("Modifier");
        panelButtonModifier.add(labelModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        panelPane.add(panelButtonModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 280, 40));

        panelData.setBackground(new java.awt.Color(242, 244, 247));

        tableDatabase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollpaneDatabase.setViewportView(tableDatabase);

        javax.swing.GroupLayout panelDataLayout = new javax.swing.GroupLayout(panelData);
        panelData.setLayout(panelDataLayout);
        panelDataLayout.setHorizontalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpaneDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
        panelDataLayout.setVerticalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addComponent(scrollpaneDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panelPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panelData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelAjouter;
    private javax.swing.JLabel labelConsulter;
    private javax.swing.JLabel labelHave;
    private javax.swing.JLabel labelModifier;
    private javax.swing.JLabel labelSupprimer;
    private javax.swing.JPanel panelButtonAjouter;
    private javax.swing.JPanel panelButtonConsulter;
    private javax.swing.JPanel panelButtonModifier;
    private javax.swing.JPanel panelButtonSupprimer;
    private javax.swing.JPanel panelData;
    private javax.swing.JPanel panelHave;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelPane;
    private javax.swing.JScrollPane scrollpaneDatabase;
    private javax.swing.JTable tableDatabase;
    // End of variables declaration//GEN-END:variables
}
