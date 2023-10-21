package classesAtributosMembrosStaticos;

import classesAtributosMembrosStaticos.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProdutos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto product = new Produto();
        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome: ");
        product.nome = sc.nextLine();
        System.out.print("Preço: ");
        product.preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        product.quantidade = sc.nextInt();
        System.out.println();
        System.out.println("Dados do produto: " + product);
        System.out.println();
        System.out.print("Digite o número de produtos a serem adicionados ao estoque: ");
        int quantidade = sc.nextInt();
        product.adicionarProdutos(quantidade);
        System.out.println();
        System.out.println("Dados atualizados: " + product);
        System.out.println();
        System.out.print("Digite o número de produtos a serem removidos do estoque: ");
        quantidade = sc.nextInt();
        product.removerProdutos(quantidade);
        System.out.println();
        System.out.println("Dados atualizados: " + product);
        sc.close();
    }
}
