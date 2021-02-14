/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myHangman;

/**
 *
 * @author Arsh
 */
public class Highscores extends javax.swing.JFrame {

    /**
     * Creates new form Highscores
     */
    public Highscores() {
        initComponents();
        setBounds(300,300,600,434);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        highscoresTitle = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        backGround = new javax.swing.JLabel();
        blackBackgGround = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        highscoresTitle.setFont(new java.awt.Font("Bauhaus 93", 2, 58)); // NOI18N
        highscoresTitle.setForeground(new java.awt.Color(51, 102, 255));
        highscoresTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        highscoresTitle.setText("HIGHSCORES");
        highscoresTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(highscoresTitle);
        highscoresTitle.setBounds(0, 40, 600, 80);

        backButton.setBackground(new java.awt.Color(51, 102, 255));
        backButton.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        backButton.setText("BACK");
        backButton.setBorder(null);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(10, 370, 50, 21);
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 600, 400);

        blackBackgGround.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(blackBackgGround);
        blackBackgGround.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Highscores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Highscores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Highscores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Highscores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Highscores().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backGround;
    private javax.swing.JPanel blackBackgGround;
    private javax.swing.JLabel highscoresTitle;
    // End of variables declaration//GEN-END:variables
}
