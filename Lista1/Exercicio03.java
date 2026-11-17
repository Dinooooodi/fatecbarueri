public class Exercicio03 {

    private double real;
    private double imaginario;

    public Exercicio03(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public Exercicio03 somar(Exercicio03 outro) {
        return new Exercicio03(
                this.real + outro.real,
                this.imaginario + outro.imaginario);
    }

    public Exercicio03 subtrair(Exercicio03 outro) {
        return new Exercicio03(
                this.real - outro.real,
                this.imaginario - outro.imaginario);
    }

    public Exercicio03 multiplicar(Exercicio03 outro) {

        double novoReal =
                (this.real * outro.real)
                - (this.imaginario * outro.imaginario);

        double novoImaginario =
                (this.real * outro.imaginario)
                + (this.imaginario * outro.real);

        return new Exercicio03(
                novoReal,
                novoImaginario);
    }

    public boolean equals(Exercicio03 outro) {

        return this.real == outro
