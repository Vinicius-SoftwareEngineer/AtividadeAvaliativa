public class Veiculo {
    private String placa;
    private String marca;
    private double preco;

    public Veiculo(String placa, String marca, double preco){
        this.placa = placa;
        this.marca = marca;
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarDados(){
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println(" ");
    }

    public void mostrarDados(double desconto){
        double d = preco * desconto /100;
        double dPreco = preco - d;
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.printf("Desconto: R$ %.2f\n", d);
        System.out.printf("Preço com desconto: R$ %.2f\n", dPreco);
    }
}
