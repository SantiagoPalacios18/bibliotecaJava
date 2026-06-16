package vista;

import controlador.Controlador;
import modelo.MaterialBiblioteca;
import modelo.materiales.Libro;
import vista.panels.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Vista extends JFrame {
    private Controlador constrolador;

    public Vista(int x, int y) {
        setTitle("Sistema Biblioteca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(x, y);
        MainMenu menu = new MainMenu();

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

        RegistroMaterial test = new RegistroMaterial(lista);

        setContentPane(test);
    }

    public void setConstrolador(Controlador constrolador) {
        this.constrolador = constrolador;
    }
}