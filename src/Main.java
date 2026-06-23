import vista.Vista;
import modelo.Modelo;
import controlador.Controlador;

public class Main {
    public static void main(String[] args) {
        Vista sistema = new Vista(750, 500);
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(sistema, modelo);
        sistema.setVisible(true); //TODO TEST
    }
}
