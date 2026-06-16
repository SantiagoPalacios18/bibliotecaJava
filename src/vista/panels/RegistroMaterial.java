package vista.panels;

import modelo.MaterialBiblioteca;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RegistroMaterial extends JPanel {
    private ArrayList<MaterialBiblioteca> materiales;
    JButton btnEscape;
    JPanel opt;
    JButton btnConfirmar;

    public RegistroMaterial(ArrayList<MaterialBiblioteca> materiales) {
        this.materiales = materiales;

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);


//      --- Estructura
        btnEscape = new JButton("Escape");
        c.weightx = .5;
        c.ipady = 20;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.gridx = 0; c.gridy = 0;
        add(btnEscape, c);

        opt = new JPanel(new GridBagLayout());
        GridBagConstraints c2 = new GridBagConstraints();
        c2.insets = new Insets(5, 5, 5, 5);
        c.weightx = .5;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        c.ipady = 200;
        c.gridx = 0; c.gridy = 1;
        add(opt, c);
        opt.setBackground(Color.black);

        agregarMaterial(c2);

        btnConfirmar = new JButton("Confirmar");
        c.weightx = .5;
        c.weighty = 0;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        c.ipady = 20;
        c.gridx = 0; c.gridy = 2;
        add(btnConfirmar, c);
    }

    public void agregarMaterial(GridBagConstraints c) {
        opt.removeAll();
        final int[] i = {0};
        materiales.forEach(m -> {
            c.weightx = .5;
            c.fill = GridBagConstraints.HORIZONTAL;
            c.anchor = GridBagConstraints.CENTER;
            c.gridx = i[0] % 3;
            c.gridy = i[0] / 3;
            opt.add(new Material_visual(m), c);
            i[0]++;
        });
        opt.revalidate();
        opt.repaint();
    }
}
