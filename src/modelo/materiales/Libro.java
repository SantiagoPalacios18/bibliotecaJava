package modelo.materiales;

import modelo.MaterialBiblioteca;

import java.awt.*;

public class Libro extends MaterialBiblioteca {
    public Libro(String titulo, String img, String autor, String genero) {
        super(titulo, img, autor, genero);
    }
}
