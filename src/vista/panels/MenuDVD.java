package vista.panels;

import javax.swing.*;
import java.awt.*;

public class MenuDVD {
    private JPanel menu;

    public MenuDVD() {
        menu = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
    }
}
