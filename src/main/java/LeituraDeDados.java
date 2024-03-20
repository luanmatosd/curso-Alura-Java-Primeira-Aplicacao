import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = leitura.nextInt();

        System.out.println("Digite seu peso: ");
        double peso = leitura.nextDouble();

        System.out.println("Olá eu sou o(a) " + nome + " e tenho " +
                idade + " anos!" + " e peso " + peso + " kg!");
    }
}
