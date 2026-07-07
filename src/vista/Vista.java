package vista;

import controlador.Controlador;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import modelo.MaterialBiblioteca;
import modelo.materiales.Libro;
import vista.panels.*;

public class Vista extends JFrame { //Extiende de JFrame porque es la ventana principal
    private Controlador controlador;
    protected modelo.Usuario user;

    public Vista(int x, int y) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension scn = tk.getScreenSize();

        setTitle("Sistema Biblioteca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(x, y);
        setLocationRelativeTo(null); //Centra en la pantalla
        setPreferredSize(new Dimension(x, y)); //
        MainMenu menu = new MainMenu();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);

        ArrayList<MaterialBiblioteca> listaLibros = new ArrayList<MaterialBiblioteca>();

        Libro libro1 = new Libro("Vivaldi", "Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.",
                "./assets/eadlt-vol1.jpg", "Antonio Vivaldi", "Navegadores");
        libro1.setDisponibilidad(false);
        listaLibros.add(libro1);

        Libro libro2 = new Libro("Recetas con pan", "Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.",
                "./assets/eadlt-vol1.jpg", "h4terCel1ac0s1221", "Cocina");
        listaLibros.add(libro2);

        Libro libro3 = new Libro("ComoCocinarCentollas", "Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.", "./assets/eadlt-vol1.jpg", "ha73rS4p4110s", "Navegadores");
        listaLibros.add(libro3);

        Libro libro4 = new Libro("Vivaldi", "Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.", "./assets/eadlt-vol1.jpg", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro4);

        Libro libro5 = new Libro("Vivaldi", "Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.", "./assets/eadlt-vol1.jpg", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro5);

        Libro libro6 = new Libro("Vivaldi", "Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.", "./assets/eadlt-vol1.jpg", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro6);

        UIManager.put("Button.background", Color.red);
        UIManager.put("Button.foreground", Color.white);
        UIManager.put("Panel.background", Color.darkGray);

        RegistroMaterial test = new RegistroMaterial(listaLibros);
        RegistroInicioSesion rls = new RegistroInicioSesion();
        setContentPane(rls);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                JPanel actPanel = (JPanel) getContentPane();
                int w = actPanel.getWidth();
                int fila;
                if(actPanel instanceof RegistroMaterial) {
                    if (w >= (int) (scn.getWidth() * .65)) {
                        fila = 6;
                    } else if (w <= (int) (scn.getWidth() * .65) && w >= (int) (scn.getWidth() * .25)) {
                        fila = 3;
                    } else {
                        fila = 1;
                    }
                    ((RegistroMaterial) actPanel).agregarMaterial(fila);
                }
            }
        });
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setUser(){ this.user = controlador.getUsuario(); }

    public modelo.Usuario getUser(){ return user; }
}