package lab_2.Ejercicio2;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double productoPunto(Vector b) {
        return x * b.x + y * b.y + z * b.z;
    }

    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector restar(Vector b) {
        return new Vector(
            x - b.x,
            y - b.y,
            z - b.z
        );
    }

    public Vector sumar(Vector b) {
        return new Vector(
            x + b.x,
            y + b.y,
            z + b.z
        );
    }

    public Vector multiplicar(double r) {
        return new Vector(
            r * x,
            r * y,
            r * z
        );
    }

    public Vector productoCruz(Vector b) {

        double nuevoX = y * b.z - z * b.y;
        double nuevoY = z * b.x - x * b.z;
        double nuevoZ = x * b.y - y * b.x;

        return new Vector(nuevoX, nuevoY, nuevoZ);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
