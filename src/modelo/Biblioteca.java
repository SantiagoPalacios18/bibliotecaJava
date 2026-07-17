package modelo;

import controlador.Controlador;
import modelo.materiales.Libro;

import java.util.ArrayList;

public class Biblioteca {
    private Controlador controlador;
    private Usuario usuarioLogueado;
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<MaterialBiblioteca> listaLibros = new ArrayList<MaterialBiblioteca>();
    private ArrayList<MaterialBiblioteca> listaRevistas = new ArrayList<MaterialBiblioteca>();
    private ArrayList<MaterialBiblioteca> listaDVD = new ArrayList<MaterialBiblioteca>();

    public Biblioteca() {
        usuarios.add(new Usuario("Admin", "", "admin@gmail.com", "67"));
        usuarios.add(new Usuario("Santiago", "palacios", "santiago@gmail.com", "blobloblo"));

        Libro libro1 = new Libro("Vivaldi", "Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.",
                "./assets/eadlt-vol1.jpg", "Antonio Vivaldi", "Navegadores");
        libro1.setDisponibilidad(false);
        listaLibros.add(libro1);

        Libro libro2 = new Libro("Recetas con pan", "Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.",
                "./assets/eadlt-vol1.jpg", "h4terCel1ac0s1221", "Cocina");
        listaLibros.add(libro2);

        Libro libro3 = new Libro("ComoCocinarCentollas", "Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.", "./assets/eadlt-vol1.jpg", "ha73rS4p4110s", "Navegadores");
        listaLibros.add(libro3);

        Libro libro4 = new Libro("Vivaldi", "Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.", "./assets/eadlt-vol1.jpg", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro4);

        Libro libro5 = new Libro("Vivaldi", "Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.", "./assets/eadlt-vol1.jpg", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro5);

        Libro libro6 = new Libro("Vivaldi", "Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis. Tempus leo eu aenean sed diam urna tempor. Pulvinar vivamus fringilla lacus nec metus bibendum egestas. Iaculis massa nisl malesuada lacinia integer nunc posuere. Ut hendrerit semper vel class aptent taciti sociosqu. Ad litora torquent per conubia nostra inceptos himenaeos.", "./assets/eadlt-vol1.jpg", "Antonio Vivaldi", "Navegadores");
        listaLibros.add(libro6);
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
        setUsuarioLogueado(u);
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
