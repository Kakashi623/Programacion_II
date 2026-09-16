import java.util.Random;

public class Test {

    public static void main(String[] args) {

        int[] numeros = new int[100000];

        Random aleatorio = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(100000);
        }

        Cronometro cronometro = new Cronometro();

        cronometro.inicia();

        for (int i = 0; i < numeros.length - 1; i++) {

            int menor = i;

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[j] < numeros[menor]) {
                    menor = j;
                }
            }

            int temporal = numeros[i];
            numeros[i] = numeros[menor];
            numeros[menor] = temporal;
        }

        cronometro.detener();

        System.out.println(
            "Tiempo de ejecución: " +
            cronometro.lapsoDeTiempo() +
            " milisegundos"
        );
    }
}