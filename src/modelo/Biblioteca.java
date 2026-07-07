package modelo;

import controlador.Controlador;
import java.util.ArrayList;

public class Biblioteca {
    private Controlador controlador;
    private Usuario usuarioLogueado;
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<MaterialBiblioteca> listaLibros, listaRevistas, listaDVD = new ArrayList<>();

    public Biblioteca() {
        usuarios.add(new Usuario("Admin", "", "admin@gmail.com", "67"));
        usuarios.add(new Usuario("Santiago", "palacios", "santiago@gmail.com", "blobloblo"));

    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public boolean registrarUsuario(Usuario u) {
        // BUSCAMOS EN TODA LA LISTA DE USUARIOS Y RECORREMOS UNO POR UNO
        for (Usuario usuario : usuarios) { // crea una variable temporal llamada usuario de tupo Usuario, y recorre
                                           // todos los elementos de Usuario

            if (usuario.getMail().equalsIgnoreCase(u.getMail())) {
                return false; // ya existe el mail
            }
        }
        usuarios.add(u);
        return true;
    }

    public Usuario validarDatos(String mail, String contrasena) {

        for (Usuario usuario : usuarios) {
            if (usuario.getMail().equalsIgnoreCase(mail) && usuario.getContrasena().equals(contrasena)) {
                return usuario;
            }
        }
        // si no encontro, retorna null
        return null;
    }

    // getters y setters
    //UsuarioLogueado
    public Usuario getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public void setUsuarioLogueado(Usuario usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
    }
    //Usuarios
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    //ListaLibros
    public ArrayList<MaterialBiblioteca> getListaLibros() { return listaLibros; }

    public void setListaLibros(ArrayList<MaterialBiblioteca> listaLibros) { this.listaLibros = listaLibros; }
    //ListaRevistas
    public ArrayList<MaterialBiblioteca> getListaRevistas() { return listaRevistas; }

    public void setListaRevistas(ArrayList<MaterialBiblioteca> listaRevistas) { this.listaRevistas = listaRevistas; }
    //ListaDVD
    public ArrayList<MaterialBiblioteca> getListaDVD() { return listaDVD; }

    public void setListaDVD(ArrayList<MaterialBiblioteca> listaDVD) { this.listaDVD = listaDVD; }
}
