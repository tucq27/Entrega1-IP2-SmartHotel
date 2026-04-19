import java.time.LocalDateTime;

public class Item {

    private String nome;
    private LocalDateTime validade;
    private double valor;

    public Item(String nome, LocalDateTime validade, double valor) {
        this.nome = nome;
        this.validade = validade;
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public LocalDateTime getValidade() {
        return this.validade;
    }

    public String getNome() {
        return this.nome;
    }
}
