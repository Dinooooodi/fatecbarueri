public class NumeroComplexo {

    private double real;
    private double imaginario;

    public NumeroComplexo(
            double real,
            double imaginario) {

        this.real = real;
        this.imaginario = imaginario;
    }

    public NumeroComplexo somar(
            NumeroComplexo outro) {

        return new NumeroComplexo(
                this.real + outro.real,
                this.imaginario + outro.imaginario);
    }

    public NumeroComplexo subtrair(
            NumeroComplexo outro) {

        return new NumeroComplexo(
                this.real - outro.real,
                this.imaginario - outro.imaginario);
    }

    public NumeroComplexo multiplicar(
            NumeroComplexo outro) {

        double novoReal =
                (this.real * outro.real)
                - (this.imaginario * outro.imaginario);

        double novoImaginario =
                (this.real * outro.imaginario)
                + (this.imaginario * outro.real);

        return new NumeroComplexo(
                novoReal,
                novoImaginario);
    }

    public boolean equals(
            NumeroComplexo outro) {

        return this.real == outro.real
                &&
                this.imaginario == outro.imaginario;
    }

    @Override
    public String toString() {

        return real
                + " + "
                + imaginario
                + "i";
    }
}
