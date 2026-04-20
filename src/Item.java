import java.time.LocalDate;

public class Item {

    private String nome;
    private LocalDate validade;
    private double valor;

    public Item(String nome, LocalDate validade, double valor) {
        this.nome = nome;
        this.validade = validade;
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public LocalDate getValidade() {
        return this.validade;
    }

    public String getNome() {
        return this.nome;
    }
}
