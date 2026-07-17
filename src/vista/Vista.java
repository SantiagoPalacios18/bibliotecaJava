package vista;

import com.sun.tools.javac.Main;
import controlador.Controlador;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import modelo.MaterialBiblioteca;
import modelo.materiales.*;
import vista.panels.*;

public class Vista extends JFrame { //Extiende de JFrame porque es la ventana principal
    private Controlador controlador;
    private MainMenu menu;
    private RegistroInicioSesion ris;
    private ArrayList<MaterialBiblioteca> seleccionados = new  ArrayList<MaterialBiblioteca>(); // Elementos seleccionados en RegistroMaterial

    public Vista(int x, int y) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension scn = tk.getScreenSize();

        setTitle("Sistema Biblioteca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(x, y);
        setLocationRelativeTo(null); //Centra en la pantalla
        setPreferredSize(new Dimension(x, y)); //
        //setExtendedState(JFrame.MAXIMIZED_BOTH);

        Font fontBtn = new Font("Century Gothic", Font.BOLD, 20);
        UIManager.put("Label.foreground", Color.white);
        UIManager.put("Label.font", fontBtn);
        UIManager.put("Button.background", Color.red);
        UIManager.put("Button.foreground", Color.white);
        UIManager.put("Button.font", fontBtn);
        UIManager.put("Button.border", null);
        UIManager.put("TextField.border", null);
        UIManager.put("TextField.font", fontBtn);
        UIManager.put("TextField.background", Color.decode("#FFE3E7"));
        UIManager.put("Panel.background", Color.darkGray);

//        RegistroMaterial test = new RegistroMaterial(listaLibros);
//        RegistroInicioSesion rls = new RegistroInicioSesion();
//        setContentPane(rls);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                JPanel actPanel = (JPanel) getContentPane();
                int w = actPanel.getWidth();
                int fila;
                if(actPanel instanceof RegistroMaterial) {
                    if (w >= (int) (scn.getWidth() * .68)) {
                        fila = 6;
                    } else if (w <= (int) (scn.getWidth() * .68) && w >= (int) (scn.getWidth() * .25)) {
                        fila = 3;
                    } else {
                        fila = 1;
                    }
                    ((RegistroMaterial) actPanel).agregarMaterial(fila);
                }
            }
        });
    }

    public void setPanel(JPanel panel) {
        setContentPane(panel);
        repaint();
        revalidate();
    }

    public void abrirMenu(int menu, Vista vista) {
        ArrayList<MaterialBiblioteca> materiales = new ArrayList<>();
        switch(menu){
            case 1: materiales = controlador.getListaLibros(); break;
            case 2: materiales = controlador.getListaRevistas(); break;
            case 3: materiales = controlador.getListaDVD(); break;
            default: System.out.println("Valor fuera de rango (>0, <4)"); break;
        }
        RegistroMaterial newMenu = new RegistroMaterial(materiales, vista);
        setPanel(newMenu);
    }

    public void finalizar(){
        controlador.setUsuarioLogueado(null);
        setPanel(ris);
    }

    public boolean registrarUsusario(String nombre, String apellido, String mail, String contrasena){
        return controlador.registrarUsuario(nombre, apellido, mail, contrasena);
    }

    public boolean iniciarSesion(String mail, String contrasena){
        return controlador.iniciarSesion(mail, contrasena);
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public MainMenu getMenu() {
        return menu;
    }

    public void setMenu(MainMenu menu) {
        this.menu = menu;
        setPanel(menu);
    }

    public RegistroInicioSesion getRis() {
        return ris;
    }

    public void setRis(RegistroInicioSesion ris) {
        this.ris = ris;
    }

    public ArrayList<MaterialBiblioteca> getSeleccionados() {
        return seleccionados;
    }

    public void setSeleccionados(ArrayList<MaterialBiblioteca> seleccionados) {
        this.seleccionados = seleccionados;
    }

    /*AQUÍ VA TU CONTENIDO, SOY CLARAMENTE UNA IA MUSTAFA LA CONCHA DE LA PROGENITORA DE TU PROGENITORA
    ArrayList<MaterialBiblioteca> listaDVD = new ArrayList<MaterialBiblioteca>();
    DVD dvd1 = new DVD("Toy Story 6", "LOREM1", "", "Disney pixar", "Infantil");
    listaDVD.add(dvd1);
    DVD dvd2 = new DVD("Toy Story 5", "LOREM2", "", "Disney sexar", "Adultos");
    listaDVD.add(dvd2);
    DVD dvd3 = new DVD("Toy Story 4", "LOREM3", "", "Disney pornar", "Discapacidad");
    listaDVD.add(dvd3);
    DVD dvd4 = new DVD("Toy Story 3", "LOREM4", "", "Sexney pixar", "+18");
    listaDVD.add(dvd4);
    DVD dvd5 = new DVD("Toy Story 2", "LOREM5", "", "Porney pixar", "Bebés");
    listaDVD.add(dvd5);
    DVD dvd6 = new DVD("Toy Story 1", "LOREM6", "", "Porney sexar", "SKibidi");
    listaDVD.add(dvd6);

    public ArrayList<MaterialBiblioteca> getListaDVD() {
        return listaDVD;
    }*/
}