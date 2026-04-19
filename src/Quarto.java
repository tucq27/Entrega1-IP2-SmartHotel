abstract class Quarto {

    protected String id;
    protected int andar;
    protected boolean limpo = true;
    protected boolean livre = true;
    protected double multTaxa; //Multiplicador de taxa de acordo com o tipo de quarto
    protected static double multTemporada;
    protected int capacidade;

    protected Hospedagem hospedagem;

    public Quarto(String id, int andar, int capacidade) {
        this.id = id;
        this.andar = andar;
        this.capacidade = capacidade;
        // por padrao, o quarto é limpo e livre, entao não precisa passar isso no construtor
    }

}
