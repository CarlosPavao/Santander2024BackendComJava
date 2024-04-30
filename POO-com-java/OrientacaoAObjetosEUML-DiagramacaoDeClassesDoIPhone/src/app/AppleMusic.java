package app;
import funcionalidades.reprodutorMusical;

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

    public AppleMusic() {

    }

    @Override
    public void boasVindas(String APP) {
        System.out.println("Bem vindo(a) ao "+ APP);
    }

    @Override
    public void palyMusic() {
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
