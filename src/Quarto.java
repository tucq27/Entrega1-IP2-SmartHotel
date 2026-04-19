abstract class Quarto {

    protected String id;
    protected int andar;
    protected boolean limpo;
    protected boolean livre;
    protected double multTaxa; //Multiplicador
    protected static double multTemporada;

    public double calcularTarifa() {
        return 100*multTaxa*multTemporada;
    }
}
