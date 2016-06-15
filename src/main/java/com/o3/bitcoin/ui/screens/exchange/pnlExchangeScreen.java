/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.o3.bitcoin.ui.screens.exchange;

import com.o3.bitcoin.ui.dialogs.screens.BasicScreen;

import com.o3.bitcoin.util.ResourcesProvider.Colors;
import com.o3.bitcoin.util.ResourcesProvider.Fonts;

/**
 *
 * @author
 */
public class pnlExchangeScreen extends javax.swing.JPanel implements BasicScreen {

  
    /**
     * Creates new form pnlExchangeScreen
     */
    public pnlExchangeScreen() {
        initComponents();
       
    }

    public void loadData() {
      
       pnlShapshiftIOExchangeDividerScreen.loadData();
   
    }

  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnGroupNetwork = new javax.swing.ButtonGroup();
        pnlTop = new javax.swing.JPanel();
        pnlTopEdge = new javax.swing.JPanel();
        pnlTitle = new javax.swing.JPanel();
        lblTop = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlShapshiftIOExchangeDividerScreen = new com.o3.bitcoin.ui.screens.exchange.PnlShapshiftIOExchangeDividerScreen();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1024, 340));
        setLayout(new java.awt.BorderLayout());

        pnlTop.setBackground(Colors.SCREEN_TOP_PANEL_BG_COLOR);
        pnlTop.setBorder(new javax.swing.border.MatteBorder(null));
        pnlTop.setPreferredSize(new java.awt.Dimension(1024, 50));
        pnlTop.setLayout(new java.awt.BorderLayout());

        pnlTopEdge.setBackground( Colors.NAV_MENU_EXCHANGE_COLOR);
        pnlTopEdge.setPreferredSize(new java.awt.Dimension(1024, 5));
        pnlTop.add(pnlTopEdge, java.awt.BorderLayout.NORTH);

        pnlTitle.setBackground(Colors.SCREEN_TOP_PANEL_BG_COLOR);
        pnlTitle.setPreferredSize(new java.awt.Dimension(86, 24));
        pnlTitle.setLayout(new java.awt.GridBagLayout());

        lblTop.setFont(Fonts.BOLD_SMALL_FONT);
        lblTop.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exchange_16x16.png"))); // NOI18N
        lblTop.setText("EXCHANGE");
        lblTop.setPreferredSize(new java.awt.Dimension(77, 24));
        pnlTitle.add(lblTop, new java.awt.GridBagConstraints());

        pnlTop.add(pnlTitle, java.awt.BorderLayout.EAST);

        add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlMain.setLayout(new java.awt.GridBagLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(10, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pnlMain.add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(pnlShapshiftIOExchangeDividerScreen, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 1.0;
        pnlMain.add(jPanel2, gridBagConstraints);

        add(pnlMain, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

   

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupNetwork;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTop;
    private javax.swing.JPanel pnlMain;
    private com.o3.bitcoin.ui.screens.exchange.PnlShapshiftIOExchangeDividerScreen pnlShapshiftIOExchangeDividerScreen;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JPanel pnlTopEdge;
    // End of variables declaration//GEN-END:variables
}
