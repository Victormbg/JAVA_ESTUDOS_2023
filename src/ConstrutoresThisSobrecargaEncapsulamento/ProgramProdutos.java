package ConstrutoresThisSobrecargaEncapsulamento;

import ConstrutoresThisSobrecargaEncapsulamento.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProdutos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = sc.nextInt();
        Produto product = new Produto(nome, preco, quantidade);
        System.out.println();
        System.out.println("Dados do produto: " + product);
        System.out.println();
        System.out.print("Digite o número de produtos a serem adicionados ao estoque: ");
        int quantidadeReal = sc.nextInt();
        product.adicionarProdutos(quantidadeReal);
        System.out.println();
        System.out.println("Dados atualizados: " + product);
        System.out.println();
        System.out.print("Digite o número de produtos a serem removidos do estoque: ");
        quantidadeReal = sc.nextInt();
        product.removerProdutos(quantidadeReal);
        System.out.println();
        System.out.println("Dados atualizados: " + product);
        sc.close();
    }
}
