package model;
import java.util.Scanner;
import java.util.ArrayList;

public class Itinerario {
    private String origem;
    private String destino;
    private String data;
    private ArrayList<Passagem> passagens = new ArrayList<Passagem>();

    public Itinerario(String origem, String destino, String data) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }

    public String getOrigem() {
        try (Scanner ler = new Scanner(System.in)){
        System.out.println("Digite a origem da passagem: ");
        origem = ler.next();
        return this.origem;
        }
    }

    public String getDestino() {
        try (Scanner ler = new Scanner(System.in)){
        System.out.println("Digite o destino da passagem: ");
        destino = ler.next();
        return this.destino;
        }
    }

    public String getData() {
        try (Scanner ler = new Scanner(System.in)){
        System.out.println("Digite a data da passagem (ss/mm/aaaa): ");
        data = ler.next();
        return this.data;
        }
    }

    public ArrayList<Passagem> getPassagens() {
        return this.passagens;
    }

    public void setOrigem(String origem) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a origem a ser alterada: ");
        origem = ler.next();
        this.origem = origem;
        ler.close();
    }

    public void setDestino(String destino) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o destino a ser alterado: ");
        destino = ler.next();
        this.destino = destino;
        ler.close();
    }

}
