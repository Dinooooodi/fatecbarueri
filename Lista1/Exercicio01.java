public class Exercicio01 {

    private int valor;

    public Exercicio01() {
        this.valor = 0;
    }

    public void zerar() {
        this.valor = 0;
    }

    public void incrementar() {
        this.valor++;
    }

    public int getValor() {
        return this.valor;
    }

    public static void main(String[] args) {

        Exercicio01 contador = new Exercicio01();

        contador.incrementar();
        contador.incrementar();
        contador.incrementar();

        System.out.println("Valor atual: "
                + contador.getValor());

        contador.zerar();

        System.out.println("Valor após zerar: "
                + contador.getValor());
    }
}
