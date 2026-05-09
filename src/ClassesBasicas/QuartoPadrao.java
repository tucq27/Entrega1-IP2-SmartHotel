class QuartoPadrao extends Quarto {

    public QuartoPadrao(String id, int andar, int capacidade, Frigobar frigobar) {
        super(id, andar, capacidade, frigobar);
        this.multTaxa = 1;
    }
}
