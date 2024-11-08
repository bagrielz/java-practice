import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        // A classe Scanner é utilizada para ler dados de entrada em um programa Java
        // Primeiro, importamos a classe e, em seguida, criamos uma instância dela passando o objeto System.in como parâmetro
        // para indicar que queremos ler a entrada do usuário pelo teclado
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine(); // nextLine() lê uma linha de texto
        System.out.println("Digite o ano de lançamento");
        int anoDeLancamento = leitura.nextInt(); // nextLine() lê uma linha de número inteiro
        System.out.println("Digite a sua avaliação de 1 à 10");
        double avaliacao = leitura.nextDouble(); // nextLine() lê uma linha de número decimal

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
