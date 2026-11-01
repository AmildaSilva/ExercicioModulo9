public class Tabuada {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int opcao;
        do {


            System.out.println("      SISTEMA DE TABUADA");

            System.out.print("\nDigite um numero para ver a tabuada: ");
            int numero = scanner.nextInt();
            System.out.println("\n Tabuada do " + numero);
            int i = 1;
            while (i <= 10) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                i++;
            }

            System.out.println("\n");
            System.out.println("O que deseja fazer agora?");
            System.out.println("1 - Continuar (nova tabuada)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
        } while (opcao != 0);

        System.out.println("\nPrograma encerrado. Ate logo!");
        scanner.close();
    }


}
