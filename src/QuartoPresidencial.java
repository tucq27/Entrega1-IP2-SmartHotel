class QuartoPresidencial extends Quarto {

    public QuartoPresidencial(String id, int andar, int capacidade, Frigobar frigobar) {
        super(id, andar, capacidade, frigobar);
        this.multTaxa = 5;
    }

}
