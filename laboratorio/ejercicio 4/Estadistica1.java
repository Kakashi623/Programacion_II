public class Estadistica1 {

    private double[] valores;

    public Estadistica1(double[] valores) {
        this.valores = valores;
    }
    public double promedio() {
        double suma = 0;

        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
        }

        return suma / valores.length;
    }

    public double desviacion() {
        double prom = promedio();
        double suma = 0;

        for (int i = 0; i < valores.length; i++) {
            suma += Math.pow(valores[i] - prom, 2);
        }

        return Math.sqrt(suma / (valores.length - 1));
    }
}