package vista.panels;

import modelo.MaterialBiblioteca;

import javax.swing.*;
import java.awt.*;

public class Material_visual extends JPanel {
    private MaterialBiblioteca m;
    public Material_visual(MaterialBiblioteca m) {
        this.m = m;
        setLayout(new GridLayout(4, 1));
        JLabel titulo = new JLabel("Titulo: " + m.getTitulo());
        JLabel autor = new JLabel("Autor: " + m.getAutor());
        JLabel genero = new JLabel("Genero: " + m.getGenero());
        JLabel disponibilidad = new JLabel(m.showDisponibilidad());

        add(titulo); add(autor); add(genero); add(disponibilidad);

//        -- Diseno
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        autor.setFont(new Font("Arial", Font.BOLD, 20));
        genero.setFont(new Font("Arial", Font.BOLD, 20));
        disponibilidad.setFont(new Font("Arial", Font.BOLD, 20));

        if(m.getDisponibilidad() == false) {
            setBackground(Color.darkGray);
            titulo.setForeground(Color.white);
            autor.setForeground(Color.white);
            genero.setForeground(Color.white);
            disponibilidad.setForeground(Color.white);
        }
    }
}