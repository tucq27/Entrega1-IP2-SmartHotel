import java.time.LocalDateTime;

public class Hospedagem {

    private String id;
    private static int definirId = 0;
    private LocalDateTime horarioChegada; //CheckIn
    private LocalDateTime horarioSaida; //CheckOut
    private int periodoDeEstadia;

    //private Responsavel responsavel;
    //private ArrayList<Hospede> hospedes;
    //private Quarto quarto;

    // É necessário um repositório de quartos pra checar quais estão disponíveis

    protected Hospedagem() {
        definirId++;
        this.id = String.valueOf(definirId);
    }

    public Hospedagem(LocalDateTime horarioChegada) {
        definirId++;
        this.id = String.valueOf(definirId);

        this.horarioChegada = horarioChegada;
    }
}
