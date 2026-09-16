package lab_2.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        MiPunto p1 = new MiPunto();
        MiPunto p2 = new MiPunto(10,30.5);

        System.out.println("......................................... Instanciar Puntos .................................");
        System.out.println("El punto 1: " + p1);
        System.out.println("El punto 2: " + p2);
        System.out.println("......................................... Calcular Distancias ................................");
        System.out.println("La distancia de el punto 2 al punto con coordenadas especificadas: " + p1.distancia(12, 3));
        System.out.println("La distancia de el punto 1 al punto 2: " + p1.distancia(p2));
        System.out.println("..............................................................................................");
    }
}
