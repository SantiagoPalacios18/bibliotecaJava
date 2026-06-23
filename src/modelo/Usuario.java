package modelo;

import java.util.*;

public class Usuario {
    private String nombre;
    private String apellido;
    private String mail;
    private String contrasena;
    private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();

    public Usuario(String nombre, String apellido, String mail, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }
}