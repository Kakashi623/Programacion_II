package lab_2.Ejercicio1;

public class MiPunto {
    private double x;
    private double y;

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
    
    public MiPunto(){
        this.x = 0;
        this.y = 0; 
    }

    public MiPunto(double x, double y){
        this.x = x;
        this.y = y; 
    }
    
    public double distancia(MiPunto punto){
        return Math.sqrt(Math.pow(punto.x - this.x,2) + (Math.pow(punto.y, 2)));
    }
    public double distancia(double x, double y){
        return Math.sqrt(Math.pow(x - this.x,2) + (Math.pow(y, 2)));
    }
    @Override 
    public String toString(){
        return "(" + x + "," + y + ")"; 
    }
}
