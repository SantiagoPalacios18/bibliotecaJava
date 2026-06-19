package vista;

import controlador.Controlador;
import modelo.MaterialBiblioteca;
import modelo.materiales.Libro;
import vista.panels.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Vista extends JFrame { //Extiende de JFrame porque es la ventana principal
    private Controlador controlador;

    public Vista(int x, int y) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension scn = tk.getScreenSize();

        setTitle("Sistema Biblioteca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(x, y);
        setLocationRelativeTo(null); //Centra en la pantalla
        setPreferredSize(new Dimension(x, y)); //
        MainMenu menu = new MainMenu();
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        ArrayList<MaterialBiblioteca> listaLibros = new ArrayList<MaterialBiblioteca>();

        Libro libro1 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        libro1.setDisponibilidad(false);
        listaLibros.add(libro1);

        Libro libro2 = new Libro("Recetas con pan", "h4terCel1ac0s1221", "Cocina");
        listaLibros.add(libro2);

        Libro libro3 = new Libro("ComoCocinarCentollas", "ha73rS4p4110s", "Navegadores");
        listaLibros.add(libro3);

        Libro libro4 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro4);

        Libro libro5 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro5);

        Libro libro6 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro6);

        Libro libro7 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro7);
        Libro libro8 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro8);
        Libro libro9 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro9);
        Libro libro10 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro10);
        Libro libro11 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro11);
        Libro libro12 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro12);
        Libro libro136 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro136);
        Libro libro146 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro146);
        Libro libro156 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro156);
        Libro libro16 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro16);

        RegistroMaterial test = new RegistroMaterial(listaLibros);

        setContentPane(test);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                JPanel actPanel = (JPanel) getContentPane();
                int w = actPanel.getWidth();
                if(actPanel instanceof RegistroMaterial){
                   if (w >= (int) (scn.getWidth() * .5)) {
                       ((RegistroMaterial) actPanel).agregarMaterial(6);
                   }else{
                       ((RegistroMaterial) actPanel).agregarMaterial(3);
                   }

                }
            }
        });
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
}