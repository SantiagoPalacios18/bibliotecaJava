package modelo.materiales;

import modelo.MaterialBiblioteca;

import java.awt.*;

public class Revista extends MaterialBiblioteca {
    public Revista(String titulo, String descripcion, String img, String autor, String genero) {
        super(titulo, descripcion, img, autor, genero);
    }
}
