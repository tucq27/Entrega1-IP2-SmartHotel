package Dados;
import ClassesBasicas.Quarto;
import java.util.ArrayList;

public class RepositorioQuartos implements InterfaceRepositorio<Quarto> {

    private ArrayList<Quarto> quartos; 
    
    // construtor
    public RepositorioQuartos() {
        this.quartos = new ArrayList<Quarto>(10);
    }

    @Override
    public Quarto buscar(String id) {
        for (Quarto quarto : quartos) {
            if (quarto.getId().equals(id)) {
                return quarto;
            }
        }
        return null; // Retorna null se o quarto não for encontrado
    }

    @Override
    public void adicionar(Quarto quarto) {
        quartos.add(quarto);
    }
       
    @Override
    public void remover(Quarto quarto) {
        quartos.remove(quarto);
    }

    // metodos de atualizar
    public void atualizarAndar(Quarto quarto, int novoAndar) {
        quarto.setAndar(novoAndar);
    }
    public void atualizarLimpeza(Quarto quarto, boolean limpo) {
        quarto.setLimpo(limpo);
    }
    public void atualizarDisponibilidade(Quarto quarto, boolean livre) {
        quarto.setLivre(livre);
    }
    public void atualizarMultTaxa(Quarto quarto, double multTaxa) {
        quarto.setMultTaxa(multTaxa);
    }
    public void atualizarCapacidade(Quarto quarto, int capacidade) {
        quarto.setCapacidade(capacidade);
    }
    // id é fixo, não atualizavel
    // frigobar é atualizado por meio de um repositorio proprio
}
