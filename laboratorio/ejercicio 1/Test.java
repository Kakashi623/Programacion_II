import java.util.Random;

public class Test {

    public static void main(String[] args) {

        int[] numeros = new int[100000];

        Random aleatorio = new Random();

        // Llenar el arreglo con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(100000);
        }

        // Crear el cronómetro
        Cronometro cronometro = new Cronometro();

        // Iniciar
        cronometro.inicia();

        // Ordenamiento por selección
        for (int i = 0; i < numeros.length - 1; i++) {

            int menor = i;

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[j] < numeros[menor]) {
                    menor = j;
                }
            }

            // Intercambiar
            int temporal = numeros[i];
            numeros[i] = numeros[menor];
            numeros[menor] = temporal;
        }

        // Detener
        cronometro.detener();

        System.out.println(
            "Tiempo de ejecución: " +
            cronometro.lapsoDeTiempo() +
            " milisegundos"
        );
    }
}