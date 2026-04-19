import java.time.LocalDateTime;

public class Reserva extends Hospedagem {

    private LocalDateTime horarioDaReserva;

    // Construtor: horarioDaReserva, responsavel, hospedes, quarto
    public Reserva(LocalDateTime horarioDaReserva) {
        super();
        this.horarioDaReserva = horarioDaReserva;
    }

    // metodo para verificar se o hospede realmente é quem diz ser, para evitar fraudes
    public boolean verificarHospede() {
        // precisa da Classe Hospede 
        return false; // por enquanto só retorna false, porque o metodo não possui corpo
    }

    // Getters
    public LocalDateTime getHorarioDaReserva() {
        return horarioDaReserva;
    }
    
    // Setters
    // Pode ser necessário caso algum hospede deseje alterar o horario da reserva
    public void setHorarioDaReserva(LocalDateTime horarioDaReserva) {
        this.horarioDaReserva = horarioDaReserva;
    }
}
