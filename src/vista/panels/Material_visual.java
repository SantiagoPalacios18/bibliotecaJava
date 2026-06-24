package vista.panels;

import modelo.MaterialBiblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Material_visual extends JPanel {
    private final MaterialBiblioteca m;
    private Image portada;
    private int w;

    private boolean selected;

    private boolean primera = true;
    private int cantClic = 0;

    public Material_visual(MaterialBiblioteca m, int w) {
        this.m = m;
        this.w = w;
        portada = m.getImg();

        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Titulo: " + m.getTitulo());

        add(titulo, BorderLayout.NORTH);

//        -- Diseno
        titulo.setFont(new Font("Book Antiqua", Font.BOLD, 20));

        if(!m.getDisponibilidad()) {
            setBackground(Color.darkGray);
            titulo.setForeground(Color.white);
        }

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cantClic++;
                if(primera){
                    primera = false;
                    Timer t = new Timer(250,f ->{
                        if(cantClic == 1 && m.getDisponibilidad() && e.getButton() == MouseEvent.BUTTON1) {
                            if (!selected) {
                                setBackground(Color.red);
                                selected = true;
                            }else{
                                setBackground(Color.white);
                                selected = false;
                            }
                        }else{
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
        int y = (int) (x * 1.6) + 30;


        return new Dimension(x, y);
    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        if (portada != null) {
//            int ancho = getWidth();
//            int alto = (int) (ancho * 1.6);
//
//            g.drawImage(portada, 0, 30, ancho, alto, this);
//            setPreferredSize(new Dimension(ancho, 500));
//        }
//    }

}