/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package universidadulp.vistas;

/**
 *
 * @author IGNACIO
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAlumno = new javax.swing.JMenu();
        jmiFormAlumno = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jmiFormMateria = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        jmiManejoInscrip = new javax.swing.JMenuItem();
        jmiManipNotas = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiAlumXMateria = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");
        setSize(new java.awt.Dimension(1000, 1000));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jmAlumno.setText("Alumno");

        jmiFormAlumno.setText("Formulario Alumno");
        jmiFormAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormAlumnoActionPerformed(evt);
            }
        });
        jmAlumno.add(jmiFormAlumno);

        jMenuBar1.add(jmAlumno);

        jmMateria.setText("Materia");

        jmiFormMateria.setText("Formulario Materia");
        jmiFormMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormMateriaActionPerformed(evt);
            }
        });
        jmMateria.add(jmiFormMateria);

        jMenuBar1.add(jmMateria);

        jmAdministracion.setText("Administración");

        jmiManejoInscrip.setText("Manejo de Inscripciones");
        jmiManejoInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManejoInscripActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiManejoInscrip);

        jmiManipNotas.setText("Manipulación de notas");
        jmiManipNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManipNotasActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiManipNotas);

        jMenuBar1.add(jmAdministracion);

        jmConsultas.setText("Consultas");

        jmiAlumXMateria.setText("Alumnos por materia");
        jmiAlumXMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlumXMateriaActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiAlumXMateria);

        jMenuBar1.add(jmConsultas);

        jmSalir.setText("Salir");
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFormAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormAlumnoActionPerformed
        
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormularioAlumno fa = new FormularioAlumno();
        fa.setVisible(true);
        fa.setLocation(200, 100);
        
       
        jDesktopPane1.add(fa);
        jDesktopPane1.moveToFront(fa);
        
        
        
    }//GEN-LAST:event_jmiFormAlumnoActionPerformed

    private void jmiFormMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormMateriaActionPerformed
       
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormularioMateria fm = new FormularioMateria();
        fm.setVisible(true);
        fm.setLocation(200, 100);
        
       
        jDesktopPane1.add(fm);
        jDesktopPane1.moveToFront(fm);
    }//GEN-LAST:event_jmiFormMateriaActionPerformed

    private void jmiManejoInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManejoInscripActionPerformed
         jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormularioInscripcion finsc = new FormularioInscripcion();
        finsc.setVisible(true);
        finsc.setLocation(200, 100);
        
       
        jDesktopPane1.add(finsc);
        jDesktopPane1.moveToFront(finsc);
    }//GEN-LAST:event_jmiManejoInscripActionPerformed

    private void jmiManipNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManipNotasActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        CargarNotas cn = new CargarNotas();
        cn.setVisible(true);
        cn.setLocation(200, 100);
        
       
        jDesktopPane1.add(cn);
        jDesktopPane1.moveToFront(cn);
    }//GEN-LAST:event_jmiManipNotasActionPerformed

    private void jmiAlumXMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlumXMateriaActionPerformed
               jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ConsultaAlumPorMat cam = new ConsultaAlumPorMat();
        cam.setVisible(true);
        cam.setLocation(200, 100);
        
       
        jDesktopPane1.add(cam);
        jDesktopPane1.moveToFront(cam);
    }//GEN-LAST:event_jmiAlumXMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmMateria;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem jmiAlumXMateria;
    private javax.swing.JMenuItem jmiFormAlumno;
    private javax.swing.JMenuItem jmiFormMateria;
    private javax.swing.JMenuItem jmiManejoInscrip;
    private javax.swing.JMenuItem jmiManipNotas;
    // End of variables declaration//GEN-END:variables
}
