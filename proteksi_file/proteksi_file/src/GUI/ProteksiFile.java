package GUI;

import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author Bumi Andrian Thanta
 */
public class ProteksiFile extends javax.swing.JFrame {

    /**
     * Creates new form ProteksiFile
     */
    private static String FilenameInput;
    private static String Filenameoutput;
    public ProteksiFile() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        TextInput = new javax.swing.JTextField();
        TextPassword = new javax.swing.JTextField();
        TextOutput = new javax.swing.JTextField();
        btninput = new javax.swing.JButton();
        btnoutput = new javax.swing.JButton();
        radioProtect = new javax.swing.JRadioButton();
        radioUnprotect = new javax.swing.JRadioButton();
        btnProses = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        checkHapus = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bumi Andrian Thanta - Proteksi File");

        btninput.setText("Input");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });

        btnoutput.setText("Output");
        btnoutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoutputActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioProtect);
        radioProtect.setText("Protect");

        buttonGroup1.add(radioUnprotect);
        radioUnprotect.setText("Unprotect");

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        btnkeluar.setText("Keluar");

        jLabel1.setText("Password");

        checkHapus.setText("Hapus File Asli");
        checkHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioProtect)
                        .addGap(51, 51, 51)
                        .addComponent(radioUnprotect))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnProses, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextOutput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnoutput, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                        .addComponent(btninput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btninput))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnoutput))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkHapus)
                    .addComponent(radioUnprotect)
                    .addComponent(radioProtect))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProses)
                    .addComponent(btnkeluar))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkHapusActionPerformed

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
        // TODO add your handling code here:
        JFileChooser inputFileChooser = new JFileChooser();
        inputFileChooser.showOpenDialog(null);
        FilenameInput = inputFileChooser.getSelectedFile().getAbsolutePath();
        if (FilenameInput != null)
            TextInput.setText(FilenameInput);
    }//GEN-LAST:event_btninputActionPerformed

    private void btnoutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoutputActionPerformed
        // TODO add your handling code here:
        JFileChooser outputFileChooser = new JFileChooser();
        outputFileChooser.showSaveDialog(null);
        Filenameoutput = outputFileChooser.getSelectedFile().getAbsolutePath();
        if (Filenameoutput != null)
            TextOutput.setText(Filenameoutput);
    }//GEN-LAST:event_btnoutputActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        // TODO add your handling code here:
        String strPassword = TextPassword.getText().toString();
        File fInput = new File(FilenameInput);
        File foutput = new File(Filenameoutput);
        if (radioProtect.isSelected())
        {
            try {
                CryptoUtils.encrypt(strPassword, fInput, foutput);
            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Proteksi berhasil");
        }
        else{
            try {
                CryptoUtils.decrypt(strPassword, fInput, foutput);
            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Unprotect berhasil");
}
        if (checkHapus.isSelected())
        {
            fInput.delete();
            checkHapus.setSelected(false);
        }
        TextInput.setText("");
        TextOutput.setText("");
        TextPassword.setText("");
    }//GEN-LAST:event_btnProsesActionPerformed

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
            java.util.logging.Logger.getLogger(ProteksiFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProteksiFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProteksiFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProteksiFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProteksiFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextInput;
    private javax.swing.JTextField TextOutput;
    private javax.swing.JTextField TextPassword;
    private javax.swing.JButton btnProses;
    private javax.swing.JButton btninput;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnoutput;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkHapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton radioProtect;
    private javax.swing.JRadioButton radioUnprotect;
    // End of variables declaration//GEN-END:variables
}
