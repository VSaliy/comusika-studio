/*
 * http://www.frinika.com
 * 
 * This file is part of Frinika.
 * 
 * Frinika is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * Frinika is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Frinika; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package com.frinika.gui.panel;

/**
 *
 * @author hajdam
 */
public class ProgressPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProgressPanel
     */
    public ProgressPanel() {
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

        progressBar = new javax.swing.JProgressBar();
        cancelButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());
        add(progressBar, java.awt.BorderLayout.CENTER);

        cancelButton.setText("Cancel");
        cancelButton.setEnabled(false);
        add(cancelButton, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
