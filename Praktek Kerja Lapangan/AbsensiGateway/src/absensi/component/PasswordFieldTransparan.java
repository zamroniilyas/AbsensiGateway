/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.component;

import absensi.component.sound.MySound;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Rony
 */
public class PasswordFieldTransparan extends JPasswordField{
    
    private Paint glass;
    private Paint transparan;
    private Shape shape;
    private boolean fokus;
    private MySound sound = new MySound();
    
    public PasswordFieldTransparan() {        
        setOpaque(false);
        setBorder(new EmptyBorder(3, 3, 3, 3));

         addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                setFokus(true);
                sound.playSound("buttonPress.wav");
            }

            @Override
            public void focusLost(FocusEvent e) {
                setFokus(false);
            }

        });
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gd=(Graphics2D) g.create();

        shape=new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), getHeight(), getHeight());

        if(isFokus()){
            transparan=new GradientPaint(0, 0, new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 125),
                    getWidth(), 0, new Color(255, 255, 255,0));
        }else{
            transparan=new GradientPaint(0, 0, new Color(255,255,255,0),
                    getWidth(), 0, new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 125));
        }

        gd.setPaint(transparan);
        gd.fill(shape);
                
        glass=new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0.5F), 0, getHeight(), new Color(1F, 1F, 1F, 0F));
        
        super.paintComponent(g);

        gd.setPaint(glass);
        gd.fill(shape);
        
        gd.dispose();
    }

    public boolean isFokus() {
        return fokus;
    }

    public void setFokus(boolean fokus) {
        this.fokus = fokus;
        repaint();
    }

    public Paint getGlass() {
        return glass;
    }

    public void setGlass(Paint glass) {
        this.glass = glass;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Paint getTransparan() {
        return transparan;
    }

    public void setTransparan(Paint transparan) {
        this.transparan = transparan;
    }
}
