import java.util.Scanner;
class Exercicio3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota = myObj.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = myObj.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = myObj.nextDouble();

        double media = nota + nota2 + nota3;

        if (media >= 21) {
            System.out.println("Você foi aprovado, sua média foi: " + media / 3);
        }
        else if (media < 21){
            System.out.println("Você foi reprovado, sua média foi: " + media / 3);
        }
    }
}
