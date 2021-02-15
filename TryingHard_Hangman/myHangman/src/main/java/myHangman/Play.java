package myHangman;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Play extends javax.swing.JFrame {


    public Play() {
        initComponents();
        setBounds(300,300,600,434);
        date();
        time();
        chooseWord(randomWord);
        createAlphabet();
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

    
    public void chooseWord(String randomWord) {
        Random rand = new Random();
        String[] wordBank = {"abstract", "cemetery", "nurse", "pharmacy", "climbing"};
        randomWord = wordBank[rand.nextInt(wordBank.length)];
        
        String hiddenWord = "";
        for(int i=0; i<randomWord.length(); i++) {
            hiddenWord+="_  ";
        } 
        hiddenWordLabel.setText(hiddenWord);
    }
     
    
    public ArrayList<javax.swing.JButton> createAlphabet()
    {
        ArrayList<javax.swing.JButton> alphabetB = new ArrayList<>();
        int [] original = {5,300,40,40};
        int x = 5;
        int y = 300;
        int length = 40;
        int width = 40;
        int startButton = 1;
        
        for(char alphabet = 'a'; alphabet <= 'z'; alphabet++)
        {
            javax.swing.JButton alphaButtons = new javax.swing.JButton();
            alphaButtons.setBorder(null);
            alphaButtons.setFont(new java.awt.Font("Bauhaus 93", 2, 19));
            alphaButtons.setBackground(new java.awt.Color(0,0,0));
            alphaButtons.setForeground(new java.awt.Color(51, 102, 255));
            alphaButtons.setText("" + alphabet);
            alphaButtons.setOpaque(true);
            alphaButtons.setBounds(x, y, length, width);
            getContentPane().add(alphaButtons);
            x += 45;
            if(startButton == 13)
            {
                x = original[0];
                y += 50;
            }
            startButton++;
            alphabetB.add(alphaButtons);
            alphaButtons.setVisible(true);

            alphaButtons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllButtonActionPerformed(evt);
            }
                private void AllButtonActionPerformed(ActionEvent evt) {
                    for (int i = 0; i < randomWord.length(); i++) {
                        if (alphaButtons.getText().toLowerCase().charAt(0) == randomWord.charAt(i)) {
                            //hiddenWordLabel.get(i).setText(Character.toString(randomWord.charAt(i)));
                        }
                    }
                }
            });
        }
        return alphabetB;
    }
  
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        skipButton = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        hangMan = new javax.swing.JLabel();
        scoreTitle = new javax.swing.JLabel();
        userScore = new javax.swing.JLabel();
        hiddenWordLabel = new javax.swing.JLabel();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        getContentPane().add(hangMan);
        hangMan.setBounds(120, 60, 360, 190);

        scoreTitle.setFont(new java.awt.Font("Bauhaus 93", 2, 20)); // NOI18N
        scoreTitle.setForeground(new java.awt.Color(51, 102, 255));
        scoreTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreTitle.setText("SCORE:");
        getContentPane().add(scoreTitle);
        scoreTitle.setBounds(230, 30, 80, 30);

        userScore.setFont(new java.awt.Font("Bauhaus 93", 2, 20)); // NOI18N
        userScore.setForeground(new java.awt.Color(51, 102, 255));
        userScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userScore.setText("100");
        getContentPane().add(userScore);
        userScore.setBounds(310, 30, 40, 30);

        hiddenWordLabel.setFont(new java.awt.Font("Bauhaus 93", 2, 26)); // NOI18N
        hiddenWordLabel.setForeground(new java.awt.Color(51, 102, 255));
        hiddenWordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(hiddenWordLabel);
        hiddenWordLabel.setBounds(100, 254, 400, 40);

        backGround.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void skipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipButtonActionPerformed
        // TODO add your handling code here:
        new End().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_skipButtonActionPerformed

    
    
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

    
    private String randomWord = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGround;
    private javax.swing.JLabel date;
    private javax.swing.JLabel hangMan;
    private javax.swing.JLabel hiddenWordLabel;
    private javax.swing.JLabel scoreTitle;
    private javax.swing.JButton skipButton;
    private javax.swing.JLabel time;
    private javax.swing.JLabel title;
    public javax.swing.JLabel userScore;
    // End of variables declaration//GEN-END:variables
}
