/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Rony
 */
public class PanelBackground extends JPanel{
    
    private Image image;
    private String url_background;

    public String getUrl_background() {
        return url_background;
    }

    public void setUrl_background(String url_background) {
        this.url_background = url_background;
    }
    
    public PanelBackground() {
        setOpaque(false);
        url_background = "/absensi/component/wallpaper/coba2.jpg";
        image = new ImageIcon(getClass().getResource(url_background)).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D gd = (Graphics2D) g.create();

        gd.drawImage(image, 0, 0, null);

        gd.dispose();
    }
}
