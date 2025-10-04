public class Caminhao extends Veiculo{
    private double capacidadeCarga;

    public Caminhao(String placa, String marca, double preco, double capacidadeCarga){
        super(placa, marca, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("Capacidade de carga em toneladas: %.2f t\n", capacidadeCarga);
    }

    public void mostrarDados(boolean kg){
        if (kg){
            double ckg = capacidadeCarga *1000;
            super.mostrarDados();
            System.out.printf("Capacidade de carga em quilogramas: %.2f kg\n", ckg);
        }else {
            mostrarDados();
        }
    }
}
