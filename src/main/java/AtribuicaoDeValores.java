public class AtribuicaoDeValores {
    public static void main(String[] args) {
//Operadores de atribuição:
        int valor = 5;
        int valorDois = 10;
        valorDois += 15;

        //Operadores aritméticos:
        int a = 10 + 5;
        int b = 10 - 5;
        int c = 10 * 5;
        int d = 10 / 5;
        int e = 10 % 3;

        //Operadores relacionais:
        int f = 10;
        int g = 5;
        int h = 30;

        boolean igual = (g == f);
        boolean diferente = (g != h);
        boolean maior = (g > f);
        boolean menorIgual = (g <= h);

        //Operadores lógicos
        boolean i = true;
        boolean j = false;
        if (i && j) {
            // Este código não será executado, já que a é verdadeiro e b é falso.
        }

        boolean k = true;
        boolean l = false;
        if (k || l) {
            // Este código será executado, já que a é verdadeiro, mesmo que b seja falso.
        }

        boolean m = true;
        if (!m) {
            // Este código não será executado, já que a é verdadeiro.
        }

        //Operadores de incremento:
        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6

        int numero = 5;
        int resul = numero++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(numero); // imprime 5
        System.out.println(resul); // imprime 6
    }
}
