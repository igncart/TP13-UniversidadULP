
package universidadulp.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadulp.accesoADatos.*;
import universidadulp.entidades.*;
 
public class CargarNotas extends javax.swing.JInternalFrame {

    private InscripcionData inscData;
    private AlumnoData aluData;
    private MateriaData matData;

    private List<Alumno> listaAlu;
    private List<Inscripcion> listaInsc;
;
    private DefaultTableModel modelo = new DefaultTableModel();


    public CargarNotas() {
        initComponents();

        inscData = new InscripcionData();
        aluData = new AlumnoData();
        matData = new MateriaData();
        cargarCombo();
        armarCabeceraTabla();

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
        jcbSelecAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaNotas = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Selecciona un alumno:");

        jcbSelecAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelecAlumnoActionPerformed(evt);
            }
        });

        TablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Nota"
            }
        ));
        jScrollPane1.setViewportView(TablaNotas);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(jcbSelecAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbSelecAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbSelecAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelecAlumnoActionPerformed
Alumno alu = (Alumno)jcbSelecAlumno.getSelectedItem();
        if(alu != null){
            cargarTabla(alu.getIdAlumno());
        }else{
            JOptionPane.showMessageDialog(this, "Elija un alumno >:(");
        }
    }//GEN-LAST:event_jcbSelecAlumnoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
   int idMat;
        String nota1;
        int nota2;

        Alumno alu = (Alumno)jcbSelecAlumno.getSelectedItem();
        try{
                 idMat = (Integer)modelo.getValueAt(TablaNotas.getSelectedRow(), 0);
                 nota1 = modelo.getValueAt(TablaNotas.getSelectedRow(), 2)+"";
                 nota2 = Integer.parseInt(nota1);
                 inscData.actualizarNota(alu.getIdAlumno(), idMat, nota2);

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "error");

        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbSalirActionPerformed

    private void cargarCombo() {
        listaAlu = aluData.listarAlumnos();
        for (Alumno alumno : listaAlu) {
            jcbSelecAlumno.addItem(alumno);
        }
    }

    private void armarCabeceraTabla(){
        ArrayList<Object> filaCabecera= new ArrayList<>();
        filaCabecera.add("Código");
        filaCabecera.add("Nombre");
        filaCabecera.add("Nota");

        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }

        TablaNotas.setModel(modelo);
    }

    private void borrarFilas() {
        int filas = modelo.getRowCount()-1;
        for (int i = filas; i  >=0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarTabla(int id) {
        borrarFilas();
        Materia mat;
        listaInsc = inscData.obtenerInscripcionesPorAlumno(id);
            for(Inscripcion insc : listaInsc){
            mat = insc.getMateria();
            modelo.addRow(new Object[]{mat.getIdMateria(),mat.getNombre(),insc.getNota()});
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaNotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbSelecAlumno;
    // End of variables declaration//GEN-END:variables
}
