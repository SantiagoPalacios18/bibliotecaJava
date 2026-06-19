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

        ArrayList<MaterialBiblioteca> lista = new ArrayList<MaterialBiblioteca>();

        Libro libro1 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        libro1.setDisponibilidad(false);
        lista.add(libro1);

        Libro libro2 = new Libro("Recetas con pan", "h4terCel1ac0s1221", "Cocina");
        lista.add(libro2);

        Libro libro3 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        lista.add(libro3);

        Libro libro4 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        lista.add(libro4);

        Libro libro5 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        lista.add(libro5);

        Libro libro6 = new Libro("Vivaldi", "Antonio Vivaldi", "Navegadores");
        lista.add(libro6);

        RegistroMaterial test = new RegistroMaterial(lista);

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