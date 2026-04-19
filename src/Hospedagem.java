import java.time.LocalDateTime;

public class Hospedagem {

    private String id;
    private static int definirId = 0; 
    private LocalDateTime horarioChegada; //horario do CheckIn
    private LocalDateTime horarioSaida; //horario do CheckOut
    private int periodoDeEstadia; // calcula em horas a diferença entre os horários do CheckIn e CheckOut, para calcular o periodo total da hospedagem
    //private Responsavel responsavel;
    //private ArrayList<Hospede> hospedes;
    //private Quarto quarto;

    // É necessário um repositório de quartos pra checar quais estão disponíveis

    // Construtor vazio, usado na subclasse Reserva, já que ela não pede o horario de chegada dos hospedes
    protected Hospedagem() {
        definirId++;
        this.id = String.valueOf(definirId);
    }

    // Construtor: horarioChegada, responsavel, hospedes, quarto
    public Hospedagem(LocalDateTime horarioChegada) {
        definirId++;
        this.id = String.valueOf(definirId);

        this.horarioChegada = horarioChegada;
    }

    // Getters
    public String getId() {
        return id;
    }

    public LocalDateTime getHorarioChegada() {
        return horarioChegada;
    }

    public LocalDateTime getHorarioSaida() {
        return horarioSaida;
    }

    public int getPeriodoDeEstadia() {
        return periodoDeEstadia;
    }
}
