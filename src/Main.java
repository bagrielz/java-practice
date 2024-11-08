public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme - Top Gun: Maverick");

        // Variáveis (tipos primitivos)
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        int classificacao;
        String sinopse = "Filme de aventura com galã dos anos 80.";

        // Casting (conversão de tipos)
        // A variável 'classificacao' foi tipada como int e está recebendo um float que é o valor da variável 'media'
        // Casting explícito
        classificacao = (int) (media / 2);

        System.out.println(sinopse);
        System.out.println(classificacao);
    }
}