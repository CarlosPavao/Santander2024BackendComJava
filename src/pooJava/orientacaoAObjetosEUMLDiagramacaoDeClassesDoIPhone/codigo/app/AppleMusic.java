package pooJava.orientacaoAObjetosEUMLDiagramacaoDeClassesDoIPhone.codigo.app;


import pooJava.orientacaoAObjetosEUMLDiagramacaoDeClassesDoIPhone.codigo.funcionalidades.reprodutorMusical;

public class AppleMusic implements reprodutorMusical {

    final String APP = "Apple Music";
    String nomeMusica;
    String tempoMusica;
    String cantor;
    String estilo;
    String anoLancamento;

    public AppleMusic(String nomeMusica, String tempoMusica, String cantor, String estilo, String anoLancamento) {
        this.nomeMusica = nomeMusica;
        this.tempoMusica = tempoMusica;
        this.cantor = cantor;
        this.estilo = estilo;
        this.anoLancamento = anoLancamento;
    }


    @Override
    public void boasVindas(int opcao) {
        System.out.printf("""
                                Bem vindo(a) ao "%s
                =================================================
                |           O Que você deseja fazer?            |
                |                                               |
                |              [1] - PLAY MUSICA                |
                |              [2] - STOP MUSICA                |
                |             [3] - SELECIONAR MUSICA           |
                |                 [0] - SAIR                    |
                =================================================
                """, APP);
    }

    @Override
    public void playMusic() {
        System.out.println("Reproduzindo musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selectorMusic(String nomeMusica) {
        System.out.println("Você selecionou a seguinte musica: "+ nomeMusica);

    }


}
