package controlador;

import modelo.Biblioteca;
import modelo.Usuario;
import vista.Vista;

public class Controlador {
    private Vista vista;
    private Biblioteca biblioteca;

    // Constructor
    public Controlador(Vista vista, Biblioteca biblioteca) {
        this.vista = vista;
        this.biblioteca = biblioteca;
        this.vista.setControlador(this);
        this.biblioteca.setControlador(this);
    }

    public boolean registrarUsuario(String nombre, String apellido, String mail, String contrasena) {
        return biblioteca.registrarUsuario(new Usuario(nombre, apellido, mail, contrasena));
    }

    public Usuario iniciarSesion(String mail, String contrasena) {
        Usuario user = biblioteca.validarDatos(mail, contrasena);
        if (user != null) {
            biblioteca.setUsuarioLogueado(user);
        }

        return user;
    }

    public Usuario getUsuario() {
        return biblioteca.getUsuarioLogueado();
    }

    public Biblioteca getModelo() {
        return biblioteca;
    }

    public Vista getVista() {
        return vista;
    }
}
