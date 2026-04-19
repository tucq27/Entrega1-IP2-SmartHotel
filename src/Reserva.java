import java.time.LocalDateTime;

public class Reserva extends Hospedagem {

    private LocalDateTime horarioDaReserva;

    public Reserva(LocalDateTime horarioDaReserva) {
        super();
        this.horarioDaReserva = horarioDaReserva;
    }

    public boolean verificarHospede() {

    }
}
