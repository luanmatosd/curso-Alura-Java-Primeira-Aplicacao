import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
/*
        Usando for
        Scanner leitura = new Scanner(System.in);

        double mediaAvalicao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota: ");
            nota = leitura.nextDouble();
            mediaAvalicao += nota;
        }

        System.out.println("A média é: " + mediaAvalicao/3);*/

        //Usando While
        Scanner leitura = new Scanner(System.in);

        double mediaAvalicao = 0;
        double nota = 0;
        int contador = 0;

        while (nota != -1) {
            System.out.println("Digite a nota ou -1 para sair: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvalicao += nota;
                contador++;
            }
        }
        System.out.println("A média é: " + mediaAvalicao / contador);
    }
}
