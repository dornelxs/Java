import java.util.Scanner;
public class CalcMain {
    public static void main(String[] args) {

        calc c = new calc();
        try (Scanner sc = new Scanner(System.in)) {
            double n1, n2, n3;
            int r;
            do {
                System.out.println("------------------------------\n" + "\t\tCALCULADORA" + "\n------------------------------" +
                        "\n\tEscolha a operação:" + "\n\t 1 - Adição\n\t 2 - Subtração\n\t " +
                        "3 - Divisão\n\t 4 - Multiplicação" + "\n------------------------------");
                n1 = sc.nextDouble();
                System.out.println("Digite o primeiro número: ");
                n2 = sc.nextDouble();
                System.out.println("Digite o segundo número: ");
                n3 = sc.nextDouble();


                System.out.println("Resultado: " + c.calculo(n1, n2, n3));

                System.out.println("------------------------------------------------------------\n" +
                        "Para ver novamente, digite 0");
                r = sc.nextInt();
            } while (r == 0);
        }
    }
}