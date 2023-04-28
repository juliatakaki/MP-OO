package model;

import java.util.ArrayList;

public class Dados {
    private static final ArrayList<Passagem> passagens = new ArrayList<Passagem>();
    private static final ArrayList<Intinerario> intinerarios = new ArrayList<Intinerario>();

    private Dados() {
    }

    public static ArrayList<Passagem> getPassagens() {
        return passagens;
    }

    public static ArrayList<Intinerario> getIntinerarios() {
        return intinerarios;
    }
}
