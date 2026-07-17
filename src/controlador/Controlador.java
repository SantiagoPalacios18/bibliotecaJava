package controlador;

import modelo.Biblioteca;
import modelo.MaterialBiblioteca;
import modelo.Usuario;
import vista.Vista;

import java.util.ArrayList;

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

    public boolean iniciarSesion(String mail, String contrasena) {
        Usuario user = biblioteca.validarDatos(mail, contrasena);
        if (user != null) {
            biblioteca.setUsuarioLogueado(user);
            return true;
        }

        return false;
    }

    public void setUsuarioLogueado(Usuario user){
        biblioteca.setUsuarioLogueado(user);
    }

    public Usuario getUsuario() {
        return biblioteca.getUsuarioLogueado();
    }

    public ArrayList<Usuario> getUsuarios() { return biblioteca.getUsuarios(); }
    public ArrayList<MaterialBiblioteca> getListaLibros() { return biblioteca.getListaLibros(); }
    public ArrayList<MaterialBiblioteca> getListaRevistas() { return biblioteca.getListaRevistas(); }
    public ArrayList<MaterialBiblioteca> getListaDVD() { return biblioteca.getListaDVD(); }

    public Biblioteca getModelo() {
        return biblioteca;
    }

    public Vista getVista() {
        return vista;
    }

}
