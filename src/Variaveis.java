// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Variaveis {
    public static void main(String[] args) {
        // Sem quebra de linha ao final:
        System.out.print("Bom dia!");
        // Com quebra de linha ao final:
        System.out.println("Bom dia!");
        //Suponha uma variável tipo double declarada e iniciada:
        double x = 10.35784;
        System.out.println(x);
        // %n = quebra de linha (independente de plataforma)
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        //Para concatenar vários elementos em um mesmo comando de escrita
        System.out.println("RESULTADO = " + x + " METROS");
        // %f = ponto flutuante %n = quebra de linha
        System.out.printf("RESULTADO = %.2f metros%n", x);
        // %f = ponto flutuante %d = inteiro %s = texto %n = quebra de linha
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}