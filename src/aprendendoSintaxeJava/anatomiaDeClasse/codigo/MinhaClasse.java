package aprendendoSintaxeJava.anatomiaDeClasse.codigo;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá Turma, Sejam todos bem-vindos");

        //Variáveis MAIUSCULAS entedemos como final não pode ser alteradas
        final String BR = "Brasil";
        // só é possivel nomear variaveis com letras e com _ e $ de outras formas não será permitido

        //exemplos de variavel bem definida e clara

        String meuNome = "Carlos";
        int anoFabricacao = 2024;

        boolean verdadeira = true;

        String nomeCompleto = nomeCompleto("Carlos", "Pavão");

        System.out.println(nomeCompleto);



    }

    public  static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " +primeiroNome.concat(" ").concat(segundoNome);
    }
}
