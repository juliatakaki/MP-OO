import java.util.List;
import java.util.Scanner;
import model.Dados;
import model.Itinerario;
import model.Passagem;

public class App {
    public static void main(String[] args) throws Exception {
        Itinerario itinerario = new Itinerario("São Paulo", "Rio de Janeiro", "01/01/2022");
        List<Passagem> passagens = itinerario.getPassagens();
        System.out.println(passagens);

        //Adiciona o itinerário na lista de itinerários na classe Dados
        Dados.getItinerarios().add(itinerario);

        System.out.println("Origem incial: " + Dados.getItinerarios().get(0).getOrigem());

        Scanner scanner = new Scanner(System.in); // criar um objeto Scanner

        int posicaoItinerario = 0; // armazena a posição do itinerário na lista
        
        // Solicitar ao usuário que insira uma nova origem
        System.out.println("Digite a nova origem: ");
        String novaOrigem = scanner.nextLine();

        // utilizar a posição para alterar a origem
        Dados.getItinerarios().get(posicaoItinerario).setOrigem(novaOrigem);
        System.out.println("Origem alterada: " + Dados.getItinerarios().get(posicaoItinerario).getOrigem());

        System.out.println("Tamanho antes de remover: " + Dados.getItinerarios().size());
        Dados.getItinerarios().remove(posicaoItinerario);
        System.out.println("Tamanho depois de remover: " + Dados.getItinerarios().size());

        scanner.close(); // fechar o objeto Scanner
    }
}