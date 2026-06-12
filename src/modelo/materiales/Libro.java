package modelo.materiales;

import modelo.MaterialBiblioteca;

public class Libro extends MaterialBiblioteca {
    public Libro(String titulo, String autor, String genero, boolean disponibilidad) {
        super(titulo, autor, genero, disponibilidad);
    }
}
