package celular;

import app.AppleMusic;
import app.Safari;
import funcionalidades.aparelhoTelefonico;

public class Iphone implements aparelhoTelefonico {
    final String OLA = "IPHONE";
    final String FABRICANTE = "APPLE";
    String modelo, numero, mynumber;
    int ano;

    public Iphone(String modelo, String mynumber, int ano) {
        this.modelo = modelo;
        this.mynumber = mynumber;
        this.ano = ano;
    }

    @Override
    public void iniciando(String OLA) {
        System.out.println("Bem vindo ao "+OLA);
    }

    @Override
    public void ligar(int numero) {
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

    Safari safari = new Safari();
    AppleMusic appleMusic = new AppleMusic();
}
