public class Tema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(36);
        cliente.setNombre("Gregorio");
        cliente.setTelefono(666555444);
        cliente.setCredito(215000);
        System.out.println("El cliente tiene " + cliente.getEdad() + " años y se llama " + cliente.getNombre()
        + ". El teléfono del cliente es el " + cliente.getTelefono() + ", tiene un crédito de "
                + cliente.getCredito() + " €.");
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(21);
        trabajador.setNombre("Francisca Petronia");
        trabajador.setTelefono(654321987);
        trabajador.setSalario(1800.50);
        System.out.println("La trabajadora tiene " + trabajador.getEdad() + " años y se llama " + trabajador.getNombre()
                + ". El teléfono de la trabajadora es el " + trabajador.getTelefono() + ", tiene un salario de "
                + trabajador.getSalario() + " €.");
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
class Trabajador extends Persona2 {
    double salario;
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return this.salario;
    }
}
