public class Tema4 {
    public static void main(String[] args) {

        //IF
        int numeroIf = 12;
        if(numeroIf < 0) {
            System.out.println("El númeroIf es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El númeroIf es positivo");
        } else {
            System.out.println("El númeroIf es 0");
        }

        //WHILE
        int numeroWhile = -5;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El númeroWhile es: " + numeroWhile);
        }

        //DO WHILE
        int numeroDoWhile = 8;
        do {
            numeroDoWhile++;
            System.out.println("El númeroDoWhile es: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        //FOR
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El númeroFor es: " + numeroFor);
        }

        //SWITCH CASE
        var estacion = "otoño";
        switch(estacion) {
            case "primavera":
                System.out.println("Estamos en " + estacion);
                break;
            case "verano":
                System.out.println("Estamos en " + estacion);
                break;
            case "otoño":
                System.out.println("Estamos en " + estacion);
                break;
            case "invierno":
                System.out.println("Estamos en " + estacion);
                break;
            default:
                System.out.println("Estamos en default");
        }
    }
}
