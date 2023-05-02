import model.Dados;
import model.Itinerario;

public class App {
    public static void main(String[] args) throws Exception {
        Dados.getItinerarios().add(new Itinerario("São Paulo", "Rio de Janeiro", "01/01/2021"));

        System.out.printf("Origem original:" + Dados.getItinerarios().get(0).getOrigem() + "\n");

        Dados.getItinerarios().get(0).setOrigem("Brasilia");

        System.out.printf("Origem alterado:" + Dados.getItinerarios().get(0).getOrigem() + "\n");

        System.out.printf("Tamanho antes remover:" + Dados.getItinerarios().size() + "\n");
        Dados.getItinerarios().remove(0);
        System.out.printf("Tamanho depois de remover:" + Dados.getItinerarios().size() + "\n");

    }
}