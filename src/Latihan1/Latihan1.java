/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author lenovo
 */
public class Latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan1
     */
    public Latihan1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        kelas = new javax.swing.JTextField();
        Alamat1 = new javax.swing.JTextField();
        Kelas1 = new javax.swing.JTextField();
        Nama1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        proses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trajan Pro 3", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Formulir");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 10, 220, 80);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Alamat");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 150, 60, 21);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 90, 60, 21);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Kelas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 120, 60, 21);
        getContentPane().add(alamat);
        alamat.setBounds(110, 150, 180, 30);
        getContentPane().add(nama);
        nama.setBounds(110, 90, 180, 30);
        getContentPane().add(kelas);
        kelas.setBounds(110, 120, 180, 30);
        getContentPane().add(Alamat1);
        Alamat1.setBounds(150, 310, 140, 30);
        getContentPane().add(Kelas1);
        Kelas1.setBounds(150, 280, 140, 30);
        getContentPane().add(Nama1);
        Nama1.setBounds(150, 250, 140, 30);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Nama");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 250, 60, 21);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Kelas");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 280, 60, 21);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 310, 60, 21);

        proses.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        proses.setForeground(new java.awt.Color(153, 51, 255));
        proses.setText("Proses");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });
        getContentPane().add(proses);
        proses.setBounds(190, 200, 100, 29);

        setBounds(0, 0, 352, 412);
    }// </editor-fold>//GEN-END:initComponents

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
       String Nama = nama.getText();
       Nama1.setText(Nama);
       String Kelas = kelas.getText();
       Kelas1.setText(Kelas);
       String Alamat = alamat.getText();
       Alamat1.setText(Alamat);
    }//GEN-LAST:event_prosesActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat1;
    private javax.swing.JTextField Kelas1;
    private javax.swing.JTextField Nama1;
    private javax.swing.JTextField alamat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextField nama;
    private javax.swing.JButton proses;
    // End of variables declaration//GEN-END:variables
}