package modelo;

import java.util.*;

public class Usuario {
    private String nombre;
    private String apellido;
    private String mail;
    private ArrayList<Prestamo> prestamos;

    public Usuario(String nombre, String apellido, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        prestamos = new ArrayList<Prestamo>();
    }

    public void agregarPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }
}