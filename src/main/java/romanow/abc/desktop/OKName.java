/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanow.abc.desktop;

import romanow.abc.core.constants.ValuesBase;

import java.awt.*;

/**
 *
 * @author romanow
 */
public class OKName extends ABCBaseView {
    public final int PopupEnterNameDelay=30;
    private I_Value<String> ok;
    /**
     * Creates new form OK
     */
    public OKName(int x,int y,String title, I_Value<String> ok0) {
        this(x,y,title,"",ok0);
        }
    public OKName(int x,int y,String title, String name, I_Value<String> ok0) {
        super(400,70);
        setUndecorated(true);
        initComponents();
        ok = ok0;
        OK.setFont(new Font("Arial Cyr", Font.PLAIN, 13));
        Name.setText(name);
        UtilsDesktop.setButtonText(OK,title,45);
        OK.setBounds(10, 5, 330, 30);
        positionOn(x+20,y+20);
        delayIt(PopupEnterNameDelay);
        //setVisible(true);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OK = new javax.swing.JButton();
        Canсel = new javax.swing.JButton();
        Name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });
        getContentPane().add(OK);
        OK.setBounds(10, 5, 330, 30);

        Canсel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/remove.png"))); // NOI18N
        Canсel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanсelActionPerformed(evt);
            }
        });
        getContentPane().add(Canсel);
        Canсel.setBounds(360, 5, 30, 30);

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        getContentPane().add(Name);
        Name.setBounds(10, 40, 330, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        closeView();
        if (ok!=null)
            ok.onEnter(Name.getText());
    }//GEN-LAST:event_OKActionPerformed

    private void CanсelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanсelActionPerformed
        closeView();
    }//GEN-LAST:event_CanсelActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Canсel;
    private javax.swing.JTextField Name;
    private javax.swing.JButton OK;
    // End of variables declaration//GEN-END:variables
}
