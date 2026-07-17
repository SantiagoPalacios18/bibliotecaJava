import vista.Vista;
import modelo.Biblioteca;
import controlador.Controlador;
import vista.panels.MainMenu;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista(750, 500);
        Biblioteca sistema = new Biblioteca();
        Controlador controlador = new Controlador(vista, sistema);
        vista.setVisible(true); //TODO TEST

        MainMenu m = new MainMenu(vista);
        vista.setMenu(m);

    }
}