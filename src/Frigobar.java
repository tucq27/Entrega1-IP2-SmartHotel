import java.util.ArrayList;

public class Frigobar {
    //Temos que lembrar de criar uma função pra reconhecer quando um item foi comprado

    private ArrayList<Item> itens = new ArrayList<>();

    public Frigobar() {
    }

    public Frigobar(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public void removerItem(Item item) {
        this.itens.remove(item);
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

}
