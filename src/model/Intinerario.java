package model;

import java.util.ArrayList;

public class Intinerario {
    private String origem;
    private String destino;
    private String data;
    private ArrayList<Passagem> passagens = new ArrayList<Passagem>();

    public Intinerario(String origem, String destino, String data) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }

    public String getOrigem() {
        return this.origem;
    }

    public String getDestino() {
        return this.destino;
    }

    public String getData() {
        return this.data;
    }

    public ArrayList<Passagem> getPassagens() {
        return this.passagens;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

}
