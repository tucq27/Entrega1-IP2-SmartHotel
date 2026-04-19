import java.util.ArrayList;

public class Frigobar {

    private ArrayList<Item> itens;

    public Frigobar() {
    }

    public Frigobar(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

}
