public class Exercicio02 {

    private double x;
    private double y;

    public Exercicio02() {
        this.x = 0;
        this.y = 0;
    }

    public Exercicio02(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Exercicio02(Exercicio02 outroPonto) {
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

    public void mover(Exercicio02 outroPonto) {
        this.x = outroPonto.x;
        this.y = outroPonto.y;
    }

    public boolean equals(Exercicio02 outroPonto) {
        return this.x == outroPonto.x
                && this.y == outroPonto.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distancia(Exercicio02 outroPonto) {

        double dx = outroPonto.x - this.x;
        double dy = outroPonto.y - this.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public Exercicio02 clone() {
        return new Exercicio02(this.x, this.y);
    }

    public static void main(String[] args) {

        Exercicio02 ponto1 =
                new Exercicio02(2, 3);

        Exercicio02 ponto2 =
                new Exercicio02(5, 7);

        System.out.println("Ponto 1: "
                + ponto1);

        System.out.println("Ponto 2: "
                + ponto2);

        System.out.println("Distância: "
                + ponto1.distancia(ponto2));

        Exercicio02 copia =
                ponto1.clone();

        System.out.println("Cópia: "
                + copia);
    }
}
