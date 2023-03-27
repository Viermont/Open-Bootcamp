public class Tema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(36);
        System.out.println("El cliente tiene " + cliente.getEdad() + " años.");
        cliente.setNombre("Gregorio");
        System.out.println("El cliente se llama " + cliente.getNombre());
        cliente.setTelefono(666555444);
        System.out.println("El teléfono del cliente es el " + cliente.getTelefono());
        cliente.setCredito(215000);
        System.out.println("El cliente tiene un crédito de " + cliente.getCredito() + " €");
    }
}
class Persona2 {
    int edad;
    String nombre;
    int telefono;
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
class Cliente extends Persona2 {
    int credito;
    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito() {
        return this.credito;
    }
}
