abstract class Quarto {

    protected String id;
    protected int andar;
    protected boolean limpo = true;
    protected boolean livre = true;
    protected double multTaxa; //Multiplicador de taxa de acordo com o tipo de quarto
    protected static double multTemporada;
    protected int capacidade;

    protected Hospedagem hospedagem;
    protected Frigobar frigobar;
    // Talvez devêssemos inicializar o frigobar por aqui

    public Quarto(String id, int andar, int capacidade, Frigobar frigobar) {
        this.id = id;
        this.andar = andar;
        this.capacidade = capacidade;
        this.frigobar = frigobar;
        // por padrao, o quarto é limpo e livre, entao não precisa passar isso no construtor
    }

    // Getters
    public String getId() {
        return id;
    }
    public int getAndar() {
        return andar;
    }
    public boolean isLimpo() {
        return limpo;
    }
    public boolean isLivre() {
        return livre;
    }
    public double getMultTaxa() {
        return multTaxa;
    }
    public static double getMultTemporada() {
        return multTemporada;
    }
    public int getCapacidade() {
        return capacidade;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    // Setters
    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }
    public void setLivre(boolean livre) {
        this.livre = livre;
    }
    public void setMultTaxa(double multTaxa) {
        this.multTaxa = multTaxa;
    }
    public static void setMultTemporada(double multTemporada) {
        Quarto.multTemporada = multTemporada;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

}   
