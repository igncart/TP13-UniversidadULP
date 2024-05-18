
package universidadulp;


import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import universidadulp.accesoADatos.AlumnoData;
import universidadulp.accesoADatos.Conexion;
import universidadulp.entidades.Alumno;


public class UniversidadULP {

    
    public static void main(String[] args) {
       
   
    
    //------------------------Unidad 5---------------------------
    // -----------Comprueba la Conexion con la BD
    //    Connection con= Conexion.getConexion();
    
      //--------------Agregar alumno a BD --------------
        //Alumno alumno=new Alumno(4, 12345652, "Gomez", "Jorge Gabriel", LocalDate.of(2001, 5, 18), true);
        //AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(alumno);
        //alu.modificarAlumno(alumno);
        //alu.eliminarAlumno(4);    //No elimina, cambia el estado
        
        //--------------Buscar Alumno----------
    /*    Alumno alumnoEncontrado=alu.buscarAlumno(5);        //para traer la informacion de la base de datos
        if(alumnoEncontrado != null){       //este if es para la excepcion que la tira, por si el Estado es False y la cual este solo buscar los id con estado True
            System.out.println("dni: "+alumnoEncontrado.getDni());
            System.out.println("apellido: "+alumnoEncontrado.getApellido());
        }
    */
        
    /*    Alumno alumnoPorDni=alu.buscarAlumnoPorDni(32654852);   //para buscar por DNI
        if(alumnoPorDni!=null){
            System.out.println("dni: "+alumnoPorDni.getDni());
            System.out.println("apellido: "+alumnoPorDni.getApellido());
        }
    */
        //------------Lista de la Base de Datos-----------
        AlumnoData alu=new AlumnoData();
        for (Alumno alumno : alu.listarAlumnos()) {
            
            System.out.println(alumno.getDni());
            System.out.println(alumno.getApellido());
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getFechaNacimiento());
        }
    
    }
    
}









/*    ---------- TP 13 -------------
        
        try {
        
            Class.forName("org.mariadb.jdbc.Driver");
            String bd = "jdbc:mysql://localhost:3306/tp13universidadulp";
            String usuario = "root";
            String password = "";
            

                Connection con = DriverManager.getConnection(bd, usuario, password);
  
                 
               ---------------------------------Desinscribir a un alumno de una materia-----------------------------------------
                
                
                String sql = "DELETE FROM inscripcion "
                        + "WHERE idInscripto = 1" ;
                
                PreparedStatement ps = con.prepareStatement(sql);
                
                int resultado = ps.executeUpdate();
                System.out.println(resultado);
                    
               ---------------------------------Consulta alumnos con nota mayor a 8-----------------------------------------
                
                String sql = "SELECT a.*, i.nota "
                        +"FROM alumno a JOIN inscripcion i ON (a.idAlumno = i.idAlumno) "
                        +"WHERE i.nota > 8";
                        
                        
                PreparedStatement ps = con.prepareStatement(sql);
                
                ResultSet resultado = ps.executeQuery();
                
                while (resultado.next()) {
                    
                    System.out.println("ID Alumno: "+resultado.getInt("idAlumno"));
                    System.out.println("DNI: "+resultado.getInt("dni"));
                    System.out.println("Apellido: "+resultado.getString("apellido"));
                    System.out.println("Nombre: "+resultado.getString("nombre"));
                    System.out.println("Fecha de Nacimiento: "+resultado.getString("fechaNacimiento"));
                    System.out.println("Estado: "+resultado.getBoolean("estado"));
                    System.out.println("Nota: "+resultado.getInt("nota"));
          
        }
       
            ------------------------------------Insertar inscripciones--------------------------------------------
               
                String sql="INSERT INTO inscripcion(nota, idAlumno, idMateria) "
                    + "VALUES(7, 1,1),"
                    + "(5, 1, 2),"
                    + "(9, 2, 4),"
                    + "(8, 2, 1),"
                    + "(10, 3, 2),"
                    + "(3, 3, 3)";
            
            PreparedStatement ps=con.prepareStatement(sql);
            int registro = ps.executeUpdate();
            System.out.println(registro);
       
        /*
         ------------------------------------Insertar materias--------------------------------------------
         
                String sql = "INSERT INTO materia (nombre, año, estado) "
                    + "VALUES('Matematica', 1, 1),"
                    + "('Lengua', 1, 1),"
                    + "('Sociales', 1, 1),"
                    + "('Naturales', 1, 1)";
           
            PreparedStatement ps = con.prepareStatement(sql);
            int registro = ps.executeUpdate();
            System.out.println(registro);
        
         ------------------------------------Insertar alumnos--------------------------------------------
         
         String sql="INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                    + "VALUES(32589412, 'Nievas', 'Clara', '2000-05-11', 1),"
                    + "(40689201, 'Molinari', 'Pedro', '1998-09-25', 1),"
                    + "(25100214, 'Chipoli', 'Javier', '1995-03-11', 1)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            int registro = ps.executeUpdate();
            System.out.println(registro);
         
     
        }  catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error");
 
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el driver");
    
        }
    */