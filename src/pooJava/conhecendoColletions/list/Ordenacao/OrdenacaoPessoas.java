package pooJava.conhecendoColletions.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> idadeOrdenada = new ArrayList<>(listaPessoas);
        if (!listaPessoas.isEmpty()) {
            Collections.sort(idadeOrdenada);
            return idadeOrdenada;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> alturaOrdenada = new ArrayList<>(listaPessoas);
        if (!listaPessoas.isEmpty()) {
            Collections.sort(alturaOrdenada, new ComparatorPorAltura());
            return alturaOrdenada;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();


        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println(ordenacaoPessoas.listaPessoas);

        // Ordenando e exibindo por idade
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
