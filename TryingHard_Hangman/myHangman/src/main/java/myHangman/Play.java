package myHangman;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;



public class Play extends javax.swing.JFrame {

    public Play() {
        initComponents();
        setBounds(300,300,600,434);
        date();
        time();
    }
    
    public void date() {
        SimpleDateFormat sDate = new SimpleDateFormat("MMMM dd, yyyy");
        Date dDate = new Date();
        date.setText(sDate.format(dDate));
    }

    public void time() {
        Timer t = new Timer(0,new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sDate = new SimpleDateFormat("hh:mm:ss");
                Date dTime = new Date();
                time.setText(sDate.format(dTime));
            }
        });
        t.start();    
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        skipButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        backGround = new javax.swing.JLabel();
        blackBackgGround = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        skipButton.setBackground(new java.awt.Color(51, 102, 255));
        skipButton.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        skipButton.setText("SKIP");
        skipButton.setBorder(null);
        skipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipButtonActionPerformed(evt);
            }
        });
        getContentPane().add(skipButton);
        skipButton.setBounds(520, 30, 60, 29);

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton1.setText("A");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 320, 40, 30);

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton2.setText("B");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(80, 320, 40, 30);

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton3.setText("C");
        getContentPane().add(jButton3);
        jButton3.setBounds(120, 320, 40, 30);

        jButton4.setBackground(new java.awt.Color(51, 102, 255));
        jButton4.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton4.setText("D");
        getContentPane().add(jButton4);
        jButton4.setBounds(160, 320, 40, 30);

        jButton5.setBackground(new java.awt.Color(51, 102, 255));
        jButton5.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton5.setText("E");
        getContentPane().add(jButton5);
        jButton5.setBounds(200, 320, 40, 30);

        jButton6.setBackground(new java.awt.Color(51, 102, 255));
        jButton6.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton6.setText("F");
        getContentPane().add(jButton6);
        jButton6.setBounds(240, 320, 40, 30);

        jButton7.setBackground(new java.awt.Color(51, 102, 255));
        jButton7.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton7.setText("G");
        getContentPane().add(jButton7);
        jButton7.setBounds(280, 320, 40, 30);

        jButton8.setBackground(new java.awt.Color(51, 102, 255));
        jButton8.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton8.setText("H");
        getContentPane().add(jButton8);
        jButton8.setBounds(320, 320, 40, 30);

        jButton9.setBackground(new java.awt.Color(51, 102, 255));
        jButton9.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton9.setText("I");
        getContentPane().add(jButton9);
        jButton9.setBounds(360, 320, 40, 30);

        jButton10.setBackground(new java.awt.Color(51, 102, 255));
        jButton10.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton10.setText("J");
        getContentPane().add(jButton10);
        jButton10.setBounds(400, 320, 40, 30);

        jButton11.setBackground(new java.awt.Color(51, 102, 255));
        jButton11.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton11.setText("K");
        getContentPane().add(jButton11);
        jButton11.setBounds(440, 320, 40, 30);

        jButton12.setBackground(new java.awt.Color(51, 102, 255));
        jButton12.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton12.setText("L");
        getContentPane().add(jButton12);
        jButton12.setBounds(480, 320, 40, 30);

        jButton13.setBackground(new java.awt.Color(51, 102, 255));
        jButton13.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton13.setText("M");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(520, 320, 40, 30);

        jButton14.setBackground(new java.awt.Color(51, 102, 255));
        jButton14.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton14.setText("N");
        getContentPane().add(jButton14);
        jButton14.setBounds(40, 360, 40, 30);

        jButton15.setBackground(new java.awt.Color(51, 102, 255));
        jButton15.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton15.setText("O");
        getContentPane().add(jButton15);
        jButton15.setBounds(80, 360, 40, 30);

        jButton16.setBackground(new java.awt.Color(51, 102, 255));
        jButton16.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton16.setText("P");
        getContentPane().add(jButton16);
        jButton16.setBounds(120, 360, 40, 30);

        jButton17.setBackground(new java.awt.Color(51, 102, 255));
        jButton17.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton17.setText("Q");
        getContentPane().add(jButton17);
        jButton17.setBounds(160, 360, 40, 30);

        jButton18.setBackground(new java.awt.Color(51, 102, 255));
        jButton18.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton18.setText("R");
        getContentPane().add(jButton18);
        jButton18.setBounds(200, 360, 40, 30);

        jButton19.setBackground(new java.awt.Color(51, 102, 255));
        jButton19.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton19.setText("S");
        getContentPane().add(jButton19);
        jButton19.setBounds(240, 360, 40, 30);

        jButton20.setBackground(new java.awt.Color(51, 102, 255));
        jButton20.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton20.setText("T");
        getContentPane().add(jButton20);
        jButton20.setBounds(280, 360, 40, 30);

        jButton21.setBackground(new java.awt.Color(51, 102, 255));
        jButton21.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton21.setText("U");
        getContentPane().add(jButton21);
        jButton21.setBounds(320, 360, 40, 30);

        jButton22.setBackground(new java.awt.Color(51, 102, 255));
        jButton22.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton22.setText("V");
        getContentPane().add(jButton22);
        jButton22.setBounds(360, 360, 40, 30);

        jButton23.setBackground(new java.awt.Color(51, 102, 255));
        jButton23.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton23.setText("W");
        getContentPane().add(jButton23);
        jButton23.setBounds(400, 360, 40, 30);

        jButton24.setBackground(new java.awt.Color(51, 102, 255));
        jButton24.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton24.setText("X");
        getContentPane().add(jButton24);
        jButton24.setBounds(440, 360, 40, 30);

        jButton25.setBackground(new java.awt.Color(51, 102, 255));
        jButton25.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton25.setText("Y");
        getContentPane().add(jButton25);
        jButton25.setBounds(480, 360, 40, 30);

        jButton26.setBackground(new java.awt.Color(51, 102, 255));
        jButton26.setFont(new java.awt.Font("Bauhaus 93", 2, 14)); // NOI18N
        jButton26.setText("Z");
        getContentPane().add(jButton26);
        jButton26.setBounds(520, 360, 40, 30);

        date.setFont(new java.awt.Font("Bauhaus 93", 2, 18)); // NOI18N
        date.setForeground(new java.awt.Color(51, 102, 255));
        getContentPane().add(date);
        date.setBounds(340, 5, 170, 30);

        time.setFont(new java.awt.Font("Bauhaus 93", 2, 18)); // NOI18N
        time.setForeground(new java.awt.Color(51, 102, 255));
        getContentPane().add(time);
        time.setBounds(500, 5, 100, 30);

        title.setFont(new java.awt.Font("Bauhaus 93", 2, 24)); // NOI18N
        title.setForeground(new java.awt.Color(51, 102, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("HANGMAN");
        getContentPane().add(title);
        title.setBounds(4, 4, 110, 40);

        backGround.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 600, 400);

        blackBackgGround.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(blackBackgGround);
        blackBackgGround.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void skipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipButtonActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_skipButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

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
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGround;
    private javax.swing.JPanel blackBackgGround;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton skipButton;
    private javax.swing.JLabel time;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
