
package Principal;


import javax.swing.JOptionPane;

public class Principal {

     public static void main(String[] args) {
         
     
    DAOEstudiantes Estudiante = new DAOEstudiantes ();
    Profes Profesor = new Profes();
        
    
     String opi = "si";

        while (opi.equalsIgnoreCase("si")) {

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU PRINCIPAL CRUD\n"
                    + "1. CRUD Estudiantes\n"
                    + "2. CRUD Profesores\n"
            ));

            switch (opcion) {
                case 1: 
                    Estudiante.menu_estudiante(); 
                break;
                
                case 2: 
                    Profesor.menu_profesor(); 
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }

            opi = JOptionPane.showInputDialog("¿Deseas volver a el menu principal? (si/no)");
        }
    

        
        
    }
}