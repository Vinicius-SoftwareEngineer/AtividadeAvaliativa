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
        System.out.println("Cilindradas: " + cilindradas);
    }

    public void mostrarDados(boolean cavalos){
        if (cavalos){
            double cv = cilindradas / 15.0;
            super.mostrarDados();
            System.out.printf("Potência: %.2f cv\n", cv);
        } else {
            mostrarDados();
        }
    }
}
