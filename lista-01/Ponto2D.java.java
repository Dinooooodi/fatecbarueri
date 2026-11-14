public class Ponto2D {

    private double x;
    private double y;

    public Ponto2D() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D outroPonto) {
        this.x = outroPonto.x;
        this.y = outroPonto.y;
    }

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

    public void mover() {
        this.x = 0;
        this.y = 0;
    }

    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(Ponto2D outroPonto) {
        this.x = outroPonto.x;
        this.y = outroPonto.y;
    }

    public boolean equals(Ponto2D outroPonto) {
        return this.x == outroPonto.x
                && this.y == outroPonto.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distancia(Ponto2D outroPonto) {

        double dx = outroPonto.x - this.x;
        double dy = outroPonto.y - this.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public Ponto2D clone() {
        return new Ponto2D(this.x, this.y);
    }
}
