package pooJava.conhecendoColletions.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List <Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaAscendente = new ArrayList<>(listaNumeros);
        if (!listaNumeros.isEmpty()){
            Collections.sort(listaAscendente);
            return listaAscendente;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> listaAscendente = new ArrayList<>(listaNumeros);
        if (!listaNumeros.isEmpty()){
            listaAscendente.sort(Collections.reverseOrder());
            return listaAscendente;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirNumeros() {
        if (!listaNumeros.isEmpty()) {
            System.out.println(this.listaNumeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}
