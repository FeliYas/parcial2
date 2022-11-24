public class Rectangulo extends Forma{

    private double ancho;
    private double largo;

    Rectangulo(String color, boolean relleno, double ancho, double largo) {
        super(color, relleno);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
}
