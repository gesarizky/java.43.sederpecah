/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class Framesederpecah extends javax.swing.JFrame {

    /**
     * Creates new form Framesederpecah
     */
    public Framesederpecah() {
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
        ina = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        outa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        outb = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("KALKULATOR PENYEDERHANAAN PECAHAN (A/B) ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Isi pembilang dan penyebutnya (a/b)");

        ina.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ina.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inaActionPerformed(evt);
            }
        });
        ina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("____");

        inb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inbActionPerformed(evt);
            }
        });
        inb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inbKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Menjadi");

        outa.setEditable(false);
        outa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("____");

        outb.setEditable(false);
        outb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outb.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(inb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(outb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(inb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(outb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inaActionPerformed
        // TODO add your handling code here:
        if (ina.getText().equals("") || inb.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "isi semua data");
        } else {
            String teksa = ina.getText();
            double inputa = Double.parseDouble(teksa);
            double tekshasila = Double.parseDouble(teksa);
            String teksb = inb.getText();
            double tekshasilb = Double.parseDouble(teksb);
            double inputb = Double.parseDouble(teksb);
            //mencari fpb
            double fpb;
            fpb = inputa % inputb;
            while (fpb != 0) {
                inputa = inputb;
                inputb = fpb;
                fpb = inputa % inputb;
            }
            String teksfpb = String.valueOf(inputb);
            double hasilfpb = Double.parseDouble(teksfpb);

            int hasila = (int) (tekshasila / hasilfpb);
            int hasilb = (int) (tekshasilb / hasilfpb);

            String outputa = String.valueOf(hasila);
            outa.setText(outputa);
            String outputb = String.valueOf(hasilb);
            outb.setText(outputb);
        }
    }//GEN-LAST:event_inaActionPerformed

    private void inbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inbActionPerformed
        // TODO add your handling code here:
        if (ina.getText().equals("") || inb.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "isi semua data");
        } else {
            String teksa = ina.getText();
            double inputa = Double.parseDouble(teksa);
            double tekshasila = Double.parseDouble(teksa);
            String teksb = inb.getText();
            double tekshasilb = Double.parseDouble(teksb);
            double inputb = Double.parseDouble(teksb);
            //mencari fpb
            double fpb;
            fpb = inputa % inputb;
            while (fpb != 0) {
                inputa = inputb;
                inputb = fpb;
                fpb = inputa % inputb;
            }
            String teksfpb = String.valueOf(inputb);
            double hasilfpb = Double.parseDouble(teksfpb);

            int hasila = (int) (tekshasila / hasilfpb);
            int hasilb = (int) (tekshasilb / hasilfpb);

            String outputa = String.valueOf(hasila);
            outa.setText(outputa);
            String outputb = String.valueOf(hasilb);
            outb.setText(outputb);
        }
    }//GEN-LAST:event_inbActionPerformed

    private void inaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inaKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            evt.consume();
        }
    }//GEN-LAST:event_inaKeyTyped

    private void inbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inbKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            evt.consume();
        }
    }//GEN-LAST:event_inbKeyTyped

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
            java.util.logging.Logger.getLogger(Framesederpecah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Framesederpecah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Framesederpecah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Framesederpecah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Framesederpecah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ina;
    private javax.swing.JTextField inb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField outa;
    private javax.swing.JTextField outb;
    // End of variables declaration//GEN-END:variables
}
