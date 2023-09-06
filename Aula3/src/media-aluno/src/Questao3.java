import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {

        media m = new media();
        try (Scanner sc = new Scanner(System.in)) {
            double n1, n2, n3;
            System.out.println("Digite sua primeira nota: ");
            n1 = sc.nextDouble();
            System.out.println("Digite sua segunda nota: ");
            n2 = sc.nextDouble();
            System.out.println("Digite sua terceira nota: ");
            n3 = sc.nextDouble();

            System.out.printf("A média do aluno é: %.1f %n ", m.calculo(n1, n2, n3));

        }

    }
}