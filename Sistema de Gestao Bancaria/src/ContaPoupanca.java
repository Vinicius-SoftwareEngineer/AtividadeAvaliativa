public class ContaPoupanca extends Conta{
    private double taxaRendimentoMensal;

    public ContaPoupanca(String numero, String titular, double saldo, double taxaRendimentoMensal){
        super(numero, titular, saldo);
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }

    public double getTaxaRendimentoMensal() {
        return taxaRendimentoMensal;
    }

    public void setTaxaRendimentoMensal(double taxaRendimentoMensal) {
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("Taxa de rendimento mensal: %.2f%\n", getTaxaRendimentoMensal());
    }

    public void mostrarDados(boolean emTaxaAnual){
        mostrarDados();
        if (emTaxaAnual){
            double ta = getTaxaRendimentoMensal() * 12;
            System.out.printf("Taxa de rendimento anual(Aproximadamente): %.2f%\n", ta);
        }
    }
}
