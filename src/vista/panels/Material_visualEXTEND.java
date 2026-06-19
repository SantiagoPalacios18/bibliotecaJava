package vista.panels;

import modelo.MaterialBiblioteca;

import javax.swing.*;
import java.awt.*;

public class Material_visualEXTEND extends JFrame {
    private final MaterialBiblioteca m;
    public Material_visualEXTEND(MaterialBiblioteca m) {
        this.m = m;
        setSize(300, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setContentPane(new JPanel(new GridBagLayout()));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);

        c.gridx = 0; c.gridy = 0;
        add(new JLabel(m.getTitulo()), c);

        c.gridx = 0; c.gridy = 1;
        add(new JLabel(m.getAutor()), c);

        c.gridx = 0; c.gridy = 2;
        add(new JLabel(m.getGenero()), c);

        c.gridx = 0; c.gridy = 3;
        add(new JLabel(m.showDisponibilidad()), c);

        setVisible(true);
    }
}
