package app;

import funcionalidades.navegadorDeInternet;

public class Safari implements navegadorDeInternet {
    final String NOME = "Safari";
    final String DESENVOLVEDORA = "Apple";
    final double VERSAO = 2.5;
    @Override
    public void boasVindas(String app) {
        System.out.println("Bem vindo ao " + NOME);

    }

    @Override
    public void viewpage() {
        System.out.println("Você está acesando a o Google!");

    }

    @Override
    public void newPage() {
        System.out.println("Abrindo uma nova Pagina!");

    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando pagina!");
    }

    @Override
    public void Informations(String nome, String desenvolvora, double versao) {
        System.out.printf("""
                Você está utilizando o seguinte App: 
                Nome: %s
                Desenvolvimento: %s
                Versão: %.2f
                """, NOME, DESENVOLVEDORA, VERSAO);
    }

}
