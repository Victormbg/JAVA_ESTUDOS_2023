package ConstrutoresThisSobrecargaEncapsulamento.entities;

public class Produto {
    private String nome;       // Declaração do atributo privado "nome" que armazena o nome do produto.
    private double preco;      // Declaração do atributo privado "preco" que armazena o preço do produto.
    private int quantidade;    // Declaração do atributo privado "quantidade" que armazena a quantidade de produtos em estoque.

    // Construtor padrão (sem argumentos) da classe Produto.
    public Produto() {
    }

    // Construtor com três argumentos: nome, preço e quantidade.
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;     // Atribui o nome passado como argumento ao atributo "nome".
        this.preco = preco;   // Atribui o preço passado como argumento ao atributo "preco".
        this.quantidade = quantidade;  // Atribui a quantidade passada como argumento ao atributo "quantidade".
    }

    // Construtor com dois argumentos: nome e preço.
    public Produto(String nome, double preco) {
        this.nome = nome;     // Atribui o nome passado como argumento ao atributo "nome".
        this.preco = preco;   // Atribui o preço passado como argumento ao atributo "preco".
    }

    public String getName() {
        return nome;  // Retorna o nome do produto.
    }

    public void setName(String nome) {
        this.nome = nome;  // Define o nome do produto com o valor passado como argumento.
    }

    public double getPrice() {
        return preco;  // Retorna o preço do produto.
    }

    public void setPrice(double preco) {
        this.preco = preco;  // Define o preço do produto com o valor passado como argumento.
    }

    public int getQuantity() {
        return quantidade;  // Retorna a quantidade de produtos em estoque.
    }

    // Método que calcula o valor total em estoque multiplicando o preço pela quantidade.
    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    // Método para adicionar produtos ao estoque, atualizando a quantidade.
    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    // Método para remover produtos do estoque, atualizando a quantidade.
    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    // Método que gera uma representação em forma de String do objeto Produto.
    @Override
    public String toString() {
        return nome
                + ", R$ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: R$ "
                + String.format("%.2f", valorTotalEmEstoque());
    }
}
