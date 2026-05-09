class QuartoSuite extends Quarto {

    public QuartoSuite(String id, int andar, int capacidade, Frigobar frigobar) {
        super(id, andar, capacidade, frigobar);
        this.multTaxa = 2;
    }
}
