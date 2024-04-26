import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: conhecer e importar a classe Scanner
        int nroConta;
        String agencia, nomeCliente;
        double saldo;
        System.out.println("Qual seu nome: ");
        Scanner entrada = new Scanner(System.in);
        nomeCliente = entrada.nextLine();


        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("Olá, " +nomeCliente+ "! Bem vindo ao Banco Pavão!");
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
        //Exibir as mensagens para o nosso usuario.
        System.out.println("Por favor, digite o número da Agência:");
        entrada = new Scanner(System.in);
        agencia = entrada.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        entrada = new Scanner(System.in);
        nroConta = entrada.nextInt();

        System.out.println("Por favor, digite o Saldo:");
        entrada = new Scanner(System.in);
        saldo = entrada.nextDouble();
        //obter pela classe Scanner os valores digitados no terminal

        //exibir a mensagem final


        System.out.println("""
                Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está 
                disponível para saque
                """.formatted(nomeCliente,agencia, nroConta, saldo));

    }
}