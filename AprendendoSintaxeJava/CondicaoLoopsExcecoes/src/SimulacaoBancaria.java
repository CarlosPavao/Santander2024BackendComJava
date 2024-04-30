import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {
            int opcao = scanner.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            switch (opcao) {
                case 1: //DEPOSITAR
                    double saldoProv = scanner.nextDouble();
                    saldo += saldoProv;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2: // SACAR
                    double saldoRetirada = scanner.nextDouble();
                    if (saldoRetirada <= saldo) {
                        saldo -= saldoRetirada;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }

                    break;
                case 3: // CONSULTAR SALDO
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");

                    return;

                default:// Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
  /*
    // Declaração da variável global scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double saldo = 0;

            // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {
            int opcao = menu();



            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            switch (opcao) {
                case 1: //DEPOSITAR
                    double saldoProv = scanner.nextDouble();
                    saldo += saldoProv;
                    break;
                case 2: // SACAR
                    double saldoRetirada = scanner.nextDouble();
                    if( saldoRetirada <= saldo){
                        saldo -= saldoRetirada;
                    }else {
                        System.out.println("Saldo insuficiente.");
                    }

                    break;
                case 3: // CONSULTAR SALDO
                    System.out.println("Saldo atual: "+saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");

                    return;

                default:// Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                     System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    static int menu(){
        int opcao = -1;
        System.out.println("\n                  ===============================");
        System.out.println("                  |      [1] - DEPOSITAR        |");
        System.out.println("                  |      [2] - SACAR            |");
        System.out.println("                  |      [3] - CONSULTAR SALDO  |");
        System.out.println("                  |      [4] - ENCERRAR         |");
        System.out.println("                  ===============================\n");
        System.out.println("Digite a opção desejada:");
        opcao = scanner.nextInt();

        return opcao;
    }
}
*/