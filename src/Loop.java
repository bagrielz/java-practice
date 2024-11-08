import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        /* O for loop recebe a variável que inicia o loop (int i = 0),
        em seguida, o número de vezes que será realizado (i < 3) o loop e
        de quanto em quanto será incrementado/adicionado (i++)
         */
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a sua avaliação de 1 à 10");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média das avaliações: " + mediaAvaliacao / 3);
    }
}
