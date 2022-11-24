public class Cuadrado extends Rectangulo{

    Cuadrado(String color, boolean relleno, double ancho, double largo) {
        super(color, relleno, ancho, largo);

    }
    public void setSide(){
        this.ancho = this.largo;
    }

    public double getSide(){
        return ancho;
    }

    
}
