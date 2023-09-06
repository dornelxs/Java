class Dados {
    private int matricula;
    private String nome;
    private double salarioBruto;

    public Dados(int matricula, String nome, double salarioBruto) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }
    public double calcularINSS() {
        return salarioBruto * 0.15;
    }
    public double calcularSalarioLiquido() {
        return salarioBruto - calcularINSS();
    }
    public void exibirContracheque() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Retenção do INSS (15%): R$ " + calcularINSS());
        System.out.println("Salário Líquido: R$ " + calcularSalarioLiquido());
        System.out.println("-----------------------------------------------------");
    }
}