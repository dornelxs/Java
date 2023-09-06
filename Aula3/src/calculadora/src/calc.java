public class calc {
    double mult1;
    double sub2;
    double div3;
    double adic4;

    public double calculo(double n1, double n2, double n3) {
        mult1 = n2 * n3;
        sub2 = n2 - n3;
        div3 = n2 / n3;
        adic4 = n2 +n3;

        if (n1 == 1) {
            System.out.println("Operação: " + n2 + " + " + n3);
            return adic4;
        }
        else if (n1 == 2) {
            System.out.println("Operação: " + n2 + " - " + n3);
            return sub2;
        } else if (n1 == 3) {
            System.out.println("Operação: " + n2 + " / " + n3);
            return div3;
        } else if (n1 == 4) {
            System.out.println("Operação: " + n2 + " * " + n3);
            return mult1;
        }
        return adic4;
    }
}
