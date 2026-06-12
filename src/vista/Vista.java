package vista;

import controlador.Controlador;
import vista.panels.*;
import javax.swing.*;
import java.awt.*;

public class Vista extends JFrame {
    private Controlador constrolador;

    public Vista(int x, int y) {
        setTitle("Sistema Biblioteca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(x, y);
        MainMenu menu = new MainMenu();
        setContentPane(menu.getMenu());
    }

    public void setConstrolador(Controlador constrolador) {
        this.constrolador = constrolador;
    }
}