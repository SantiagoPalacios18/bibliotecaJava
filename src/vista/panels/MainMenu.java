package vista.panels;

import javax.swing.*;
import java.awt.*;

public class MainMenu {
    private JPanel menu;

    private JButton btnLibro, btnRevista, btnDVD, btnEscape;

    public MainMenu() {
        menu = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);



        // Escape
        btnEscape = new JButton("Escape");
        c.weightx = .5;
        c.ipady = 20;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.gridx = 0; c.gridy = 0;
        menu.add(btnEscape, c);



        btnLibro = new JButton("Libro");
        c.weighty = .5;
        c.weightx = .5;
        c.ipady = 0;
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0; c.gridy = 1;
        menu.add(btnLibro, c);

        btnRevista = new JButton("Revista");
        c.gridx = 1; c.gridy = 1;
        menu.add(btnRevista, c);

        btnDVD = new JButton("DVD");
        c.gridx = 2; c.gridy = 1;
        menu.add(btnDVD, c);



        JLabel lblTitulo = new JLabel("Registro biblioteca");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 35));
        lblTitulo.setBackground(Color.RED);
        c.weighty = 0;
        c.weightx = 1;
        c.ipady = 30;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.gridy = 2; c.gridx = 0; c.gridwidth = 3;
        ImageIcon imagen = new ImageIcon("./assets/test.png");
        menu.add(lblTitulo, c);

    }

    public JPanel getMenu() {
        return menu;
    }
}
