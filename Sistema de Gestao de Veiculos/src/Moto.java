public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String placa, String marca, double preco, int cilindradas){
        super(placa, marca, preco);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println();
    }

    public void mostrarDados(boolean eCilindradas){
        super.mostrarDados();
        if (eCilindradas){
            System.out.println("Cilindradas: " + getCilindradas());
        }
        System.out.println();
    }
}
