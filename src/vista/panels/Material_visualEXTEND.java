package vista.panels;

import modelo.MaterialBiblioteca;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Material_visualEXTEND extends JFrame {
    private final MaterialBiblioteca m;

    public Material_visualEXTEND(MaterialBiblioteca m) {
        this.m = m;
        setSize(300, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Font f = new Font("Century Gothic", Font.BOLD, 20);
        UIManager.put("Label.font", f);

//      ---Estructura
        setContentPane(new JPanel(new GridBagLayout()));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);

        c.weightx = 1.0;
        c.fill =  GridBagConstraints.HORIZONTAL;
        JLabel titulo = new JLabel(m.getTitulo());
        c.gridx = 0;
        c.gridy = 0;
        add(titulo, c);

        JTextArea desc = new JTextArea(m.getDescripcion());
        c.ipady = 50;
        c.gridx = 0;
        c.gridy = 1;
        add(desc, c);

        JLabel autor = new JLabel("Autor: " + m.getAutor());
        c.ipady = 0;
        c.gridx = 0;
        c.gridy = 2;
        add(autor, c);

        JLabel genero = new JLabel("Genero: " + m.getGenero());
        c.gridx = 0;
        c.gridy = 3;
        add(genero, c);

        JLabel disponibilidad = new JLabel(m.showDisponibilidad());
        c.gridx = 0;
        c.gridy = 4;
        add(disponibilidad, c);

//      ---Diseño
        desc.setLineWrap(true);
        desc.setWrapStyleWord(true);
        desc.setEditable(false);
        desc.setFocusable(false);
        desc.setOpaque(false);
        desc.setBorder(null);

        setVisible(true);
    }
}
