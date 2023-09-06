public class media {
    double mediac;

    public double calculo(double n1, double n2, double n3){
        mediac = (n1 + n2 + n3) / 3;

        if (mediac >= 7) {
            System.out.println("O aluno foi aprovado!");
        } else if (mediac < 7) {
            System.out.println("O aluno foi reprovado!");
        }
        return mediac;
    }
}
