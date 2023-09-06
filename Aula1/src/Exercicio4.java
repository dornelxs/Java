import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Digite o seu salário mensal: ");
        double salario = myObj.nextDouble();

        if (salario <= 900){
            System.out.println("Você é isento de descontos.");
        }

        else if (salario >= 901 &&  salario <= 1500){
            System.out.println("Você tem 5% de desconto, salário com desconto de IRPF: "
                    +  (salario - (5 * salario / 100)));
        }

        else if (salario >= 1501 &&  salario <= 2500){
            System.out.println("Você tem 10% de desconto, salário com desconto de IRPF: "
                    +  (salario - (10 * salario / 100)));
        }

        else if (salario > 2500){
            System.out.println("Você tem 20% de desconto, salário com desconto de IRPF: "
                    +  (salario - (20 * salario / 100)));
        }
    }
}
