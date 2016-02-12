/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.o3.bitcoin.ui.dialogs;

import com.o3.bitcoin.model.WalletConfig;
import com.o3.bitcoin.service.WalletService;
import com.o3.bitcoin.model.manager.WalletManager;
import com.o3.bitcoin.ui.ApplicationUI;
import com.o3.bitcoin.ui.component.XButtonFactory;
import com.o3.bitcoin.ui.dialogs.screens.PnlCreateWatchOnlyWalletScreen;
import com.o3.bitcoin.util.ResourcesProvider;
import com.o3.bitcoin.util.Utils;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author
 */
public class DlgCreateWatchOnlyWallet extends BasicDialog {

    private static final Logger logger = LoggerFactory.getLogger(DlgCreateWatchOnlyWallet.class);

    public static final int MODE_APP_START = 0;
    public static final int MODE_APP_RUNNING = 1;

    private int mode = MODE_APP_START;
    private PnlCreateWatchOnlyWalletScreen pnlCreateWatchOnlyWalletScreen;
    private WalletService service;
    private WalletService originalWalletService;

    /**
     * Creates new form DlgCreateWallet
     *
     * @param originalWalletService
     */
    public DlgCreateWatchOnlyWallet(WalletService originalWalletService) {
        super(false);
        this.originalWalletService = originalWalletService;
        setupUI();
    }

    @Override
    protected String getHeadingText() {
        return "Create Watch-Only Wallet";
    }

    @Override
    protected JPanel getMainContentPanel() {
        if (pnlCreateWatchOnlyWalletScreen == null) {
            pnlCreateWatchOnlyWalletScreen = new PnlCreateWatchOnlyWalletScreen(this, originalWalletService.getWalletConfig());
        }
        return pnlCreateWatchOnlyWalletScreen;
    }

    @Override
    protected List<JButton> getControls() {
        List<JButton> controls = super.getControls();
        controls.add(0, getNextButton());
        return controls;
    }

    protected JButton getNextButton() {
        JButton nextButton = new JButton("Next");
        XButtonFactory.themedButton(nextButton)
                .background(ResourcesProvider.Colors.NAV_MENU_WALLET_COLOR)
                .color(Color.WHITE)
                .font(ResourcesProvider.Fonts.BOLD_MEDIUM_FONT)
                .size(XButtonFactory.NORMAL_BUTTON_DIMENSION);
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                handleNextButtonClickEvent(e);
            }
        });
        return nextButton;
    }

    protected void handleNextButtonClickEvent(ActionEvent e) {
        try {
            pnlCreateWatchOnlyWalletScreen.validateData();
            String id = pnlCreateWatchOnlyWalletScreen.getWalletName().trim();
            String location = pnlCreateWatchOnlyWalletScreen.getLocationPath();
            WalletConfig walletConfig = new WalletConfig(id, location, Utils.getNetworkName(pnlCreateWatchOnlyWalletScreen.getSelectedNetwork()), originalWalletService.getWallet().getWatchingKey());
            service = WalletManager.get().createOrLoadWalletService(pnlCreateWatchOnlyWalletScreen.getSelectedNetwork(), walletConfig);
            dispose();
        } catch (IllegalArgumentException ex) {
            logger.error("Create Watch-Only Wallet Vaidation Error: {}", ex.toString());
            ApplicationUI.get().showError(ex);
        } catch (Exception ex) {
            logger.error("Create Watch-Only Wallet Vaidation Error: {}", ex, ex);
            ApplicationUI.get().showError(ex);
        }
    }

    public int getMode() {
        return mode;
    }

    public WalletService getWalletService() {
        return service;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}