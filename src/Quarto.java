abstract class Quarto {

    protected String id;
    protected int andar;
    protected boolean limpo = true;
    protected boolean livre = true;
    protected double multTaxa; //Multiplicador
    protected static double multTemporada;
    protected int capacidade;

    protected Hospedagem hospedagem;

    public Quarto(String id, int andar, int capacidade) {
        this.id = id;
        this.andar = andar;
        this.capacidade = capacidade;
    }

    public double calcularTarifa() { // É bom fazer isso com todos os custos do frigobar e serviços também
    //A gente pode talvez fazer um "calcularRecibo()" sei lá
        return 100*multTaxa*multTemporada;
    }
}
