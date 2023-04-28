import model.Dados;
import model.Intinerario;

public class App {
    public static void main(String[] args) throws Exception {
        Dados.getIntinerarios().add(new Intinerario("São Paulo", "Rio de Janeiro", "01/01/2021"));

        System.out.printf("Origem original:" + Dados.getIntinerarios().get(0).getOrigem() + "\n");

        Dados.getIntinerarios().get(0).setOrigem("Brasilia");

        System.out.printf("Origem alterado:" + Dados.getIntinerarios().get(0).getOrigem() + "\n");

        System.out.printf("Tamanho antes remover:" + Dados.getIntinerarios().size() + "\n");
        Dados.getIntinerarios().remove(0);
        System.out.printf("Tamanho depois de remover:" + Dados.getIntinerarios().size() + "\n");

    }
}