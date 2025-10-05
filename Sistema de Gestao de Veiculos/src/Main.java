import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> lista = new ArrayList<>();
        boolean menu = true;

        while (menu) {
            System.out.println("Menu Principal");
            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Listar Veículos");
            System.out.println("0 - Sair");
            System.out.print("Escolha a opção: ");
            String op = sc.nextLine();

            switch (op) {
                case "1":
                    System.out.println("Cadastro de Veículo");
                    System.out.println("Escolha o tipo de veículo:");
                    System.out.println("1 - Carro");
                    System.out.println("2 - Moto");
                    System.out.println("3 - Caminhão");
                    System.out.println("0 - Voltar");
                    System.out.print("Opção: ");
                    String tipo = sc.nextLine();
                    switch (tipo) {
                        case "0":
                            break;
                        case "1":
                            System.out.print("Placa: ");
                            String p1 = sc.nextLine();
                            System.out.print("Marca: ");
                            String m1 = sc.nextLine();
                            System.out.print("Preço: ");
                            double preco1 = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Número de portas: ");
                            int portas = sc.nextInt();
                            sc.nextLine();
                            lista.add(new Carro(p1, m1, preco1, portas));
                            System.out.println("Carro cadastrado!");
                            break;
                        case "2":
                            System.out.print("Placa: ");
                            String p2 = sc.nextLine();
                            System.out.print("Marca: ");
                            String m2 = sc.nextLine();
                            System.out.print("Preço: ");
                            double preco2 = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Cilindradas: ");
                            int cil = sc.nextInt();
                            sc.nextLine();
                            lista.add(new Moto(p2, m2, preco2, cil));
                            System.out.println("Moto cadastrada!");
                            break;
                        case "3":
                            System.out.print("Placa: ");
                            String p3 = sc.nextLine();
                            System.out.print("Marca: ");
                            String m3 = sc.nextLine();
                            System.out.print("Preço: ");
                            double preco3 = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Capacidade em toneladas: ");
                            double c = sc.nextDouble();
                            sc.nextLine();
                            lista.add(new Caminhao(p3, m3, preco3, c));
                            System.out.println("Caminhão cadastrado!");
                            break;
                        default:
                            System.out.println("Tipo inválido!");
                    }
                    break;

                case "2":
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum veículo cadastrado ainda.");
                    } else {
                        int i = 1;
                        for (Veiculo v : lista) {
                            System.out.println("\nVeículo " + i);

                            System.out.print("Deseja aplicar desconto? (S/N): ");
                            String respDesc = sc.nextLine();
                            if (respDesc.equalsIgnoreCase("S")) {
                                System.out.print("Informe o percentual de desconto: ");
                                double desc = sc.nextDouble();
                                sc.nextLine();
                                v.mostrarDados(desc);
                            } else {
                                v.mostrarDados();
                            }
                            switch (v.getClass().getSimpleName()) {
                                case "Carro":
                                    System.out.print("Deseja ver o número de portas? (S/N): ");
                                    String resp1 = sc.nextLine();
                                    ((Carro) v).mostrarDados(resp1.equalsIgnoreCase("S"));
                                    break;
                                case "Moto":
                                    System.out.print("Deseja ver as cilindradas? (S/N): ");
                                    String resp2 = sc.nextLine();
                                    ((Moto) v).mostrarDados(resp2.equalsIgnoreCase("S"));
                                    break;
                                case "Caminhao":
                                    System.out.print("Deseja ver a capacidade em kg? (S/N): ");
                                    String resp3 = sc.nextLine();
                                    ((Caminhao) v).mostrarDados(resp3.equalsIgnoreCase("S"));
                                    break;
                            }
                            i++;
                        }
                    }
                    break;
                case "0":
                    menu = false;
                    System.out.println("Encerrando o sistema. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}