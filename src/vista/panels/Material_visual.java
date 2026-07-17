package vista.panels;

import modelo.MaterialBiblioteca;
import vista.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Material_visual extends JPanel {
    private final MaterialBiblioteca m;
    private int w;
    private Vista v;
    private Image portada;

    private boolean selected;

    private boolean primera = true;
    private int cantClic = 0;

    public Material_visual(MaterialBiblioteca m, int w, Vista v) {
        this.m = m;
        this.w = w;
        this.v = v;
        portada = m.getImg();

        setLayout(new BorderLayout());

        JLabel titulo = new JLabel(m.getTitulo());

        add(titulo, BorderLayout.NORTH);

        // -- Diseno
        titulo.setFont(new Font("Book Antiqua", Font.BOLD, 17));

        if (!m.getDisponibilidad()) {
            setBackground(Color.darkGray);
            titulo.setForeground(Color.white);
        }else{
            setBackground(Color.white);
            titulo.setForeground(Color.black);
        }

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cantClic++;
                if (primera) {
                    primera = false;
                    Timer t = new Timer(250, f -> {
                        if (cantClic == 1 && m.getDisponibilidad() && e.getButton() == MouseEvent.BUTTON1) {
                            if (!selected) {
                                setBackground(Color.red);
                                selected = true;
                                v.getSeleccionados().add(m);
                                System.out.println(v.getSeleccionados());
                            } else {
                                setBackground(Color.white);
                                selected = false;
                                v.getSeleccionados().remove(m);
                                System.out.println(v.getSeleccionados());
                            }
                        } else {
                            new Material_visualEXTEND(m);
                        }
                        cantClic = 0;
                        primera = true;
                    });
                    t.setRepeats(false);
                    t.start();
                }
            }
        });
    }

    @Override
    public Dimension getPreferredSize() {

        int x = w;
        int y = (int) (x * 1.35) +30;


        return new Dimension(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (portada != null) {
            int ancho = getWidth() - 20;
            int alto = (int) (ancho * 1.35);

            g.drawImage(portada, 10, 30, ancho, alto, this);
            setPreferredSize(new Dimension(ancho, 500));
        }
    }

}