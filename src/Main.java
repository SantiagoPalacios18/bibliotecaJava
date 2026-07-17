import vista.Vista;
import modelo.Biblioteca;
import controlador.Controlador;
import vista.panels.MainMenu;
import vista.panels.RegistroInicioSesion;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista(1000, 800);
        Biblioteca sistema = new Biblioteca();
        Controlador controlador = new Controlador(vista, sistema);
        vista.setVisible(true); //TODO TEST

        MainMenu m = new MainMenu(vista);
        RegistroInicioSesion ris = new RegistroInicioSesion(vista);
        vista.setMenu(m);
        vista.setRis(ris);

    }
}