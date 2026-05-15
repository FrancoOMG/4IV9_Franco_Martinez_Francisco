
package Principal;


import Principal.Estudiante;
import java.io.*;

public class Hola {
    
    public static void GuardarEtudiante(Estudiante[] estudiante, int x){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter ("estudiante.txt"));
            
            
            for (int i = 0; i < x; i++){
                
                writer.write(estudiante[i].getNumBoleta() + "," + estudiante[i].getNombre() + "," + estudiante[i].getEdad() + "," + estudiante[i].getGenero());
                
                writer.newLine();
            }
            
            writer.close();
        } catch (IOException e) {
            
            System.out.println("Hubo un error al guardar estudiante");
        }
    }
    
    public static Estudiante[] cargarEstudiante(){
        
        Estudiante[] estudiante = new Estudiante[10];
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("estudiante.txt"));
            
            String linea;
            
            int i = 0;
            while ((linea = reader.readLine()) != null) {

                String[] datos = linea.split(",");
                
                estudiante[i] = new Estudiante(Integer.parseInt(datos[0]), datos[1], Integer.parseInt(datos[2]), datos[3].charAt(0));
                i++;
                
            }
            
            reader.close();
            
        } catch (IOException e) {
            
            System.out.println("El archivo del estudiante no se encontro");
            
        }
        
        return estudiante;
    
    }
    

    
    public static void GuardarProfesor(Profesor[] profesor, int x){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter ("profesor.txt"));
            
            
            for (int i = 0; i < x; i++){
                
                writer.write(profesor[i].getid_profesor()+ "," + profesor[i].getNombre() + "," + profesor[i].getEdad() + "," + profesor[i].getGenero());
                
                writer.newLine();
            }
            
            writer.close();
        } catch (IOException e) {
            
            System.out.println("Hubo un error al guardar profesor");
        }
    }
    
    public static Profesor[] cargarProfesor(){
        
        Profesor[] profesor = new Profesor[10];
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("profesor.txt"));
            
            String linea;
            
            int i = 0;
            while ((linea = reader.readLine()) != null) {

                String[] datos = linea.split(",");
                
                profesor[i] = new Profesor(Integer.parseInt(datos[0]), datos[1], Integer.parseInt(datos[2]), datos[3].charAt(0));
                i++;
                
            }
            
            reader.close();
            
        } catch (IOException e) {
            
            System.out.println("El archivo del profesor no se encontro");
            
        }
        
        return profesor;
    
    }
    
    
}