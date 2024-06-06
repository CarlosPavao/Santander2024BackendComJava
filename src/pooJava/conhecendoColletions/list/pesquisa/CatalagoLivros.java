package pooJava.conhecendoColletions.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    //Atributo
    private List<Livro> listaLivros;

    public CatalagoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livrosPorTitulo = null;
        if (!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo = l;
                    break;
                }
            }
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalagoLivros catalogoLivros = new CatalagoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println("pesquisar Por Autor");
        // Exibindo livros pelo mesmo autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

        System.out.println("pesquisar Por Autor");
        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

        System.out.println("pesquisar Por Intervalo Anos");
        // Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

        System.out.println("pesquisar Por Intervalo Anos");
        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

        System.out.println("pesquisar Por Titulo");
        // Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

        System.out.println("pesquisar Por Titulo");
        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
    }
}
