package vista.panels;

import vista.Vista;
import modelo.Biblioteca;
import javax.swing.*;
import java.awt.*;

public class MainMenu extends JPanel { //
    private JButton btnLibro, btnRevista, btnDVD, btnFinal;
    private final Vista vista;

    public MainMenu(Vista vista) {
        this.vista = vista;
        setLayout(new GridBagLayout()); // Cambio el layout
        GridBagConstraints c = new GridBagConstraints(); // Creo el objeto que tiene los atributos de posicion de los
                                                         // demas componentes

        c.insets = new Insets(5, 5, 5, 5); // Padding default en todos los elementos

        // ---Estructura
        btnFinal = new JButton("Finalizar");
        c.weightx = .5; // Le indica al componente que ocupe t0do el ancho de su contenedor
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 70; // Padding interno del component
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.gridx = 0;
        c.gridy = 0;
        add(btnFinal, c);

        c.insets = new Insets(50, 20, 50, 20);

        btnLibro = new JButton("Libro");
        c.weighty = .5;
        c.weightx = 1;
        c.ipady = 0;
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 1;
        add(btnLibro, c);

        btnRevista = new JButton("Revista");
        c.gridx = 1;
        c.gridy = 1;
        add(btnRevista, c);

        btnDVD = new JButton("DVD");
        c.gridx = 2;
        c.gridy = 1;
        add(btnDVD, c);

        // ---Listeners

        btnFinal.addActionListener(e -> {
            vista.finalizar();
        });

        btnLibro.addActionListener(e -> {
            vista.abrirMenu(1, vista);
        });

        btnRevista.addActionListener(e -> {
            vista.abrirMenu(2, vista);
        });

        btnDVD.addActionListener(e -> {
            vista.abrirMenu(3, vista);
        });


    }

    /*
     * private JPanel menu;
     * 
     * public MainMenu(){
     * menu = new JPanel(new GridBagLayout());
     * 
     * GridBagConstraints c = new GridBagConstraints();
     * c.insets = new Insets(5, 5, 5, 5);
     * 
     * }
     */
}
