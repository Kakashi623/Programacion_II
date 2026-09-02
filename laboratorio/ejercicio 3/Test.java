import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        EcuacionCuadratica ecuacion =
            new EcuacionCuadratica(a, b, c);

        double discriminante = ecuacion.getDiscriminante();

        if (discriminante > 0) {

            System.out.println("La ecuación tiene dos raíces");
            System.out.println("r1 = " + ecuacion.getRaiz1());
            System.out.println("r2 = " + ecuacion.getRaiz2());

        } else if (discriminante == 0) {

            System.out.println("La ecuación tiene una raíz");
            System.out.println("r = " + ecuacion.getRaiz1());

        } else {

            System.out.println("La ecuación no tiene raíces reales");
        }

        entrada.close();
    }
}
