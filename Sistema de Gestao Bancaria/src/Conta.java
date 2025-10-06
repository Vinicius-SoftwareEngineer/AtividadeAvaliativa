public class Conta {
    private String numero;
    private String titular;
    private double saldo;

    public Conta(String numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarDados(){
        System.out.println("Número da conta: " + getNumero());
        System.out.println("Nome do titular: " + getTitular());
        System.out.printf("Saldo: R$ %.2f\n", getSaldo());
    }

    public void mostrarDados(double projecaoMensal){
        mostrarDados();
        double saldoP = (getSaldo() +(getSaldo() * projecaoMensal / 100));
        System.out.printf("Saldo projetado para o próximo mês: R$ %.2f\n", saldoP);
    }
}
