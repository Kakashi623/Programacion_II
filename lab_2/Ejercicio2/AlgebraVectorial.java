package lab_2.Ejercicio2;

public class AlgebraVectorial {

    private Vector a;
    private Vector b;

    public AlgebraVectorial() {
        a = new Vector();
        b = new Vector();
    }

    public AlgebraVectorial(Vector a, Vector b) {
        this.a = a;
        this.b = b;
    }

    public boolean perpendicular(Vector a, Vector b) {

        return Math.abs(a.productoPunto(b)) < 0.000001;
    }

    public boolean perpendicular(Vector a, Vector b, char metodo) {

        if (metodo == 'a') {
            Vector suma = a.sumar(b);
            Vector resta = a.restar(b);

            return Math.abs(
                suma.magnitud() - resta.magnitud()
            ) < 0.000001;
        } 
        else if (metodo == 'd') {
            double izquierda =
                Math.pow(a.sumar(b).magnitud(), 2);
            double derecha = Math.pow(a.magnitud(), 2) + Math.pow(b.magnitud(), 2);
            return Math.abs(izquierda - derecha) < 0.000001;
        }
        return false;
    }

    public boolean perpendicularB(Vector a, Vector b) {
        double izquierda = a.restar(b).magnitud();
        double derecha = b.restar(a).magnitud();
        return Math.abs(izquierda - derecha)
                < 0.000001;
    }
    public boolean paralelos(Vector a, Vector b){
            if (b.magnitud() == 0) {
            return false;
        }
        double r;
        if (Math.abs(b.getX()) > 0.000001) {
            r = a.getX() / b.getX();
        } 
        else if (Math.abs(b.getY()) > 0.000001) {
            r = a.getY() / b.getY();
        } else {
            r = a.getZ() / b.getZ();
        }
        Vector resultado = b.multiplicar(r);
        return Math.abs(a.getX() - resultado.getX()) < 0.000001
            && Math.abs(a.getY() - resultado.getY()) < 0.000001
            && Math.abs(a.getZ() - resultado.getZ()) < 0.000001;
    }
    public boolean paralelos(Vector a, Vector b, char metodo) {
        Vector cruz = a.productoCruz(b);
        return cruz.magnitud() < 0.000001;
    }
    public Vector proyeccion(Vector a, Vector b) {

        double producto = a.productoPunto(b);

        double magnitudB2 =
            Math.pow(b.magnitud(), 2);

        double factor = producto / magnitudB2;

        return b.multiplicar(factor);
    }
    public double componente(Vector a, Vector b) {

        return a.productoPunto(b) / b.magnitud();
    }
}