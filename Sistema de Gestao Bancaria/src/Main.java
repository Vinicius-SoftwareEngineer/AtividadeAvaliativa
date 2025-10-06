import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Conta> lista = new ArrayList<>();
        boolean menu = true;

        while (menu){
            System.out.println("=== Bem-vindo ao Sistema de Gestão do banco VRQ! ===");
            System.out.println("1 - Criar Conta VRQ");
            System.out.println("2 - Listar Contas VRQ");
            System.out.println("0 - Encerrar o sistema");
            System.out.print("Escolha a opção: ");
            String op = sc.nextLine();
            System.out.println();

            switch (op) {
                case "1":
                    System.out.println("=== Cadastro de conta VRQ ===");
                    System.out.println("Escolha o tipo da conta:");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Poupança");
                    System.out.println("3 - Conta Investimento");
                    System.out.println("0 - Voltar");
                    System.out.print("Escolha a opção: ");
                    String tipo = sc.nextLine();
                    System.out.println();
                    switch (tipo){
                        case "0":
                            break;
                        case "1":
                            System.out.print("Número: ");
                            String n1 = sc.nextLine();
                            System.out.print("Titular da conta: ");
                            String t1 = sc.nextLine();
                            System.out.print("Saldo Inicial: ");
                            double s1 = sc.nextDouble();
                            System.out.print("Limite do cheque especial: ");
                            double c1 = sc.nextDouble();
                            lista.add(new ContaCorrente(n1, t1, s1, c1));
                            System.out.println("Conta Corrente VRQ cadastrada!");
                            break;
                        case "2":
                            System.out.print("Número: ");
                            String n2 = sc.nextLine();
                            System.out.print("Titular da conta: ");
                            String t2 = sc.nextLine();
                            System.out.print("Saldo Inicial: ");
                            double s2 = sc.nextDouble();
                            System.out.print("Taxa de rendimento mensal(em %): ");
                            double r1 = sc.nextDouble();
                            lista.add(new ContaPoupanca(n2, t2, s2, r1));
                            System.out.println("Conta Poupança VRQ cadastrada!");
                            break;
                        case "3":
                            System.out.print("Número: ");
                            String n3 = sc.nextLine();
                            System.out.print("Titular da conta: ");
                            String t3 = sc.nextLine();
                            System.out.print("Saldo Inicial: ");
                            double s3 = sc.nextDouble();
                            System.out.print("Taxa de administração(em%): ");
                            double ta1 = sc.nextDouble();
                            System.out.println("Conta Investimento VRQ cadastrada!");
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }
                    System.out.println();
                    break;
                case "2":
                    if (lista.isEmpty()){
                        System.out.println("Nenhuma conta VRQ cadastrada!");
                    } else {
                        int i = 1;
                        for (Conta c: lista){
                            System.out.println("\n Conta " + i);

                            switch (c.getClass().getSimpleName()) {
                                case "Conta Corrente":
                                    System.out.print("Deseja ver o limite detalhado? (S/N): ");
                                    String r1 = sc.nextLine();
                                    ((ContaCorrente) c).mostrarDados(r1.equalsIgnoreCase("S"));
                                    break;
                                case "Conta Poupança":
                                    System.out.print("Deseja ver a taxa de rendimento anual? (S/N)");
                                    String r2 = sc.nextLine();
                                    ((ContaPoupanca) c).mostrarDados(r2.equalsIgnoreCase("S"));
                                    break;
                                case "Conta Investimento":
                                    System.out.print("Deseja ver o saldo líquido? (S/N): ");
                                    String r3 = sc.nextLine();
                                    ((ContaInvestimento) c).mostrarDados(r3.equalsIgnoreCase("S"));
                                    break;
                            }
                            i++;
                        }
                    }
                    System.out.println();
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