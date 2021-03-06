package presentacion;

import java.awt.Image;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Vista para escalar manualmente un objeto
 * @author A3D Ingeniería
 */
public class VistaEscalarManual extends javax.swing.JFrame {

    //Atributos
    private static ControladorVistaEscalar control;
    
    /**
     * Crea la nueva vista para escalar manualmente
     * @param controlEscalar Control de la vista de escalar
     */
    public VistaEscalarManual(ControladorVistaEscalar controlEscalar) {
        initComponents();
        this.setName("Escalado Manual");
        this.control = controlEscalar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        xValue = new javax.swing.JTextField();
        labelEjeX = new javax.swing.JLabel();
        labelEjeY = new javax.swing.JLabel();
        yValue = new javax.swing.JTextField();
        labelEjeZ = new javax.swing.JLabel();
        zValue = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Introduzca los valores decimales (X, Y, Z) para escalar el objeto"));

        xValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xValueKeyTyped(evt);
            }
        });

        labelEjeX.setText("Eje X:");

        labelEjeY.setText("Eje Y:");

        yValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yValueKeyTyped(evt);
            }
        });

        labelEjeZ.setText("Eje Z:");

        zValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                zValueKeyTyped(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(64, 64, 64)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(labelEjeY)
                    .add(labelEjeX)
                    .add(labelEjeZ))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(yValue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(zValue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(xValue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(61, 61, Short.MAX_VALUE)
                .add(helpButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(68, 68, 68))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(cancelButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(okButton)
                .add(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(36, 36, 36)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(xValue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(labelEjeX))
                        .add(18, 18, 18)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(yValue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(labelEjeY)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(helpButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(zValue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelEjeZ))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(okButton)
                    .add(cancelButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ImageIcon tmpIconAux = new ImageIcon(getClass().getResource("/resources/help.png"));
        ImageIcon tmpIcon = new ImageIcon(tmpIconAux.getImage().getScaledInstance(54, 54, Image.SCALE_DEFAULT));
        helpButton.setIcon(tmpIcon);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //contorla la presión en el botón de ayuda
    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Valor -> 2 ó 2.02 \n PARTE-ENTERA[.PARTE-DECIMAL] \n Vaya a la ayuda si sigue teniendo dudas.", "Valores decimales", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_helpButtonActionPerformed

    //Controla cada vez que se escribe en el texto de Z
    private void zValueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zValueKeyTyped
        comprobarValores(zValue.getText());
    }//GEN-LAST:event_zValueKeyTyped

    //Controla cada vez que se escribe en el texto de Y
    private void yValueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yValueKeyTyped
        comprobarValores(yValue.getText());
    }//GEN-LAST:event_yValueKeyTyped

    //Controla cada vez que se escribe en el texto de X
    private void xValueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xValueKeyTyped
        comprobarValores(xValue.getText());
    }//GEN-LAST:event_xValueKeyTyped

    //Maneja la presión en el botón de cancelar el escalado
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        control.cancelarEscalado();
    }//GEN-LAST:event_cancelButtonActionPerformed

    //Maneja la presión en el botón de ok para aplicar el escalado
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        try {
            control.getDesktop().getSelectedFrame().setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(VistaRotarManual.class.getName()).log(Level.SEVERE, null, ex);
        }
        control.escalarManual(xValue.getText(), yValue.getText(), zValue.getText());
    }//GEN-LAST:event_okButtonActionPerformed

    //Comprueba los valores introducidos en un String
    private void comprobarValores(String valor) {
        boolean falso = false;
        if (valor.length() < 1) {
            falso = true;
        }
        for (int i = 0; i < valor.length(); i++) {
            if (valor.charAt(i) >= 48 && valor.charAt(i) <= 57 || valor.charAt(i) == 46 || valor.equals(" ") || valor.charAt(i) == 45) {
                falso = true;
            } else {
                falso = false;
            }
        }
        if (!falso) {
            JOptionPane.showMessageDialog(null, "Sólo se permiten números decimales. Vaya a la ayuda si sigue teniendo dudas.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(VistaEscalarManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEscalarManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEscalarManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEscalarManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEscalarManual(control).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelEjeX;
    private javax.swing.JLabel labelEjeY;
    private javax.swing.JLabel labelEjeZ;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField xValue;
    private javax.swing.JTextField yValue;
    private javax.swing.JTextField zValue;
    // End of variables declaration//GEN-END:variables
}
