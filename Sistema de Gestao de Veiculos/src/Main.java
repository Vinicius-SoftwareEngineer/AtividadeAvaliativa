import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        boolean menu = true;
        while(menu){
            System.out.println("Sistema de Gestão de Veículos");
            System.out.println("1 - Cadastrar Veículos");
            System.out.println("2 - Vizualizar Veículos");
            System.out.println("0 - Sair");
            System.out.println("Opção: ");
            int opcao = sc.nextInt();
            if (opcao == 1) {
                cVeiculos(sc, veiculos);
            } else if (opcao == 2) {
                vVeiculos(veiculos);
            } else if (opcao == 0) {
                menu = false;
            } else {
                System.out.println("Opção inválida");
            }
        } sc.close();
    }
    public static void cVeiculos(Scanner sc, ArrayList<Veiculo> veiculos) {
        System.out.println("Cadastro de Veículos");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.println("3 - Caminhão");
        System.out.println("0 - Voltar ao menu");
        System.out.println("Opção:");
        int opcao = sc.nextInt();
        sc.nextLine();

        if (opcao == 0){
            return;
        }

        System.out.println("Placa: ");
        String placa = sc.nextLine();
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Preço: ");
        double preco = sc.nextDouble();
        sc.nextLine();

        if (opcao == 1){
            System.out.println("Número de portas: ");
            int portas = sc.nextInt();
            sc.nextLine();
            veiculos.add(new Carro(placa, marca, preco, portas));
            System.out.println("Cadastrado");
        } else if (opcao == 2){
            System.out.println("Cilindradas: ");
            int cilindradas = sc.nextInt();
            sc.nextLine();
            veiculos.add(new Moto(placa, marca, preco, cilindradas));
            System.out.println("Cadastrado");
        } else if (opcao == 3){
            System.out.println("Capacidade de carga: ");
            double carga = sc.nextDouble();
            sc.nextLine();
            veiculos.add(new Caminhao(placa, marca, preco, carga));
            System.out.println("Cadastrado");
        } else {
            System.out.println("Opção inválida");
        }

    }

    public static void vVeiculos(ArrayList<Veiculo> veiculos) {
        System.out.println("Veículos cadastrados");
        if (veiculos.isEmpty()){
            System.out.println("Nenhum veículo cadastrado");
        } else {
            for (Veiculo v : veiculos) {
                v.mostrarDados();
            }
        }
    }
}