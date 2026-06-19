package modelo;

import javax.swing.*;
import java.awt.*;

public abstract class MaterialBiblioteca {
    private String titulo;
    private Image img;
    private String autor;
    private String genero;
    private boolean disponibilidad = true;

    public MaterialBiblioteca(String titulo, String img, String autor, String genero) {
        this.titulo = titulo;
        this.img = new ImageIcon(img).getImage();
        this.autor = autor;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Image getImg() { return img; }
    public void setImg(Image img) { this.img = img; }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean getDisponibilidad () { return disponibilidad; }
    public String showDisponibilidad() {
        if (getDisponibilidad() == true) {
            return "Disponible";
        }else  {
            return "No Disponible";
        }
    }
    public void setDisponibilidad (boolean disponibilidad) { this.disponibilidad = disponibilidad; }

}