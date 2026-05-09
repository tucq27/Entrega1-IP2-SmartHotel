package Dados;

public interface InterfaceRepositorio {
    void adicionar(Object obj);
    void remover(Object obj);
    Object buscar(String id);
}
