public class Rectangulo extends Forma{
    public double ancho = 1.0;
    public double largo = 1.0;

    Rectangulo(String color, boolean relleno, double ancho, double largo) {
        super(color, relleno);
        getAncho();
        getLargo();
        getArea();
        getPerimetro();
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

    @Override
    public void getArea() {

    }

    @Override
    public void getPerimetro() {

    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", largo=" + largo +
                '}';
    }
}
