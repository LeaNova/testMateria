package testmateria;

/**
 * @author LeaNova
 */
public class Colegio {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Materia ma1 = new Materia(1505, "Inglés", 1);
        Materia ma2 = new Materia(3554, "Matemáticas", 1);
        Materia ma3 = new Materia(2098, "Laboratorio I", 1);

        Alumno a1 = new Alumno(1001, "López", "Martín");
        Alumno a2 = new Alumno(1002, "Martínez", "Brenda");
        
        a1.agregarMateria(ma1);
        a1.agregarMateria(ma2);
        a1.agregarMateria(ma3);
        
        a2.agregarMateria(ma1);
        a2.agregarMateria(ma2);
        a2.agregarMateria(ma3);
        a2.agregarMateria(ma2);
        
        System.out.println(a1.cantidadMaterias());
        System.out.println(a2.cantidadMaterias());
    }
}