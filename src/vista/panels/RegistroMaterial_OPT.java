package vista.panels;

import javax.swing.*;
import java.awt.*;

public class RegistroMaterial_OPT extends JPanel implements Scrollable{
    public RegistroMaterial_OPT() {
        setLayout(new GridBagLayout());
    }

    public Dimension getPreferredScrollableViewportSize() {
        return getPreferredSize();
    }

    public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
        return 16;
    }

    public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
        return 64;
    }

    public boolean getScrollableTracksViewportWidth() {
        return true;
    }

    public boolean getScrollableTracksViewportHeight() {
        return false;
    }
}
