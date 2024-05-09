package celular;

import app.AppleMusic;
import app.Safari;
import funcionalidades.aparelhoTelefonico;

public class Iphone implements aparelhoTelefonico{

    final String OLA = "IPHONE";
    final String FABRICANTE = "APPLE";
    String modelo, numero, mynumber;
    int ano;

    private Safari safari;
    private AppleMusic appleMusic;

    public Iphone(String modelo, String mynumber, int ano) {
        this.modelo = modelo;
        this.mynumber = mynumber;
        this.ano = ano;
        this.safari = new Safari();
    }

    public void menu(int opcao){
        iniciando(OLA);
        System.out.printf("""
                =================================================
                |           O Que você deseja fazer?            |
                |                                               |
                |                 [1] - LIGAÇÃO                 |
                |             [2] - ATENDER LIGAÇÃO             |
                |             [3] - ENCERRAR LIGAÇÃO            |
                |               [4] - CORREIO DE VOZ            |
                |                   [5] - SAFARI                |
                |               [6] - APPLE MUSIC               |
                |         [7] - INFORMAÇÕES DO DISPOSITIVO      |
                |                 [0] - SAIR                    |
                =================================================
                """);
    }
    @Override
    public void iniciando(String OLA) {
        System.out.println("Bem vindo ao "+OLA);
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("""
                Você está lingando para o número: %s
                """, numero);

    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida!");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");

    }

    @Override
    public void encerrarLigacao() {
        System.out.println("Encerrando ligação!");
    }

    @Override
    public void information() {
        System.out.printf("""
                =========================================
                |       Informações do dispositivo:     |    
                |             Fabricante:%s             |
                |               Modelo: %s              |
                |         Ano de Lançamento: %d         |
                |             Seu número: %s            |
                =========================================
                """, FABRICANTE, modelo, ano, mynumber);
    }

    public void menuSafari(int opcao){
        safari.menu(opcao);
    }
    public void navegadorViewPage(String url){
        safari.viewPage(url);
    }
    public void navegadorNewPage(){
        safari.newPage();
    }
    public void navegadorRefreshPage(){
        safari.refreshPage();
    }
    public void navegadorInformatio(){
        safari.informationApp("SAFARI", "APPLE", 22.02 );
    }

    public void appleBoasVindas(int opcao){
        appleMusic.boasVindas(opcao);
    }

    public void appleSelectorMusic(String music){
        appleMusic.selectorMusic(music);
    }
    public void appleStopMusic(){
        appleMusic.stopMusic();
    }
    public void applePlayMusic(){
        appleMusic.playMusic();
    }

}
