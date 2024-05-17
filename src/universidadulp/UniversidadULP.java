
package universidadulp;


import java.sql.*;
import javax.swing.JOptionPane;


public class UniversidadULP {

    
    public static void main(String[] args) {
       //verificando git
        try {
           
            Class.forName("org.mariadb.jdbc.Driver");
            String bd = "jdbc:mysql://localhost:3306/tp13universidadulp";
            String usuario = "root";
            String password = "";
            

                Connection con = DriverManager.getConnection(bd, usuario, password);
   
     
               
                
             
                /*   
               ---------------------------------Desinscribir a un alumno de una materia-----------------------------------------
                
                
                String sql = "DELETE FROM inscripcion "
                        + "WHERE idInscripto = 1" ;
                
                PreparedStatement ps = con.prepareStatement(sql);
                
                int resultado = ps.executeUpdate();
                System.out.println(resultado);
           
                
                
                
                
                
                
                /*    
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
                
                
                
         /*
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
         */
     
        }  catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error");
 
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el driver");
    
        }
    }
}
