package Entidade;

public class Calculo {
    public double ValorInicial;
    public double TxJuros;
    public double Periodo;

    public double simples() {
        return (ValorInicial * TxJuros * Periodo) / 100 + ValorInicial;
    }

}
