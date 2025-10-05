public class Carro extends Veiculo {
    private int nPortas;

    public Carro(String placa, String marca, double preco, int nPortas){
        super(placa, marca, preco);
        this.nPortas = nPortas;
    }

    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de portas: " + nPortas);
        System.out.println();
    }

    public void mostrarDados(boolean mPortas){
        super.mostrarDados();
        if (mPortas){
            System.out.println("Número de portas: " + nPortas);
        }
        System.out.println();
    }
}
