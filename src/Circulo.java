public class Circulo extends Forma{
    private double radio = 1.0;

    Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        getRadio();
        getArea();
        getPerimetro();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void getArea() {

    }

    @Override
    public void getPerimetro() {

    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
