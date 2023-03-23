public class Tema3 {
    public static void main (String[] args) {
        int suma = funcSuma(1,2,3);
        System.out.println("Suma: " + suma);

        Coche miCoche = new Coche();
        miCoche.incrementaPuertas();
        System.out.println("Puertas: " + miCoche.puertas);
    }
    public static int funcSuma(int a, int b, int c) {
        return a + b + c;
    }
}
class Coche {
    int puertas = 4;
    public void incrementaPuertas() {
        this.puertas++;
    }
}
