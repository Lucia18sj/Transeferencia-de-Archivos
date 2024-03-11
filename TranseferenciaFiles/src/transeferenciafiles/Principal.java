/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package transeferenciafiles;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author analu
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    private File ArchivoS ;
    public Principal() {
        initComponents();
        txtDireccion.setText("");
        txtPuerto.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlArchivo = new javax.swing.JPanel();
        btnArchivo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArchivos = new javax.swing.JTextArea();
        pnlEnviar = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtPuerto = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(680, 420));
        setMinimumSize(new java.awt.Dimension(680, 420));

        jPanel1.setBackground(new java.awt.Color(240, 228, 216));
        jPanel1.setLayout(null);

        pnlArchivo.setBackground(new java.awt.Color(217, 129, 105));

        btnArchivo.setFont(new java.awt.Font("Chopin Light", 1, 14)); // NOI18N
        btnArchivo.setForeground(new java.awt.Color(255, 255, 255));
        btnArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnArchivo.setText("Seleccionar Archivo");
        btnArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArchivoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnArchivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnArchivoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlArchivoLayout = new javax.swing.GroupLayout(pnlArchivo);
        pnlArchivo.setLayout(pnlArchivoLayout);
        pnlArchivoLayout.setHorizontalGroup(
            pnlArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArchivoLayout.createSequentialGroup()
                .addComponent(btnArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlArchivoLayout.setVerticalGroup(
            pnlArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlArchivoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnlArchivo);
        pnlArchivo.setBounds(410, 210, 180, 20);

        txtArchivos.setBackground(new java.awt.Color(217, 129, 105));
        txtArchivos.setColumns(20);
        txtArchivos.setFont(new java.awt.Font("Chopin Light", 1, 14)); // NOI18N
        txtArchivos.setRows(5);
        txtArchivos.setWrapStyleWord(true);
        txtArchivos.setBorder(null);
        jScrollPane1.setViewportView(txtArchivos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(410, 230, 260, 100);

        pnlEnviar.setBackground(new java.awt.Color(134, 165, 168));
        pnlEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlEnviarMouseClicked(evt);
            }
        });

        btnEnviar.setFont(new java.awt.Font("Aesthico (Demo)", 0, 18)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(47, 72, 66));
        btnEnviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEnviar.setText("Enviar");
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlEnviarLayout = new javax.swing.GroupLayout(pnlEnviar);
        pnlEnviar.setLayout(pnlEnviarLayout);
        pnlEnviarLayout.setHorizontalGroup(
            pnlEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pnlEnviarLayout.setVerticalGroup(
            pnlEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnviarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnlEnviar);
        pnlEnviar.setBounds(370, 350, 200, 40);

        jPanel2.setBackground(new java.awt.Color(176, 80, 68));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Mercado", 0, 72)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TCP / IP");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(320, 40, 290, 90);

        jLabel2.setFont(new java.awt.Font("Chopin Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("por");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(380, 20, 180, 27);

        jLabel5.setFont(new java.awt.Font("Chopin Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Transferencia de Archivos");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(280, 0, 360, 27);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 870, 110);

        txtDireccion.setBackground(new java.awt.Color(240, 228, 216));
        txtDireccion.setFont(new java.awt.Font("Chopin Light", 1, 14)); // NOI18N
        txtDireccion.setText(".");
        txtDireccion.setBorder(null);
        jPanel1.add(txtDireccion);
        txtDireccion.setBounds(170, 220, 210, 30);

        jSeparator1.setBackground(new java.awt.Color(176, 80, 68));
        jSeparator1.setForeground(new java.awt.Color(176, 80, 68));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(170, 250, 210, 10);

        txtPuerto.setBackground(new java.awt.Color(240, 228, 216));
        txtPuerto.setFont(new java.awt.Font("Chopin Light", 1, 14)); // NOI18N
        txtPuerto.setText(".");
        txtPuerto.setBorder(null);
        jPanel1.add(txtPuerto);
        txtPuerto.setBounds(170, 280, 210, 30);

        jSeparator2.setBackground(new java.awt.Color(176, 80, 68));
        jSeparator2.setForeground(new java.awt.Color(176, 80, 68));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(170, 310, 210, 10);

        jLabel1.setFont(new java.awt.Font("Chopin Light", 1, 18)); // NOI18N
        jLabel1.setText("Puerto");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 260, 200, 27);

        jLabel3.setFont(new java.awt.Font("Chopin Light", 1, 18)); // NOI18N
        jLabel3.setText("Dirección IP:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 200, 200, 27);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArchivoMouseClicked
        JFileChooser selector = new JFileChooser();
        int result = selector.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            ArchivoS = selector.getSelectedFile();
            txtArchivos.append("Selected file: " + ArchivoS.getName() + "\n");
        }
    }//GEN-LAST:event_btnArchivoMouseClicked

    private void btnArchivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArchivoMouseEntered
        pnlArchivo.setBackground(new Color(205,90,59));
    }//GEN-LAST:event_btnArchivoMouseEntered

    private void btnArchivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArchivoMouseExited
        pnlArchivo.setBackground(new Color(217,129,105));
    }//GEN-LAST:event_btnArchivoMouseExited

    private void pnlEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEnviarMouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_pnlEnviarMouseClicked

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        if (ArchivoS == null) {
            JOptionPane.showMessageDialog(this, "Seleccionar Archivo");
            return;
        }
        String ip = txtDireccion.getText();
        int port = Integer.parseInt(txtPuerto.getText());
        try {
            Socket socket = new Socket(ip, port);
            OutputStream outputStream = socket.getOutputStream();
            FileInputStream fileInputStream = new FileInputStream(ArchivoS);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            fileInputStream.close();
            outputStream.close();
            socket.close();
            JOptionPane.showMessageDialog(this, "Archivo Enviado con exito \n");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error de Envio \n");
        }
    }//GEN-LAST:event_btnEnviarMouseClicked

    private void btnEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseEntered
        pnlEnviar.setBackground(new Color(47,72,66));
        btnEnviar.setForeground(Color.white);
    }//GEN-LAST:event_btnEnviarMouseEntered

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        pnlEnviar.setBackground(new Color(134,165,168));
        btnEnviar.setForeground(new Color(47,72,66));
    }//GEN-LAST:event_btnEnviarMouseExited

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnArchivo;
    private javax.swing.JLabel btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pnlArchivo;
    private javax.swing.JPanel pnlEnviar;
    private javax.swing.JTextArea txtArchivos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtPuerto;
    // End of variables declaration//GEN-END:variables
}
