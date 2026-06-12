package vista;

import vista.panels.*;
import javax.swing.*;
import java.awt.*;

public class Vista extends JFrame {
    public Vista(int x, int y) {
        setTitle("Sistema Biblioteca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(x, y);
        MainMenu menu = new MainMenu();
        setContentPane(menu.getMenu());
    }
}