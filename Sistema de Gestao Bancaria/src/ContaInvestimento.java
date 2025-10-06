import java.util.Scanner;

public class ContaInvestimento extends Conta{
    private double taxaAdministracao;
    Scanner sc = new Scanner(System.in);

    public ContaInvestimento(String numero, String titular, double saldo, double taxaAdministracao){
        super(numero, titular, saldo);
        this.taxaAdministracao = taxaAdministracao;
    }

    public double getTaxaAdministracao() {
        return taxaAdministracao;
    }

    public void setTaxaAdministracao(double taxaAdministracao) {
        this.taxaAdministracao = taxaAdministracao;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("Taxa de Asministração: %.2f%\n", getTaxaAdministracao());
        System.out.println();
    }

    public void mostrarDados(boolean considerarTaxa){
        mostrarDados();
        if (considerarTaxa){
            System.out.println("Qual a projeção de rendimento mensal em %? ");
            double pm = sc.nextDouble();
            double sb = getSaldo() + (getSaldo() * pm /100);
            double rb = sb - getSaldo();
            double ta = rb * (getTaxaAdministracao() / 100);
            double sl = sb - ta;
            System.out.printf("Saldo líquido: R$ %.2f\n", sl);
        }
    }
}
