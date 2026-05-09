package Dados;

public interface InterfaceRepositorio<Tipo> {
    Tipo buscar(String id); // busca um objeto no repositorio (array list) a partir de um id (string)
    void adicionar(Tipo objeto); // adiciona um objeto ao repositorio (array list)
    void remover(Tipo objeto); // remove um objeto do repositorio (array list)
    
    // deve haver um metodo de atualizar para cada atributo da classe basica em seu respectivo repositorio
}
