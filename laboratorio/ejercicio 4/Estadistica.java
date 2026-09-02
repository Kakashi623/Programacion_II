import java.util.Scanner;

public class Estadistica {
    public static double promedio(double[] valores) {
        double suma = 0;

        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
        }

        return suma / valores.length;
    }

    public static double desviacion(double[] valores) {
        double prom = promedio(valores);
        double suma = 0;

        for (int i = 0; i < valores.length; i++) {
            suma += Math.pow(valores[i] - prom, 2);
        }

        return Math.sqrt(suma / (valores.length - 1));
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] valores = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            valores[i] = entrada.nextDouble();
        }
        System.out.println("El promedio es " + promedio(valores));
        System.out.println("La desviación estándar es " + desviacion(valores));

        entrada.close();
    }
}