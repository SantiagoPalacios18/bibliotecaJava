import vista.Vista;
import modelo.Biblioteca;
import controlador.Controlador;

public class Main {
    public static void main(String[] args) {
        Vista sistema = new Vista(750, 500);
        Biblioteca biblioteca = new Biblioteca();
        Controlador controlador = new Controlador(sistema, biblioteca);
        sistema.setVisible(true); //TODO TEST
    }
}
