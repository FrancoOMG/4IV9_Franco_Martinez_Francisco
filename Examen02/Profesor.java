

package Principal;

import Principal.Persona;

public class Profesor extends Persona{
    private int id_profesor;
    
    public Profesor(int id_profesor, String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.id_profesor = id_profesor;
    }
    
    public int getid_profesor() {
        return id_profesor;
    }

    public void setid_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

}