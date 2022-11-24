public class Rectangulo extends Forma{
    private double ancho;
    private double largo;

    Rectangulo(String color, boolean relleno, double ancho, double largo) {
        super(color, relleno);
        getAncho();
        getLargo();
        getArea();
        getPerimetro();
    }

    @Override
    public void getArea() {
        
    }

    @Override
    public void getPerimetro() {

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
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", largo=" + largo +
                '}';
    }
}
