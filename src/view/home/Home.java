package view.home;

import database.GestionBaseDeDonnees;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
    private static final Color COLOR_SEPARATOR_UNSELECTED = new Color(197, 56, 53);
    private static final Color COLOR_SEPARATOR_SELECTED = new Color(228, 228, 229);
    private static final Color COLOR_BUTTON_DATA_UNSELECTED = new Color(203, 65, 62);
    private static final Color COLOR_BUTTON_DATA_SELECTED = new Color(197, 56, 53);
    private static final Color COLOR_LABEL_DATA_UNSELECTED = new Color(233, 233, 233);
    private static final Color COLOR_LABEL_DATA_SELECTED = new Color(251, 205, 63);
    private boolean consulterPressed;
    private boolean ajouterPressed;
    private boolean supprimerPressed;
    private boolean modifierPressed;
    private boolean ajouterDataPressed;
    private boolean supprimerDataPressed;
    private boolean modifierDataPressed;
    private GestionBaseDeDonnees gestionBaseDeDonnees;
    private int posX;
    private int posY;
    
    private void initBooleanPressed() {
        this.consulterPressed = false;
        this.ajouterPressed = false;
        this.supprimerPressed = false;
        this.modifierPressed = false;
        this.ajouterDataPressed = false;
        this.supprimerDataPressed = false;
        this.modifierDataPressed = false;
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
    
    private void setColor(JPanel jPanel, Color color) {
        jPanel.setBackground(color);
    }
    
    private void setColor(JLabel jLabel, Color color) {
        jLabel.setForeground(color);
    }
    
    private void componentPressedChangeColor(JComponent jComponent, Color color) {
    
    }

    private void componentEnteredChangeColor(JComponent jComponent, Color color) {
        
    }
        
    private void componentExitedChangeColor(JComponent jComponent, Color color) {
        
    }
    
    private void panelButtonModifierMousePressed() {
        this.afficherModifier();
        this.consulterPressed = false;
        this.ajouterPressed = false;
        this.supprimerPressed = false;
        this.modifierPressed = true;

        this.setColor(this.panelButtonConsulter, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonAjouter, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonSupprimer, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonModifier, Home.COLOR_BUTTON_SELECTED);
        
        this.setColor(this.panelHideSeparatorConsulter, Home.COLOR_SEPARATOR_UNSELECTED);
        this.setColor(this.panelHideSeparatorAjouter, Home.COLOR_SEPARATOR_UNSELECTED);
        this.setColor(this.panelHideSeparatorSupprimer, Home.COLOR_SEPARATOR_UNSELECTED);
        this.setColor(this.panelHideSeparatorModifier, Home.COLOR_SEPARATOR_SELECTED);
        
        this.setColor(this.labelConsulter, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelAjouter, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelSupprimer, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelModifier, Home.COLOR_LABEL_SELECTED);        
    }
    
    private void panelButtonSupprimerMousePressed() {
        this.afficherSupprimer();

        this.consulterPressed = false;
        this.ajouterPressed = false;
        this.supprimerPressed = true;
        this.modifierPressed = false;

        this.setColor(this.panelButtonConsulter, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonAjouter, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonSupprimer, Home.COLOR_BUTTON_SELECTED);
        this.setColor(this.panelButtonModifier, Home.COLOR_BUTTON_UNSELECTED);
        
        this.setColor(this.panelHideSeparatorConsulter, Home.COLOR_SEPARATOR_UNSELECTED);
        this.setColor(this.panelHideSeparatorAjouter, Home.COLOR_SEPARATOR_UNSELECTED);
        this.setColor(this.panelHideSeparatorSupprimer, Home.COLOR_SEPARATOR_SELECTED);
        this.setColor(this.panelHideSeparatorModifier, Home.COLOR_SEPARATOR_UNSELECTED);

        this.setColor(this.labelConsulter, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelAjouter, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelSupprimer, Home.COLOR_LABEL_SELECTED);
        this.setColor(this.labelModifier, Home.COLOR_LABEL_UNSELECTED);        
    }
    
    private void panelButtonAjouterMousePressed() {
        this.afficherAjouter();

        this.consulterPressed = false;
        this.ajouterPressed = true;
        this.supprimerPressed = false;
        this.modifierPressed = false;

        this.setColor(this.panelButtonConsulter, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonAjouter, Home.COLOR_BUTTON_SELECTED);
        this.setColor(this.panelButtonSupprimer, Home.COLOR_BUTTON_UNSELECTED);
        this.setColor(this.panelButtonModifier, Home.COLOR_BUTTON_UNSELECTED);
        
        this.setColor(this.panelHideSeparatorConsulter, Home.COLOR_SEPARATOR_UNSELECTED);
        this.setColor(this.panelHideSeparatorAjouter, Home.COLOR_SEPARATOR_SELECTED);
        this.setColor(this.panelHideSeparatorSupprimer, Home.COLOR_SEPARATOR_UNSELECTED);
        this.setColor(this.panelHideSeparatorModifier, Home.COLOR_SEPARATOR_UNSELECTED);

        this.setColor(this.labelConsulter, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelAjouter, Home.COLOR_LABEL_SELECTED);
        this.setColor(this.labelSupprimer, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelModifier, Home.COLOR_LABEL_UNSELECTED);        
    }
    
    private void panelButtonConsulterMousePressed() {
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
        
        this.setColor(this.panelHideSeparatorConsulter, Home.COLOR_SEPARATOR_SELECTED);
        this.setColor(this.panelHideSeparatorAjouter, Home.COLOR_SEPARATOR_UNSELECTED);
        this.setColor(this.panelHideSeparatorSupprimer, Home.COLOR_SEPARATOR_UNSELECTED);
        this.setColor(this.panelHideSeparatorModifier, Home.COLOR_SEPARATOR_UNSELECTED);

        this.setColor(this.labelConsulter, Home.COLOR_LABEL_SELECTED);
        this.setColor(this.labelAjouter, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelSupprimer, Home.COLOR_LABEL_UNSELECTED);
        this.setColor(this.labelModifier, Home.COLOR_LABEL_UNSELECTED);        
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
        panelSeparator = new javax.swing.JPanel();
        panelHave = new javax.swing.JPanel();
        labelHave = new javax.swing.JLabel();
        panelButtonConsulter = new javax.swing.JPanel();
        labelConsulter = new javax.swing.JLabel();
        panelHideSeparatorConsulter = new javax.swing.JPanel();
        panelButtonAjouter = new javax.swing.JPanel();
        labelAjouter = new javax.swing.JLabel();
        panelHideSeparatorAjouter = new javax.swing.JPanel();
        panelButtonSupprimer = new javax.swing.JPanel();
        labelSupprimer = new javax.swing.JLabel();
        panelHideSeparatorSupprimer = new javax.swing.JPanel();
        panelButtonModifier = new javax.swing.JPanel();
        labelModifier = new javax.swing.JLabel();
        panelHideSeparatorModifier = new javax.swing.JPanel();
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
        panelImage = new javax.swing.JPanel();
        panelAjouterUnLivre = new javax.swing.JPanel();
        labelAjouterUnLivre = new javax.swing.JLabel();
        panelSupprimerUnLivre = new javax.swing.JPanel();
        labelSupprimerUnLivre = new javax.swing.JLabel();
        panelModifierUnLivre = new javax.swing.JPanel();
        labelModifierUnLivre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        panelMain.setBackground(new java.awt.Color(24, 26, 31));
        panelMain.setPreferredSize(new java.awt.Dimension(1200, 650));
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

        panelSeparator.setBackground(new java.awt.Color(197, 56, 53));
        panelSeparator.setPreferredSize(new java.awt.Dimension(5, 650));

        javax.swing.GroupLayout panelSeparatorLayout = new javax.swing.GroupLayout(panelSeparator);
        panelSeparator.setLayout(panelSeparatorLayout);
        panelSeparatorLayout.setHorizontalGroup(
            panelSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelSeparatorLayout.setVerticalGroup(
            panelSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        panelPane.add(panelSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 0, 5, 650));

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

        panelHideSeparatorConsulter.setBackground(new java.awt.Color(197, 56, 53));

        javax.swing.GroupLayout panelHideSeparatorConsulterLayout = new javax.swing.GroupLayout(panelHideSeparatorConsulter);
        panelHideSeparatorConsulter.setLayout(panelHideSeparatorConsulterLayout);
        panelHideSeparatorConsulterLayout.setHorizontalGroup(
            panelHideSeparatorConsulterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        panelHideSeparatorConsulterLayout.setVerticalGroup(
            panelHideSeparatorConsulterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelButtonConsulter.add(panelHideSeparatorConsulter, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 0, -1, -1));

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

        panelHideSeparatorAjouter.setBackground(new java.awt.Color(197, 56, 53));

        javax.swing.GroupLayout panelHideSeparatorAjouterLayout = new javax.swing.GroupLayout(panelHideSeparatorAjouter);
        panelHideSeparatorAjouter.setLayout(panelHideSeparatorAjouterLayout);
        panelHideSeparatorAjouterLayout.setHorizontalGroup(
            panelHideSeparatorAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        panelHideSeparatorAjouterLayout.setVerticalGroup(
            panelHideSeparatorAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelButtonAjouter.add(panelHideSeparatorAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 0, -1, -1));

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

        panelHideSeparatorSupprimer.setBackground(new java.awt.Color(197, 56, 53));

        javax.swing.GroupLayout panelHideSeparatorSupprimerLayout = new javax.swing.GroupLayout(panelHideSeparatorSupprimer);
        panelHideSeparatorSupprimer.setLayout(panelHideSeparatorSupprimerLayout);
        panelHideSeparatorSupprimerLayout.setHorizontalGroup(
            panelHideSeparatorSupprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        panelHideSeparatorSupprimerLayout.setVerticalGroup(
            panelHideSeparatorSupprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelButtonSupprimer.add(panelHideSeparatorSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 0, -1, -1));

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

        panelHideSeparatorModifier.setBackground(new java.awt.Color(197, 56, 53));

        javax.swing.GroupLayout panelHideSeparatorModifierLayout = new javax.swing.GroupLayout(panelHideSeparatorModifier);
        panelHideSeparatorModifier.setLayout(panelHideSeparatorModifierLayout);
        panelHideSeparatorModifierLayout.setHorizontalGroup(
            panelHideSeparatorModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        panelHideSeparatorModifierLayout.setVerticalGroup(
            panelHideSeparatorModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelButtonModifier.add(panelHideSeparatorModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 0, -1, -1));

        panelPane.add(panelButtonModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 280, 40));

        panelData.setBackground(new java.awt.Color(242, 244, 247));
        panelData.setMinimumSize(new java.awt.Dimension(600, 500));
        panelData.setPreferredSize(new java.awt.Dimension(650, 525));
        panelData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelConsulter.setPreferredSize(new java.awt.Dimension(650, 525));
        panelConsulter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollpaneDatabase.setBorder(null);
        scrollpaneDatabase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        scrollpaneDatabase.setPreferredSize(new java.awt.Dimension(650, 525));

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

        panelConsulter.add(scrollpaneDatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 525));

        panelData.add(panelConsulter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        panelAjouter.setPreferredSize(new java.awt.Dimension(650, 525));

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

        panelSupprimer.setPreferredSize(new java.awt.Dimension(650, 525));

        jLabel3.setText("Supprimer");

        javax.swing.GroupLayout panelSupprimerLayout = new javax.swing.GroupLayout(panelSupprimer);
        panelSupprimer.setLayout(panelSupprimerLayout);
        panelSupprimerLayout.setHorizontalGroup(
            panelSupprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSupprimerLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel3)
                .addContainerGap(459, Short.MAX_VALUE))
        );
        panelSupprimerLayout.setVerticalGroup(
            panelSupprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSupprimerLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addContainerGap(434, Short.MAX_VALUE))
        );

        panelData.add(panelSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelModifier.setPreferredSize(new java.awt.Dimension(650, 525));

        jLabel2.setText("Modifier");

        javax.swing.GroupLayout panelModifierLayout = new javax.swing.GroupLayout(panelModifier);
        panelModifier.setLayout(panelModifierLayout);
        panelModifierLayout.setHorizontalGroup(
            panelModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModifierLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel2)
                .addContainerGap(499, Short.MAX_VALUE))
        );
        panelModifierLayout.setVerticalGroup(
            panelModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModifierLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addContainerGap(435, Short.MAX_VALUE))
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

        javax.swing.GroupLayout panelImageLayout = new javax.swing.GroupLayout(panelImage);
        panelImage.setLayout(panelImageLayout);
        panelImageLayout.setHorizontalGroup(
            panelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelImageLayout.setVerticalGroup(
            panelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        panelAjouterUnLivre.setBackground(new java.awt.Color(203, 65, 62));
        panelAjouterUnLivre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelAjouterUnLivreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelAjouterUnLivreMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelAjouterUnLivreMousePressed(evt);
            }
        });

        labelAjouterUnLivre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelAjouterUnLivre.setForeground(new java.awt.Color(233, 233, 233));
        labelAjouterUnLivre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAjouterUnLivre.setText("Ajouter un livre");

        javax.swing.GroupLayout panelAjouterUnLivreLayout = new javax.swing.GroupLayout(panelAjouterUnLivre);
        panelAjouterUnLivre.setLayout(panelAjouterUnLivreLayout);
        panelAjouterUnLivreLayout.setHorizontalGroup(
            panelAjouterUnLivreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAjouterUnLivre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelAjouterUnLivreLayout.setVerticalGroup(
            panelAjouterUnLivreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAjouterUnLivre, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        panelSupprimerUnLivre.setBackground(new java.awt.Color(203, 65, 62));
        panelSupprimerUnLivre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelSupprimerUnLivreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelSupprimerUnLivreMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelSupprimerUnLivreMousePressed(evt);
            }
        });

        labelSupprimerUnLivre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSupprimerUnLivre.setForeground(new java.awt.Color(233, 233, 233));
        labelSupprimerUnLivre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSupprimerUnLivre.setText("Supprimer un livre");

        javax.swing.GroupLayout panelSupprimerUnLivreLayout = new javax.swing.GroupLayout(panelSupprimerUnLivre);
        panelSupprimerUnLivre.setLayout(panelSupprimerUnLivreLayout);
        panelSupprimerUnLivreLayout.setHorizontalGroup(
            panelSupprimerUnLivreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSupprimerUnLivre, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
        );
        panelSupprimerUnLivreLayout.setVerticalGroup(
            panelSupprimerUnLivreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSupprimerUnLivre, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        panelModifierUnLivre.setBackground(new java.awt.Color(203, 65, 62));
        panelModifierUnLivre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelModifierUnLivreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelModifierUnLivreMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelModifierUnLivreMousePressed(evt);
            }
        });

        labelModifierUnLivre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelModifierUnLivre.setForeground(new java.awt.Color(233, 233, 233));
        labelModifierUnLivre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModifierUnLivre.setText("Modifier un livre");

        javax.swing.GroupLayout panelModifierUnLivreLayout = new javax.swing.GroupLayout(panelModifierUnLivre);
        panelModifierUnLivre.setLayout(panelModifierUnLivreLayout);
        panelModifierUnLivreLayout.setHorizontalGroup(
            panelModifierUnLivreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelModifierUnLivre, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
        );
        panelModifierUnLivreLayout.setVerticalGroup(
            panelModifierUnLivreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelModifierUnLivre, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAjouterUnLivre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelModifierUnLivre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSupprimerUnLivre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(panelBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(402, 402, 402)
                        .addComponent(panelButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(panelData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(panelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(panelAjouterUnLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelSupprimerUnLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelModifierUnLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelData.getAccessibleContext().setAccessibleName("");
        panelData.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1202, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void panelButtonCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonCloseMousePressed
        this.setColor(this.panelButtonClose, COLOR_BUTTON_CLOSE_SELECTED);
        this.setColor(this.labelClose, COLOR_LABEL_CLOSE_SELECTED);
        this.gestionBaseDeDonnees.fermerConnection();
        this.dispose();
    }//GEN-LAST:event_panelButtonCloseMousePressed

    private void panelButtonCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonCloseMouseExited
        this.setColor(this.panelButtonClose, COLOR_BUTTON_CLOSE_UNSELECTED);
        this.setColor(this.labelClose, COLOR_LABEL_CLOSE_UNSELECTED);
    }//GEN-LAST:event_panelButtonCloseMouseExited

    private void panelButtonCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonCloseMouseEntered
        this.setColor(this.panelButtonClose, COLOR_BUTTON_CLOSE_SELECTED);
        this.setColor(this.labelClose, COLOR_LABEL_CLOSE_SELECTED);
    }//GEN-LAST:event_panelButtonCloseMouseEntered

    private void panelButtonModifierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonModifierMousePressed
        this.panelButtonModifierMousePressed();
    }//GEN-LAST:event_panelButtonModifierMousePressed

    private void panelButtonModifierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonModifierMouseExited
        if (!this.modifierPressed) {
            this.setColor(this.panelButtonModifier, Home.COLOR_BUTTON_UNSELECTED);
            this.setColor(this.labelModifier, Home.COLOR_LABEL_UNSELECTED);
            this.setColor(this.panelHideSeparatorModifier, Home.COLOR_SEPARATOR_UNSELECTED);
        }
    }//GEN-LAST:event_panelButtonModifierMouseExited

    private void panelButtonModifierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonModifierMouseEntered
        if (!this.modifierPressed) {
            this.setColor(this.panelButtonModifier, Home.COLOR_BUTTON_SELECTED);
            this.setColor(this.labelModifier, Home.COLOR_LABEL_SELECTED);
            this.setColor(this.panelHideSeparatorModifier, Home.COLOR_SEPARATOR_SELECTED);
        }
    }//GEN-LAST:event_panelButtonModifierMouseEntered

    private void panelButtonSupprimerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonSupprimerMousePressed
        this.panelButtonSupprimerMousePressed();
    }//GEN-LAST:event_panelButtonSupprimerMousePressed

    private void panelButtonSupprimerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonSupprimerMouseExited
        if (!this.supprimerPressed) {
            this.setColor(this.panelButtonSupprimer, Home.COLOR_BUTTON_UNSELECTED);
            this.setColor(this.labelSupprimer, Home.COLOR_LABEL_UNSELECTED);
            this.setColor(this.panelHideSeparatorSupprimer, Home.COLOR_SEPARATOR_UNSELECTED);
        }
    }//GEN-LAST:event_panelButtonSupprimerMouseExited

    private void panelButtonSupprimerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonSupprimerMouseEntered
        if (!this.supprimerPressed) {
            this.setColor(this.panelButtonSupprimer, Home.COLOR_BUTTON_SELECTED);
            this.setColor(this.labelSupprimer, Home.COLOR_LABEL_SELECTED);
            this.setColor(this.panelHideSeparatorSupprimer, Home.COLOR_SEPARATOR_SELECTED);
        }
    }//GEN-LAST:event_panelButtonSupprimerMouseEntered

    private void panelButtonAjouterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonAjouterMousePressed
        this.panelButtonAjouterMousePressed();
    }//GEN-LAST:event_panelButtonAjouterMousePressed

    private void panelButtonAjouterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonAjouterMouseExited
        if (!this.ajouterPressed) {
            this.setColor(this.panelButtonAjouter, Home.COLOR_BUTTON_UNSELECTED);
            this.setColor(this.labelAjouter, Home.COLOR_LABEL_UNSELECTED);
            this.setColor(this.panelHideSeparatorAjouter, Home.COLOR_SEPARATOR_UNSELECTED);
        }
    }//GEN-LAST:event_panelButtonAjouterMouseExited

    private void panelButtonAjouterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonAjouterMouseEntered
        if (!this.ajouterPressed) {
            this.setColor(this.panelButtonAjouter, Home.COLOR_BUTTON_SELECTED);
            this.setColor(this.labelAjouter, Home.COLOR_LABEL_SELECTED);
            this.setColor(this.panelHideSeparatorAjouter, Home.COLOR_SEPARATOR_SELECTED);
        }
    }//GEN-LAST:event_panelButtonAjouterMouseEntered

    private void panelButtonConsulterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonConsulterMousePressed
        this.panelButtonConsulterMousePressed();
    }//GEN-LAST:event_panelButtonConsulterMousePressed

    private void panelButtonConsulterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonConsulterMouseExited
        if (!this.consulterPressed) {
            this.setColor(this.panelButtonConsulter, Home.COLOR_BUTTON_UNSELECTED);
            this.setColor(this.labelConsulter, Home.COLOR_LABEL_UNSELECTED);
            this.setColor(this.panelHideSeparatorConsulter, Home.COLOR_SEPARATOR_UNSELECTED);
        }
    }//GEN-LAST:event_panelButtonConsulterMouseExited

    private void panelButtonConsulterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonConsulterMouseEntered
        if (!this.consulterPressed) {
            this.setColor(this.panelButtonConsulter, Home.COLOR_BUTTON_SELECTED);
            this.setColor(this.labelConsulter, Home.COLOR_LABEL_SELECTED);
            this.setColor(this.panelHideSeparatorConsulter, Home.COLOR_SEPARATOR_SELECTED);
        }
    }//GEN-LAST:event_panelButtonConsulterMouseEntered

    private void panelAjouterUnLivreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAjouterUnLivreMousePressed
        this.panelButtonAjouterMousePressed();
        
        this.ajouterDataPressed = true;
        this.supprimerDataPressed = false;
        this.modifierDataPressed = false;
        
        this.setColor(this.panelAjouterUnLivre, Home.COLOR_BUTTON_DATA_SELECTED);
        this.setColor(this.panelSupprimerUnLivre, Home.COLOR_BUTTON_DATA_UNSELECTED);
        this.setColor(this.panelModifierUnLivre, Home.COLOR_BUTTON_DATA_UNSELECTED);
        
        this.setColor(this.labelAjouterUnLivre, Home.COLOR_LABEL_DATA_SELECTED);
        this.setColor(this.labelSupprimerUnLivre, Home.COLOR_LABEL_DATA_UNSELECTED);
        this.setColor(this.labelModifierUnLivre, Home.COLOR_LABEL_DATA_UNSELECTED);
    }//GEN-LAST:event_panelAjouterUnLivreMousePressed

    private void panelAjouterUnLivreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAjouterUnLivreMouseEntered
        if (!this.ajouterDataPressed) {
            this.setColor(this.panelAjouterUnLivre, Home.COLOR_BUTTON_DATA_SELECTED);
            this.setColor(this.labelAjouterUnLivre, Home.COLOR_LABEL_DATA_SELECTED);
        }
    }//GEN-LAST:event_panelAjouterUnLivreMouseEntered

    private void panelAjouterUnLivreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAjouterUnLivreMouseExited
        if (!this.ajouterDataPressed) {
            this.setColor(this.panelAjouterUnLivre, Home.COLOR_BUTTON_DATA_UNSELECTED);
            this.setColor(this.labelAjouterUnLivre, Home.COLOR_LABEL_DATA_UNSELECTED);
        }
    }//GEN-LAST:event_panelAjouterUnLivreMouseExited

    private void panelSupprimerUnLivreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSupprimerUnLivreMousePressed
        this.panelButtonSupprimerMousePressed();
        
        this.ajouterDataPressed = false;
        this.supprimerDataPressed = true;
        this.modifierDataPressed = false;
        
        this.setColor(this.panelAjouterUnLivre, Home.COLOR_BUTTON_DATA_UNSELECTED);
        this.setColor(this.panelSupprimerUnLivre, Home.COLOR_BUTTON_DATA_SELECTED);
        this.setColor(this.panelModifierUnLivre, Home.COLOR_BUTTON_DATA_UNSELECTED);
        
        this.setColor(this.labelAjouterUnLivre, Home.COLOR_LABEL_DATA_UNSELECTED);
        this.setColor(this.labelSupprimerUnLivre, Home.COLOR_LABEL_DATA_SELECTED);
        this.setColor(this.labelModifierUnLivre, Home.COLOR_LABEL_DATA_UNSELECTED);
    }//GEN-LAST:event_panelSupprimerUnLivreMousePressed

    private void panelSupprimerUnLivreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSupprimerUnLivreMouseEntered
        if (!this.supprimerDataPressed) {
            this.setColor(this.panelSupprimerUnLivre, Home.COLOR_BUTTON_DATA_SELECTED);
            this.setColor(this.labelSupprimerUnLivre, Home.COLOR_LABEL_DATA_SELECTED); 
        }
    }//GEN-LAST:event_panelSupprimerUnLivreMouseEntered

    private void panelSupprimerUnLivreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSupprimerUnLivreMouseExited
        if (!this.supprimerDataPressed) {
            this.setColor(this.panelSupprimerUnLivre, Home.COLOR_BUTTON_DATA_UNSELECTED);
            this.setColor(this.labelSupprimerUnLivre, Home.COLOR_LABEL_DATA_UNSELECTED); 
        }
    }//GEN-LAST:event_panelSupprimerUnLivreMouseExited

    private void panelModifierUnLivreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelModifierUnLivreMousePressed
        this.panelButtonModifierMousePressed();
        
        this.ajouterDataPressed = false;
        this.supprimerDataPressed = false;
        this.modifierDataPressed = true;
        
        this.setColor(this.panelAjouterUnLivre, Home.COLOR_BUTTON_DATA_UNSELECTED);
        this.setColor(this.panelSupprimerUnLivre, Home.COLOR_BUTTON_DATA_UNSELECTED);
        this.setColor(this.panelModifierUnLivre, Home.COLOR_BUTTON_DATA_SELECTED);
        
        this.setColor(this.labelAjouterUnLivre, Home.COLOR_LABEL_DATA_UNSELECTED);
        this.setColor(this.labelSupprimerUnLivre, Home.COLOR_LABEL_DATA_UNSELECTED);
        this.setColor(this.labelModifierUnLivre, Home.COLOR_LABEL_DATA_SELECTED);
    }//GEN-LAST:event_panelModifierUnLivreMousePressed

    private void panelModifierUnLivreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelModifierUnLivreMouseEntered
        if (!this.modifierDataPressed) {
            this.setColor(this.panelModifierUnLivre, Home.COLOR_BUTTON_DATA_SELECTED);
            this.setColor(this.labelModifierUnLivre, Home.COLOR_LABEL_DATA_SELECTED);    
        }
    }//GEN-LAST:event_panelModifierUnLivreMouseEntered

    private void panelModifierUnLivreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelModifierUnLivreMouseExited
        if (!this.modifierDataPressed) {
            this.setColor(this.panelModifierUnLivre, Home.COLOR_BUTTON_DATA_UNSELECTED);
            this.setColor(this.labelModifierUnLivre, Home.COLOR_LABEL_DATA_UNSELECTED);            
        }
       
    }//GEN-LAST:event_panelModifierUnLivreMouseExited

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
    private javax.swing.JLabel labelAjouterUnLivre;
    private javax.swing.JLabel labelClose;
    private javax.swing.JLabel labelConsulter;
    private javax.swing.JLabel labelHave;
    private javax.swing.JLabel labelModifier;
    private javax.swing.JLabel labelModifierUnLivre;
    private javax.swing.JLabel labelSupprimer;
    private javax.swing.JLabel labelSupprimerUnLivre;
    private javax.swing.JPanel panelAjouter;
    private javax.swing.JPanel panelAjouterUnLivre;
    private javax.swing.JPanel panelBar;
    private javax.swing.JPanel panelButtonAjouter;
    private javax.swing.JPanel panelButtonClose;
    private javax.swing.JPanel panelButtonConsulter;
    private javax.swing.JPanel panelButtonModifier;
    private javax.swing.JPanel panelButtonSupprimer;
    private javax.swing.JPanel panelConsulter;
    private javax.swing.JPanel panelData;
    private javax.swing.JPanel panelHave;
    private javax.swing.JPanel panelHideSeparatorAjouter;
    private javax.swing.JPanel panelHideSeparatorConsulter;
    private javax.swing.JPanel panelHideSeparatorModifier;
    private javax.swing.JPanel panelHideSeparatorSupprimer;
    private javax.swing.JPanel panelImage;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelModifier;
    private javax.swing.JPanel panelModifierUnLivre;
    private javax.swing.JPanel panelPane;
    private javax.swing.JPanel panelSeparator;
    private javax.swing.JPanel panelSupprimer;
    private javax.swing.JPanel panelSupprimerUnLivre;
    private javax.swing.JScrollPane scrollpaneDatabase;
    private javax.swing.JTable tableDatabase;
    // End of variables declaration//GEN-END:variables
}
