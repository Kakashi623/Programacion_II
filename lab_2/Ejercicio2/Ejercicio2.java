package lab_2.Ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {

        Vector a = new Vector(2, 3, 4);
        Vector b = new Vector(4, 6, 8);
        AlgebraVectorial algebra = new AlgebraVectorial(a, b);
        System.out.println("Vector a = " + a);
        System.out.println("Vector b = " + b);
        System.out.println();
        System.out.println("PERPENDICULAR");
        System.out.println("Metodo c: " + algebra.perpendicular(a, b) );
        System.out.println("Metodo a: " + algebra.perpendicular(a, b, 'a'));
        System.out.println("Metodo d: " + algebra.perpendicular(a, b, 'd'));

        System.out.println("Metodo b: " + algebra.perpendicularB(a, b));
        System.out.println();
        System.out.println("PARALELOS");

        System.out.println("Metodo e: " + algebra.paralelos(a, b));

        System.out.println("Metodo f: " + algebra.paralelos(a, b, 'f'));
      
        System.out.println();
        System.out.println("PROYECCION");

        Vector proy =
            algebra.proyeccion(a, b);

        System.out.println(
            "Proyeccion de a sobre b = " + proy
        );

        System.out.println();
        System.out.println("COMPONENTE");

        double comp =
            algebra.componente(a, b);

        System.out.println(
            "Componente de a en b = " + comp
        );
    }
}
