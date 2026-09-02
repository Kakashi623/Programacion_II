public class Cronometro {

    private long inicio;
    private long finaliza;

    public Cronometro() {
        inicio = System.currentTimeMillis();
    }

    public void inicia() {
        inicio = System.currentTimeMillis();
    }

    public void detener() {
        finaliza = System.currentTimeMillis();
    }

    public long lapsoDeTiempo() {
        return finaliza - inicio;
    }
}
