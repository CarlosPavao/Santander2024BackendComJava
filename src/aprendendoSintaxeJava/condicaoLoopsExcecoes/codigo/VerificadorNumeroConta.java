package aprendendoSintaxeJava.condicaoLoopsExcecoes.codigo;

import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String conta;

    // TODO: Inicialize um bloco try-catch para capturar exceções:
        try {
            // TODO: Leia a entrada do usuário como uma string representando o número da conta:
            conta = scanner.nextLine();

            // TODO: Chame o método verificarNumeroConta, passando o número da conta como argumento:
            verificarNumeroConta(conta);
            System.out.println("Numero de conta valido.");
            // Bloco de código onde a exceção pode ocorrer
        } catch (IllegalArgumentException  e) {
            // Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
            System.out.println("Erro: " + e.getMessage());
        } finally {
        scanner.close();
        }
    }

// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) {
        // TODO: Verifique se o número da conta tem exatamente 8 digitos:
        if(numeroConta.length() != 8){
            // TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}