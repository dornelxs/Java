import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a matrícula: ");
        int matricula = sc.nextInt();

        System.out.print("Informe o nome: ");
        String nome = sc.next();

        System.out.print("Informe o salário bruto: ");
        double salarioBruto = sc.nextDouble();

        Dados funcionario = new Dados(matricula, nome, salarioBruto);
        funcionario.exibirContracheque();

        sc.close();
    }
}
