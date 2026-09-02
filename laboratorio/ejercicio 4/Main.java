import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextDouble();
        }

        Estadistica1 estadistica = new Estadistica1(numeros);

        System.out.println();
        System.out.println("El promedio es " + estadistica.promedio());
        System.out.println("La desviación estándar es " + estadistica.desviacion());

        entrada.close();
    }
}