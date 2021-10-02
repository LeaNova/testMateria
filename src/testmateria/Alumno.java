package testmateria;

import java.util.HashSet;

/**
 * @author Leandro Heredia
 */
public class Alumno {
    private int legajo;
    private String Apellido;
    private String Nombre;
    private HashSet<Materia> materias = new HashSet<>();

    public Alumno(int legajo, String Apellido, String Nombre) {
        this.legajo = legajo;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        materias = new HashSet<>();
    }

    // Getters y Setters
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }
    
    // Métodos
    public boolean agregarMateria(Materia ma) {
        if (ma.equals(ma)) {
            materias.add(ma);
            return true;
        } else {
            return false;
        }
    }
    
    public int cantidadMaterias() {
        return materias.size();
    }
    
    // Overrides
    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Alumno)){
            return false;
        } else {
            Alumno viene =(Alumno)obj;
            return legajo == viene.getLegajo();
        }
    }
    
    @Override
    public int hashCode() {
        return legajo;
    }

    @Override
    public String toString() {
        return Apellido + " " + Nombre;
    }
    
    
}