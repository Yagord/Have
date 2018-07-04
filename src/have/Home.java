package have;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;

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
    private static final Color COLOR_BUTTON_UNSELECTED = new Color(24, 26, 31);
    private static final Color COLOR_BUTTON_SELECTED = new Color(228, 228, 229);
    private static final Color COLOR_LABEL_UNSELECTED = new Color(197, 56, 53);
    private static final Color COLOR_LABEL_SELECTED = new Color(181, 53, 51);
    private static final Color COLOR_BUTTON_CLOSE_UNSELECTED = new Color(226, 226, 226);
    private static final Color COLOR_BUTTON_CLOSE_SELECTED = new Color(232, 17, 35);
    private static final Color COLOR_LABEL_CLOSE_UNSELECTED = new Color(5, 7, 8);
    private static final Color COLOR_LABEL_CLOSE_SELECTED = new Color(255, 255, 255);
    private boolean consulterPressed;
    private boolean ajouterPressed;
    private boolean supprimerPressed;
    private boolean modifierPressed;
    private GestionBaseDeDonnees gestionBaseDeDonnees;
    private int posX;
    private int posY;
    
    private void initBooleanPressed() {
        this.consulterPressed = false;
        this.ajouterPressed = false;
        this.supprimerPressed = false;
        this.modifierPressed = false;
    }
    
    private void initGestionBaseDeDonnees() {
        this.gestionBaseDeDonnees = new GestionBaseDeDonnees();
        this.chargerDonnees();
    }
    
    private void initAffichageConsulter() {
        this.afficherConsulter();
    }
    
    private void afficherConsulter() {
        this.panelConsulter.setVisible(true);
        this.panelAjouter.setVisible(false);
        this.panelSupprimer.setVisible(false);
        this.panelModifier.setVisible(false);
    }
    
    private void afficherAjouter() {
        this.panelConsulter.setVisible(false);
        this.panelAjouter.setVisible(true);
        this.panelSupprimer.setVisible(false);
        this.panelModifier.setVisible(false);
    }
    
    private void afficherSupprimer() {
        this.panelConsulter.setVisible(false);
        this.panelAjouter.setVisible(false);
        this.panelSupprimer.setVisible(true);
        this.panelModifier.setVisible(false);
    }
        
    private void afficherModifier() {
        this.panelConsulter.setVisible(false);
        this.panelAjouter.setVisible(false);
        this.panelSupprimer.setVisible(false);
        this.panelModifier.setVisible(true);
    }
    
    private void setColor(JComponent jComponent, Color color) {
        jComponent.setBackground(color);
    }
    
    private void componentPressedChangeColor(JComponent jComponent, Color color) {
        
    }

    private void componentEnteredChangeColor(JComponent jComponent, Color color) {
        
    }
        
    private void componentExitedChangeColor(JComponent jComponent, Color color) {
        
    }
    
    private void chargerDonnees() {
        java.util.ArrayList<Object[]> alLivres = new java.util.ArrayList();
        alLivres = this.gestionBaseDeDonnees.selectAllObjectsFromLivre();
        
        while (this.tableDatabase.getRowCount() > 0) {
            ((DefaultTableModel)this.tableDatabase.getModel()).removeRow(0);
        }
        for (int i = 0; i < alLivres.size(); i++) {
            ((DefaultTableModel)this.tableDatabase.getModel()).insertRow(i, alLivres.get(i));
        }
    }
    
    /**
     * Creates new form Home
     */
    public Home() {
        this.initComponents();
        this.initBooleanPressed();
        this.initGestionBaseDeDonnees();
        this.initAffichageConsulter();
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
        panelConsulter = new javax.swing.JPanel();
        scrollpaneDatabase = new javax.swing.JScrollPane();
        tableDatabase = new javax.swing.JTable();
        panelAjouter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelSupprimer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelModifier = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelButtonClose = new javax.swing.JPanel();
        labelClose = new javax.swing.JLabel();
        panelBar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        panelMain.setBackground(new java.awt.Color(226, 226, 226));
        panelMain.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMainMouseDragged(evt);
            }
        });
        panelMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMainMousePressed(evt);
            }
        });

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
        panelButtonConsulter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelButtonConsulterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelButtonConsulterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelButtonConsulterMousePressed(evt);
            }
        });
        panelButtonConsulter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelConsulter.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelConsulter.setForeground(new java.awt.Color(197, 56, 53));
        labelConsulter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConsulter.setText("Consulter");
        panelButtonConsulter.add(labelConsulter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        panelPane.add(panelButtonConsulter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 280, 40));

        panelButtonAjouter.setBackground(new java.awt.Color(24, 26, 31));
        panelButtonAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelButtonAjouterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelButtonAjouterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelButtonAjouterMousePressed(evt);
            }
        });
        panelButtonAjouter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAjouter.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelAjouter.setForeground(new java.awt.Color(197, 56, 53));
        labelAjouter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAjouter.setText("Ajouter");
        panelButtonAjouter.add(labelAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        panelPane.add(panelButtonAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 280, 40));

        panelButtonSupprimer.setBackground(new java.awt.Color(24, 26, 31));
        panelButtonSupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelButtonSupprimerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelButtonSupprimerMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelButtonSupprimerMousePressed(evt);
            }
        });
        panelButtonSupprimer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelSupprimer.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelSupprimer.setForeground(new java.awt.Color(197, 56, 53));
        labelSupprimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSupprimer.setText("Supprimer");
        panelButtonSupprimer.add(labelSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        panelPane.add(panelButtonSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 280, 40));

        panelButtonModifier.setBackground(new java.awt.Color(24, 26, 31));
        panelButtonModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelButtonModifierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelButtonModifierMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelButtonModifierMousePressed(evt);
            }
        });
        panelButtonModifier.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelModifier.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelModifier.setForeground(new java.awt.Color(197, 56, 53));
        labelModifier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModifier.setText("Modifier");
        panelButtonModifier.add(labelModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        panelPane.add(panelButtonModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 280, 40));

        panelData.setBackground(new java.awt.Color(242, 244, 247));
        panelData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelConsulter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollpaneDatabase.setBorder(null);
        scrollpaneDatabase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        scrollpaneDatabase.setPreferredSize(new java.awt.Dimension(600, 500));

        tableDatabase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableDatabase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Titre", "Auteur", "Numero", "Categorie", "Emplacement"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDatabase.setGridColor(new java.awt.Color(255, 255, 255));
        tableDatabase.getTableHeader().setReorderingAllowed(false);
        scrollpaneDatabase.setViewportView(tableDatabase);
        if (tableDatabase.getColumnModel().getColumnCount() > 0) {
            tableDatabase.getColumnModel().getColumn(0).setResizable(false);
            tableDatabase.getColumnModel().getColumn(1).setResizable(false);
            tableDatabase.getColumnModel().getColumn(2).setResizable(false);
            tableDatabase.getColumnModel().getColumn(3).setResizable(false);
            tableDatabase.getColumnModel().getColumn(4).setResizable(false);
            tableDatabase.getColumnModel().getColumn(5).setResizable(false);
        }

        panelConsulter.add(scrollpaneDatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        panelData.add(panelConsulter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        jLabel1.setText("Ajout");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout panelAjouterLayout = new javax.swing.GroupLayout(panelAjouter);
        panelAjouter.setLayout(panelAjouterLayout);
        panelAjouterLayout.setHorizontalGroup(
            panelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAjouterLayout.createSequentialGroup()
                .addGroup(panelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAjouterLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1))
                    .addGroup(panelAjouterLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jButton1)))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        panelAjouterLayout.setVerticalGroup(
            panelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAjouterLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addComponent(jButton1)
                .addContainerGap(344, Short.MAX_VALUE))
        );

        panelData.add(panelAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        jLabel3.setText("Supprimer");

        javax.swing.GroupLayout panelSupprimerLayout = new javax.swing.GroupLayout(panelSupprimer);
        panelSupprimer.setLayout(panelSupprimerLayout);
        panelSupprimerLayout.setHorizontalGroup(
            panelSupprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSupprimerLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel3)
                .addContainerGap(409, Short.MAX_VALUE))
        );
        panelSupprimerLayout.setVerticalGroup(
            panelSupprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSupprimerLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        panelData.add(panelSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setText("Modifier");

        javax.swing.GroupLayout panelModifierLayout = new javax.swing.GroupLayout(panelModifier);
        panelModifier.setLayout(panelModifierLayout);
        panelModifierLayout.setHorizontalGroup(
            panelModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModifierLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel2)
                .addContainerGap(449, Short.MAX_VALUE))
        );
        panelModifierLayout.setVerticalGroup(
            panelModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModifierLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addContainerGap(410, Short.MAX_VALUE))
        );

        panelData.add(panelModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelButtonClose.setBackground(new java.awt.Color(226, 226, 226));
        panelButtonClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelButtonCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelButtonCloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelButtonCloseMousePressed(evt);
            }
        });

        labelClose.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelClose.setForeground(new java.awt.Color(5, 7, 8));
        labelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClose.setText("X");

        javax.swing.GroupLayout panelButtonCloseLayout = new javax.swing.GroupLayout(panelButtonClose);
        panelButtonClose.setLayout(panelButtonCloseLayout);
        panelButtonCloseLayout.setHorizontalGroup(
            panelButtonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        panelButtonCloseLayout.setVerticalGroup(
            panelButtonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        panelBar.setBackground(new java.awt.Color(24, 26, 31));

        javax.swing.GroupLayout panelBarLayout = new javax.swing.GroupLayout(panelBar);
        panelBar.setLayout(panelBarLayout);
        panelBarLayout.setHorizontalGroup(
            panelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );
        panelBarLayout.setVerticalGroup(
            panelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                        .addComponent(panelData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(panelBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(panelData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void panelButtonConsulterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonConsulterMousePressed
        this.chargerDonnees();
        
        this.afficherConsulter();
        
        this.consulterPressed = true;
        this.ajouterPressed = false;
        this.supprimerPressed = false;
        this.modifierPressed = false;
        
        this.setColor(this.panelButtonConsulter, Home.COLOR_BUTTON_SELECTED);
        this.setColor(this.panelButtonAjouter, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonSupprimer, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonModifier, Home.COLOR_BUTTON_UNSELECTED);
        
        this.setColor(this.labelConsulter, Home.COLOR_LABEL_SELECTED);
        this.setColor(this.labelAjouter, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelSupprimer, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelModifier, Home.COLOR_LABEL_UNSELECTED);
    }//GEN-LAST:event_panelButtonConsulterMousePressed

    private void panelButtonConsulterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonConsulterMouseEntered
        if (!this.consulterPressed) {
            this.setColor(this.panelButtonConsulter, Home.COLOR_BUTTON_SELECTED);
            this.setColor(this.labelConsulter, Home.COLOR_LABEL_SELECTED);
        }
    }//GEN-LAST:event_panelButtonConsulterMouseEntered

    private void panelButtonConsulterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonConsulterMouseExited
        if (!this.consulterPressed) {
            this.setColor(this.panelButtonConsulter, Home.COLOR_BUTTON_UNSELECTED);
            this.setColor(this.labelConsulter, Home.COLOR_LABEL_UNSELECTED);
        }
    }//GEN-LAST:event_panelButtonConsulterMouseExited

    private void panelButtonAjouterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonAjouterMousePressed
        this.afficherAjouter();
        
        this.consulterPressed = false;
        this.ajouterPressed = true;
        this.supprimerPressed = false;
        this.modifierPressed = false;
        
        this.setColor(this.panelButtonConsulter, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonAjouter, Home.COLOR_BUTTON_SELECTED);
        this.setColor(this.panelButtonSupprimer, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonModifier, Home.COLOR_BUTTON_UNSELECTED);
        
        this.setColor(this.labelConsulter, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelAjouter, Home.COLOR_LABEL_SELECTED);
        this.setColor(this.labelSupprimer, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelModifier, Home.COLOR_LABEL_UNSELECTED);
    }//GEN-LAST:event_panelButtonAjouterMousePressed

    private void panelButtonAjouterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonAjouterMouseEntered
        if (!this.ajouterPressed) {
            this.setColor(this.panelButtonAjouter, Home.COLOR_BUTTON_SELECTED);
            this.setColor(this.labelAjouter, Home.COLOR_LABEL_SELECTED);
        }
    }//GEN-LAST:event_panelButtonAjouterMouseEntered

    private void panelButtonAjouterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonAjouterMouseExited
        if (!this.ajouterPressed) {
            this.setColor(this.panelButtonAjouter, Home.COLOR_BUTTON_UNSELECTED);
            this.setColor(this.labelAjouter, Home.COLOR_LABEL_UNSELECTED);
        }
    }//GEN-LAST:event_panelButtonAjouterMouseExited

    private void panelButtonSupprimerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonSupprimerMousePressed
        this.afficherSupprimer();
        
        this.consulterPressed = false;
        this.ajouterPressed = false;
        this.supprimerPressed = true;
        this.modifierPressed = false;
        
        this.setColor(this.panelButtonConsulter, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonAjouter, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonSupprimer, Home.COLOR_BUTTON_SELECTED);
        this.setColor(this.panelButtonModifier, Home.COLOR_BUTTON_UNSELECTED);
        
        this.setColor(this.labelConsulter, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelAjouter, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelSupprimer, Home.COLOR_LABEL_SELECTED);
        this.setColor(this.labelModifier, Home.COLOR_LABEL_UNSELECTED);
    }//GEN-LAST:event_panelButtonSupprimerMousePressed

    private void panelButtonSupprimerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonSupprimerMouseEntered
        if (!this.supprimerPressed) {
            this.setColor(this.panelButtonSupprimer, Home.COLOR_BUTTON_SELECTED);
            this.setColor(this.labelSupprimer, Home.COLOR_LABEL_SELECTED);
        }
    }//GEN-LAST:event_panelButtonSupprimerMouseEntered

    private void panelButtonSupprimerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonSupprimerMouseExited
        if (!this.supprimerPressed) {
            this.setColor(this.panelButtonSupprimer, Home.COLOR_BUTTON_UNSELECTED);
            this.setColor(this.labelSupprimer, Home.COLOR_LABEL_UNSELECTED);
        }
    }//GEN-LAST:event_panelButtonSupprimerMouseExited

    private void panelButtonModifierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonModifierMousePressed
        this.afficherModifier();
        this.consulterPressed = false;
        this.ajouterPressed = false;
        this.supprimerPressed = false;
        this.modifierPressed = true;
        
        this.setColor(this.panelButtonConsulter, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonAjouter, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonSupprimer, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonModifier, Home.COLOR_BUTTON_SELECTED);
        
        this.setColor(this.labelConsulter, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelAjouter, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelSupprimer, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelModifier, Home.COLOR_LABEL_SELECTED);
    }//GEN-LAST:event_panelButtonModifierMousePressed

    private void panelButtonModifierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonModifierMouseEntered
        if (!this.modifierPressed) {
            this.setColor(this.panelButtonModifier, Home.COLOR_BUTTON_SELECTED);
            this.setColor(this.labelModifier, Home.COLOR_LABEL_SELECTED);
        }
    }//GEN-LAST:event_panelButtonModifierMouseEntered

    private void panelButtonModifierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonModifierMouseExited
        if (!this.modifierPressed) {
            this.setColor(this.panelButtonModifier, Home.COLOR_BUTTON_UNSELECTED);
            this.setColor(this.labelModifier, Home.COLOR_LABEL_UNSELECTED);
        }
    }//GEN-LAST:event_panelButtonModifierMouseExited

    private void panelButtonCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonCloseMousePressed
        this.setColor(this.panelButtonClose, COLOR_BUTTON_CLOSE_SELECTED);
        this.setColor(this.labelClose, COLOR_LABEL_CLOSE_SELECTED);
        this.gestionBaseDeDonnees.fermerConnection();
        this.dispose();
    }//GEN-LAST:event_panelButtonCloseMousePressed

    private void panelButtonCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonCloseMouseEntered
        this.setColor(this.panelButtonClose, COLOR_BUTTON_CLOSE_SELECTED);
        this.setColor(this.labelClose, COLOR_LABEL_CLOSE_SELECTED);
    }//GEN-LAST:event_panelButtonCloseMouseEntered

    private void panelButtonCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonCloseMouseExited
        this.setColor(this.panelButtonClose, COLOR_BUTTON_CLOSE_UNSELECTED);
        this.setColor(this.labelClose, COLOR_LABEL_CLOSE_UNSELECTED);
    }//GEN-LAST:event_panelButtonCloseMouseExited

    private void panelMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMainMousePressed
        this.posX = evt.getX();
        this.posY = evt.getY();
    }//GEN-LAST:event_panelMainMousePressed

    private void panelMainMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMainMouseDragged
        // TODO add your handling code here:
        int newX = evt.getXOnScreen();
        int newY = evt.getYOnScreen();
        
        this.setLocation(newX - this.posX, newY - this.posY);
    }//GEN-LAST:event_panelMainMouseDragged

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelAjouter;
    private javax.swing.JLabel labelClose;
    private javax.swing.JLabel labelConsulter;
    private javax.swing.JLabel labelHave;
    private javax.swing.JLabel labelModifier;
    private javax.swing.JLabel labelSupprimer;
    private javax.swing.JPanel panelAjouter;
    private javax.swing.JPanel panelBar;
    private javax.swing.JPanel panelButtonAjouter;
    private javax.swing.JPanel panelButtonClose;
    private javax.swing.JPanel panelButtonConsulter;
    private javax.swing.JPanel panelButtonModifier;
    private javax.swing.JPanel panelButtonSupprimer;
    private javax.swing.JPanel panelConsulter;
    private javax.swing.JPanel panelData;
    private javax.swing.JPanel panelHave;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelModifier;
    private javax.swing.JPanel panelPane;
    private javax.swing.JPanel panelSupprimer;
    private javax.swing.JScrollPane scrollpaneDatabase;
    private javax.swing.JTable tableDatabase;
    // End of variables declaration//GEN-END:variables
}
