public class ConversaoDeTipos {
    public static void main(String[] args) {
        //Conversão Explícita (Casting)
        double numeroDecimal = 3.14;
        int numeroInteiro = (int) numeroDecimal; // Conversão Explícita de double para int

        System.out.println("\nAntes do casting: " + numeroDecimal);
        System.out.println("Depois do casting: " + numeroInteiro);

        //Conversão Implícita
        int numberInteiro = 5;
        double numberDecimal = 2.5;

        double resultado = numberInteiro * numberDecimal; // Conversão implícita de int para double

        System.out.println("\nResultado da operação: " + resultado);
    }
}
