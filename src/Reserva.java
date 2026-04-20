import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reserva extends Hospedagem {

    private LocalDateTime horarioDaReserva;

    public Reserva(LocalDateTime horarioDaReserva,
                   Responsavel responsavel,
                   ArrayList<Hospede> hospedes,
                   Quarto quarto) {

        super(); 
        this.horarioDaReserva = horarioDaReserva;

        if (quarto == null || !quarto.isQuartoLivre()) {
            throw new IllegalStateException("Quarto não disponível para reserva!");
        }

        this.setResponsavel(responsavel);
        this.setHospedes(hospedes);
        this.setQuarto(quarto);
    }

    public boolean verificarHospede(String nome, String cpf, int dataNascimento) {
        if (getHospedes() == null) return false;

        for (Hospede h : getHospedes()) {
            if (h.getNome().equals(nome) &&
                h.getCpf().equals(cpf) &&
                h.getDataNascimento() == dataNascimento) {
                return true;
            }
        }
        return false;
    }

    public void confirmarReserva() {
        if (getQuarto() == null) {
            throw new IllegalStateException("Reserva sem quarto!");
        }

        if (!getQuarto().isQuartoLivre()) {
            throw new IllegalStateException("Quarto ocupado!");
        }

        setHorarioChegada(LocalDateTime.now());

        getQuarto().setQuartoLivre(false);

        System.out.println("Reserva confirmada e check-in realizado!");
    }

    public LocalDateTime getHorarioDaReserva() {
        return horarioDaReserva;
    }

    public void setHorarioDaReserva(LocalDateTime horarioDaReserva) {
        this.horarioDaReserva = horarioDaReserva;
    }
}
