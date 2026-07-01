package controlador;

import modelo.Modelo;
import modelo.Usuario;
import vista.Vista;

public class Controlador {
    private Vista vista;
    private Modelo modelo;

    // Constructor
    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setControlador(this);
        this.modelo.setControlador(this);
    }

    public boolean registrarUsuario(String nombre, String apellido, String mail, String contrasena) {
        return modelo.registrarUsuario(new Usuario(nombre, apellido, mail, contrasena));
    }

    public Usuario iniciarSesion(String mail, String contrasena) {
        Usuario user = modelo.validarDatos(mail, contrasena);
        if (user != null) {
            modelo.setUsuarioLogueado(user);
        }

        return user;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Vista getVista() {
        return vista;
    }
}
