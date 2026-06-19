package vista.panels;

import vista.Vista;
import javax.swing.*;
import java.awt.*;

public class MainMenu extends JPanel{ //
    private JButton btnLibro, btnRevista, btnDVD, btnEscape;

    public MainMenu() {
        setLayout(new GridBagLayout()); //Cambio el layout
        GridBagConstraints c = new GridBagConstraints(); //Creo el objeto que tiene los atributos de posicion de los demas componentes
        c.insets = new Insets(5, 5, 5, 5); //Padding default en todos los elementos



//      ---Estructura
        btnEscape = new JButton("Escape");
        c.weightx = .5; //Le indica al componente que ocupe t0do el ancho de su contenedor
        c.ipady = 20; //Padding interno del componente
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.gridx = 0; c.gridy = 0;
        add(btnEscape, c);



        btnLibro = new JButton("Libro");
        c.weighty = .5;
        c.weightx = 1;
        c.ipady = 0;
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0; c.gridy = 1;
        add(btnLibro, c);

        btnRevista = new JButton("Revista");
        c.gridx = 1; c.gridy = 1;
        add(btnRevista, c);

        btnDVD = new JButton("DVD");
        c.gridx = 2; c.gridy = 1;
        add(btnDVD, c);



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
        add(lblTitulo, c);

//      ---Design

        btnEscape.setBackground(Color.RED);

        btnLibro.setBackground(Color.BLUE);

        btnRevista.setBackground(Color.GREEN);

        btnDVD.setBackground(Color.YELLOW);

        lblTitulo.setIcon(imagen);

//      ---Listeners

    }

    /*private JPanel menu;

public MainMenu(){
    menu = new JPanel(new GridBagLayout());

    GridBagConstraints c = new GridBagConstraints();
    c.insets = new Insets(5, 5, 5, 5);

}*/
}
