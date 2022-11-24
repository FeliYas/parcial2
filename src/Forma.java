public abstract class Forma {
    private String color;
    private boolean relleno = true;

    Forma(String color, boolean relleno){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    abstract public void getArea(double)

    @Override
    public String toString() {
        return "Forma{" +
                "color='" + color + '\'' +
                ", relleno=" + relleno +
                '}';
    }
}
