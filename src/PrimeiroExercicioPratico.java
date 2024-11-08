public class PrimeiroExercicioPratico {
    public static void main(String[] args) {
        // Crie um programa que realize a média de duas notas decimais e exiba o resultado
        double nota1 = 8.5;
        double nota2 = 7.4;
        double media = (nota1 + nota2) / 2;

        System.out.println("Esse é o resultado da média: " + media);

        // Faça o casting da variável double para int e imprima o resultado
        double numeroDouble = 15.7;
        int numeroInteiro = (int) numeroDouble;

        System.out.println("Casting de double para int: " + numeroInteiro);

        // Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem
        char variavelChar = 'T';
        String variavelString = "este";

        System.out.println(variavelChar + variavelString);

        // Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade)
        double precoProduto = 5.5;
        int quantidade = 20;
        int valorTotal = (int) (precoProduto * quantidade);

        System.out.println("O valor total é: " + valorTotal);

        // Realize a conversão do valor em dólares para reais e imprima o resultado formatado
        double valorEmDolares = 5.1;
        double valorDoDolarEmReais = 4.94;
        int conversaoEmReais = (int) (valorEmDolares * valorDoDolarEmReais);

        System.out.println(valorEmDolares + " dólares equivale a " + conversaoEmReais + " reais");

        // Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto
        double precoOriginal = 22.5;
        double percentualDesconto = 15;
        double valorDesconto = (percentualDesconto / 100) * precoOriginal;
        double precoFinal = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + precoFinal);
    }
}
