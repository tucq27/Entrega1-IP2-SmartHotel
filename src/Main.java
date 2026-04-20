import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // criando um quarto
        Quarto quarto01= new QuartoPadrao("01", 2, 5);

        // criando um responsável
        Responsavel joel = new Responsavel("Joel", "123.456.789-00", LocalDate.of(1990, 5, 20), "0800-5000",
                                            "joel@gmail.com","cartao de credito");

        // criando hospedes
        Pessoa taylor= new Hospede("Taylor Swift", "987.654.321-00", LocalDate.of(1995, 8, 15), "0800-6000", "swift@hotmail.com", " ", " ");
        Pessoa sergio= new Hospede("Sergio", "111.111.111-12", LocalDate.of(1985, 3, 10), "0800-7000", "sergio@gmail.com", " ", " ");
        
        ArrayList<Hospede> hospedes1= new ArrayList<>();
        hospedes1.add((Hospede) taylor);
        hospedes1.add((Hospede) sergio); 

        Hospedagem h1= new Hospedagem(LocalDate.now(), joel, hospedes1, quarto01);

        System.out.println(h1.getHospedes().get(0).getNome() + "\n" + h1.getHospedes().get(1).getNome());
    }
}
