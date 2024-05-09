package app;

import funcionalidades.navegadorDeInternet;

public class Safari implements navegadorDeInternet {
    final String NOME = "Safari";
    final String DESENVOLVEDORA = "Apple";
    final double VERSAO = 2.5;

    @Override
    public void boasVindas() {
        System.out.println("Bem vindo ao " + NOME);

    }

    @Override
    public void viewPage(String url) {
        System.out.println("Você está acesando "+url);

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
    public void informationApp(String nome, String desenvolvora, double versao) {
        System.out.printf("""
                Você está utilizando o seguinte App: 
                Nome: %s
                Desenvolvimento: %s
                Versão: %.2f
                """, NOME, DESENVOLVEDORA, VERSAO);
    }

    public void menu(int opcao){
        boasVindas();
        System.out.printf("""
                =================================================
                |           O Que você deseja fazer?            |
                |                                               |
                |              [1] - ABRIR PÁGINA               |
                |              [2] - NOVA PÁGINA                |
                |             [3] - ATUALIZAR PÁGINA            |
                |         [4] - INFORMAÇÕES DO DISPOSITIVO      |
                |                 [0] - SAIR                    |
                =================================================
                """);
    }

}
