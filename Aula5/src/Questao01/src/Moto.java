public class Moto extends Veiculo{

    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "|-----------------DESCRIÇÃO DO VEÍCULO-----------------|" + "\n" +
                "|Marca: " + getMarca()  + "|" + "\n" +
                "|Modelo: "+ getModelo() + "|" + "\n" +
                "|Ano de fabricação: "+ getAnoFabricacao() + "|" + "\n" +
                "|Quantidade de cilíndradas: " + cilindradas + " cc" +"|";
    }
}
