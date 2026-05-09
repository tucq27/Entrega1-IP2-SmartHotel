public class Servico{
    private String descricao;
    private Funcionario funcionario;

    // Construtor, considerando um unico funcionario
    public Servico(String descricao, Funcionario funcionario) {
        this.descricao = descricao;
        this.funcionario = funcionario;
    }

    // Serviços prestados
    public void lavarRoupa(Quarto quarto) {
        
    }
    public void levarComida(Quarto quarto) {
        
    }
    public void limparQuarto(Quarto quarto) {
        
    }

    // Getters
    public String getDescricao() {
        return descricao;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }

    // Setters
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}