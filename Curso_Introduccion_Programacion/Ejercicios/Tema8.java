public class Tema8 {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(18);
        System.out.println("La persona 1 tiene " + persona1.getEdad() + " años.");
        persona1.setNombre("Gertrudis");
        System.out.println("La persona 1 se llama " + persona1.getNombre());
        persona1.setTelefono(666555444);
        System.out.println("El teléfono de la persona 1 es el " + persona1.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }
}
