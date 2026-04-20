import java.time.LocalDateTime;
import java.time.Duration;
import java.util.ArrayList;

public class Hospedagem {

    private String id;
    private static int definirId = 0; 
    private LocalDateTime horarioChegada; //horario do CheckIn
    private LocalDateTime horarioSaida; //horario do CheckOut
    private Duration periodoDeEstadia; // define, em horas, quanto tempo deve durar a estadia
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

    // deverá haver um metodo que aumenta e um que diminui o periodo de estadia


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

    public Duration getPeriodoDeEstadia() {
        return periodoDeEstadia;
    }

}
