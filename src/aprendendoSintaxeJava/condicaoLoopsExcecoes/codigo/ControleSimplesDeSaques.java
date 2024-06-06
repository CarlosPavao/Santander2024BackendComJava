package aprendendoSintaxeJava.condicaoLoopsExcecoes.codigo;

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        // TODO: Crie um loop 'for' para iterar sobre os saques:
        for (int i = 1; i <= limiteDiario; i++) {
            // TODO: Solicite ao usuário o valor do saque:
            double saque = scanner.nextDouble();
            if (saque == 0){ // TODO: Verifique se o valor do saque é zero, encerrando as transações:
                System.out.println("Transacoes encerradas.");
                break;
            } else if (saque <= limiteDiario) {
                // TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
                limiteDiario = limiteDiario - saque;
                // TODO: Informe que o saque foi realizado e mostre o limite restante:
                System.out.printf("Saque realizado. Limite restante: %.1f\n", limiteDiario);
            } else {
                System.out.print("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }
        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}


