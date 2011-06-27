/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CelsiusToF.java
 *
 * Created on 26/06/2011, 23:53:58
 */
package br.blog.arruda.lista8;

/**
 *
 * @author arruda
 */
public class CelsiusToF extends javax.swing.JFrame {

    public Double celsius;
    public Double fahrenheit;

    /** Creates new form CelsiusToF */
    public CelsiusToF() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputCelsius = new javax.swing.JTextField();
        inputFahrenheit = new javax.swing.JTextField();
        converterCtoF = new javax.swing.JButton();
        converterToC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Temperatura");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Celsius");

        jLabel2.setText("Fahrenheit");

        inputCelsius.setText("0");
        inputCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCelsiusActionPerformed(evt);
            }
        });
        inputCelsius.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputCelsiusFocusLost(evt);
            }
        });

        inputFahrenheit.setText("0");
        inputFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFahrenheitActionPerformed(evt);
            }
        });
        inputFahrenheit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputFahrenheitFocusLost(evt);
            }
        });

        converterCtoF.setText("Para Fahrenheit");
        converterCtoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converterCtoFActionPerformed(evt);
            }
        });

        converterToC.setText("Para Celsius");
        converterToC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converterToCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputFahrenheit)
                    .addComponent(inputCelsius, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(converterToC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(converterCtoF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(converterCtoF))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(converterToC))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCelsiusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCelsiusActionPerformed

    private void inputFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFahrenheitActionPerformed
    }//GEN-LAST:event_inputFahrenheitActionPerformed

    private void converterCtoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converterCtoFActionPerformed
        this.converterCToF();
    }//GEN-LAST:event_converterCtoFActionPerformed

    private void converterToCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converterToCActionPerformed
        this.converterFToC();
    }//GEN-LAST:event_converterToCActionPerformed

    private void inputFahrenheitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputFahrenheitFocusLost

        this.converterFToC();
    }//GEN-LAST:event_inputFahrenheitFocusLost

    private void inputCelsiusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputCelsiusFocusLost
        this.converterCToF();
    }//GEN-LAST:event_inputCelsiusFocusLost

    private void converterCToF() {
        this.celsius = Double.parseDouble(this.inputCelsius.getText());
        this.fahrenheit = (celsius * 1.8) + 32;
        this.inputFahrenheit.setText(fahrenheit.toString());
    }

    private void converterFToC() {
        this.fahrenheit = Double.parseDouble(this.inputFahrenheit.getText());
        this.celsius = (fahrenheit - 32) / 1.8;
        this.inputCelsius.setText(celsius.toString());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CelsiusToF().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton converterCtoF;
    private javax.swing.JButton converterToC;
    private javax.swing.JTextField inputCelsius;
    private javax.swing.JTextField inputFahrenheit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}