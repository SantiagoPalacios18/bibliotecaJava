package vista.panels;

import modelo.MaterialBiblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() == 2) {
                    JFrame matExp = new JFrame();
                    matExp.setSize(300, 600);
                    matExp.setLocationRelativeTo(null);
                    matExp.setResizable(false);
                    matExp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 
                    matExp.setContentPane(new JPanel(new GridBagLayout()));
                    GridBagConstraints c = new GridBagConstraints();
                    c.insets = new Insets(5, 5, 5, 5);

                    c.gridx = 0; c.gridy = 0;
                    matExp.add(new JLabel(m.getTitulo()), c);

                    c.gridx = 0; c.gridy = 1;
                    matExp.add(new JLabel(m.getAutor()), c);

                    c.gridx = 0; c.gridy = 2;
                    matExp.add(new JLabel(m.getGenero()), c);

                    c.gridx = 0; c.gridy = 3;
                    matExp.add(new JLabel(m.showDisponibilidad()), c);

                    matExp.setVisible(true);
                }
            }
        });
    }
}