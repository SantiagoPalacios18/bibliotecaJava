package vista.panels;

import modelo.MaterialBiblioteca;
import vista.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegistroMaterial extends JPanel {
    private ArrayList<MaterialBiblioteca> materiales;
    private JButton btnEscape;
    private JPanel opt;
    private JButton btnConfirmar;
    private Vista vista;

    public RegistroMaterial(ArrayList<MaterialBiblioteca> materiales,  Vista vista) {
        this.materiales = materiales;
        this.vista = vista;

        Font f = new Font("Century Gothic", Font.BOLD, 18);
        UIManager.put("Button.font", f);

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);


//      --- Estructura
        btnEscape = new JButton("Escape");
        c.weightx = .5;
        c.ipady = 20;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.gridx = 0;
        c.gridy = 0;
        add(btnEscape, c);

        opt = new RegistroMaterial_OPT();

        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        opt.setBackground(Color.black);

        JScrollPane scroll = new JScrollPane(opt);
        scroll.setBackground(Color.black);
        scroll.setWheelScrollingEnabled(true);

        add(scroll, c);

        btnConfirmar = new JButton("Confirmar");
        c.weightx = .5;
        c.weighty = 0;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        c.ipadx = 120;
        c.ipady = 50;
        c.gridx = 0; c.gridy = 2;
        add(btnConfirmar, c);

        btnConfirmar.addActionListener(e -> {

        });

        btnEscape.addActionListener(e -> {
            vista.setMenu(vista.getMenu());
        });
    }

    public void agregarMaterial(int fila) {
        opt.removeAll();
        int w = (opt.getWidth() / fila) -20;
        System.out.println(opt.getWidth() + " " + fila + " " + w);
        final int[] i = {0};
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(20, 0, 0, 0);
        materiales.forEach(m -> {
            c.weightx = 1;
            c.anchor = GridBagConstraints.CENTER;
            c.gridx = i[0] % fila;
            c.gridy = i[0] / fila;
            opt.add(new Material_visual(m, w), c);
            i[0]++;
        });
        opt.revalidate();
        opt.repaint();
    }
}
