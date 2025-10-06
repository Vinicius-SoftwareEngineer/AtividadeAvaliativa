public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, String titular, double saldo, double limiteChequeEspecial){
        super(numero, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("Limite do cheque especial: R$ %.2f\n", getLimiteChequeEspecial());
        System.out.println();
    }

    public void mostrarDados(boolean detalharLimite){
        super.mostrarDados();
        if (detalharLimite){
            double ld = getSaldo() + getLimiteChequeEspecial();
            System.out.printf("Limite detalhado(Saldo + Limite): R$ %.2f\n", ld);
        }
        System.out.println();
    }
}