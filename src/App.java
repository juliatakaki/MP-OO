import model.Dados;
import model.Itinerario;

public class App {
    public static void main(String[] args) throws Exception {
        Dados.getItinerarios().add(new Itinerario("São Paulo", "Rio de Janeiro", "01/01/2021"));

        System.out.printf("Origem original:" + Dados.getItinerarios().get(0).getOrigem() + "\n");

        int posicaoItinerario = 0; // armazena a posição do itinerário na lista
        Dados.getItinerarios().get(posicaoItinerario).setOrigem("Brasilia"); // utiliza a posição para alterar a origem

        System.out.printf("Origem alterada:" + Dados.getItinerarios().get(posicaoItinerario).getOrigem() + "\n");

        System.out.printf("Tamanho antes de remover:" + Dados.getItinerarios().size() + "\n");
        Dados.getItinerarios().remove(posicaoItinerario);
        System.out.printf("Tamanho depois de remover:" + Dados.getItinerarios().size() + "\n");

    }
}
