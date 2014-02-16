/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Chromatics
 */
public class PanelTransparanRect extends JPanel{
     
    private Color warna;

    public PanelTransparanRect() {
        setOpaque(false);
        warna = new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 127);
    }

    @Override
    public void setBackground(Color bg) {
        super.setBackground(bg);

        warna = new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 127);

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D gd = (Graphics2D) g.create();

        gd.setColor(warna);
        gd.fillRect(0, 0, getWidth(), getHeight());
//        gd.fillRect(0, 0, getWidth(), getHeight(), 50, 50);

        gd.dispose();
    }
}
