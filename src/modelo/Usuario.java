package modelo;

import java.util.*;

public class Usuario {
    private String nombre;
    private String apellido;
    private String mail;
    private int edad;
    private ArrayList<Prestamo> prestamos;

    public Usuario(String nombre, String apellido, String mail, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.edad = edad;
    }
}
