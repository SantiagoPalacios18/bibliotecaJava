package vista.panels;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class RegistroInicioSesion extends JPanel{
    private JPanel contenedorCentral;
    private CardLayout cardLayout;
    
    // JPanel Principal: Botones de registro e iniciar sesion
    public RegistroInicioSesion() {
        cardLayout = new CardLayout();
        contenedorCentral = new JPanel(cardLayout);
        
        setLayout(new BorderLayout());
        add(contenedorCentral, BorderLayout.CENTER);
        // Los 3 paneles que vamos a usar
        contenedorCentral.add(crearPanelMenu(), "MENU");
        contenedorCentral.add(crearPanelRegistro(), "REGISTRO");
        contenedorCentral.add(crearPanelSesion(), "SESION");
        // Al inciio se muestra el panel MENU
        cardLayout.show(contenedorCentral, "MENU");
    
    }

    private JPanel crearPanelMenu() {
        JPanel menu = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);

        JButton btnRegistrarse = crearBotonRedondeado("Registrarse", 15);
        c.ipadx = 530;
        c.ipady = 60;
        c.insets = new Insets(50, 5, 50, 5);
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0; c.gridy = 0;
        menu.add(btnRegistrarse, c);
        JButton btnIniciarSesion = crearBotonRedondeado("Iniciar Sesion", 15);
        c.ipadx = 520;
        c.ipady = 60;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0; c.gridy = 1;
        menu.add(btnIniciarSesion, c);

        // Acción para cambiar de panel
        btnRegistrarse.addActionListener(e -> cardLayout.show(contenedorCentral, "REGISTRO"));

    

        btnRegistrarse.setFocusPainted(false);
        btnRegistrarse.setBorderPainted(false);


        btnIniciarSesion.setFocusPainted(false);
        btnIniciarSesion.setBorderPainted(false);
        
        
        return menu;
    }

    // --- PANEL 2: EL REGISTRO ---
    private JPanel crearPanelRegistro() {
        JPanel registro = new JPanel();
        registro.add(new JLabel("Aquí 💥 tus campos de texto de registro"));
        
        JButton btnVolver = new JButton("Volver al Menú");
        btnVolver.addActionListener(e -> cardLayout.show(contenedorCentral, "MENU"));
        registro.add(btnVolver);
        
        return registro;
    }
    private JPanel crearPanelSesion() {
        JPanel sesion = new JPanel();
        sesion.add(new JLabel("Aquí irán tus campos de texto de registro"));
        
        JButton btnVolver = new JButton("Volver al Menú");
        btnVolver.addActionListener(e -> cardLayout.show(contenedorCentral, "MENU"));
        sesion.add(btnVolver);
        
        return sesion;
    }

    private JButton crearBotonRedondeado(String texto, int radio) {
        JButton boton = new JButton(texto) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(getModel().isPressed() ? getBackground().darker() : getBackground());
                g2.fill(new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, radio, radio));
                g2.dispose();
                super.paintComponent(g);
            }
            @Override
            public boolean contains(int x, int y) {
                return new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, radio, radio).contains(x, y);
            }
        };

        boton.setBackground(Color.decode("#a0a0a0"));
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Arial", Font.BOLD, 30));
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setOpaque(false);
        boton.setBorder(new EmptyBorder(10, 20, 10, 20));
        
        return boton;
    }

    
}



/*
boton.setBackground(Color.decode(listaColores.get("Boton")));
boton.setFocusPainted(false);
boton.setBorderPainted(false); // No usar el borde predeterminado
boton.setContentAreaFilled(false); // No rellenar el área de contenido estándar
boton.setOpaque(false); // Hacer el botón transparente para que se vea el fondo redondeado

// Margen interno para el texto
boton.setBorder(new EmptyBorder(10, 20, 10, 20));
boton.setFont(new Font("Arial", Font.BOLD, 30));
boton.setForeground(Color.WHITE); // Color del texto
boton.setHorizontalAlignment(SwingConstants.CENTER);
return boton;
*/