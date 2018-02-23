
package practicanomina;


public class arbolito {
    String nombre,puesto;
    double sueldo;
    
    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public arbolito() {
    }

    public arbolito(String nombre, String puesto, double sueldo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
       
       return "Nombre:    " + nombre +"     puesto:     "+puesto+ "       Sueldo:$" + sueldo;
    }
    
}
