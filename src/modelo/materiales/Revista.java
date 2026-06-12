package modelo.materiales;

import modelo.MaterialBiblioteca;

public class Revista extends MaterialBiblioteca {
    public Revista(String titulo, String autor, String genero, boolean disponibilidad) {
        super(titulo, autor, genero, disponibilidad);
    }
}
