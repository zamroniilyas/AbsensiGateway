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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import javax.accessibility.Accessible;
import javax.swing.JButton;


/**
 *
 * @author Rony
 */
public class ButtonTransparan extends JButton implements Accessible{
    private Shape shape;
    private Paint paint;
    private Paint glass;
    private boolean over;
    private boolean press;
    private MySound sound = new MySound();

    public ButtonTransparan() {
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                setOver(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setOver(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setPress(true);
                sound.playSound("buttonPress.wav");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setPress(false);
            }

        });

    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
        repaint();
    }

    public boolean isPress() {
        return press;
    }

    public void setPress(boolean press) {
        this.press = press;
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {            
        Graphics2D graphics2D=(Graphics2D) g.create();

        shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), getHeight(), getHeight());

        if(isOver()){
            paint=new GradientPaint(0, 0, new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 0),
                    0, getHeight(), new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 125));
            if(isPress()){
                paint=new GradientPaint(0, 0, new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 0),
                    0, getHeight(), new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 40));
            }
        }else{
            paint=new GradientPaint(0, 0, new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 125),
                    0, getHeight(), new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 0));
        }

        graphics2D.setPaint(paint);
        graphics2D.fill(shape);
                
        glass=new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0.5F), 0, getHeight(), new Color(1F, 1F, 1F, 0F));

        graphics2D.setPaint(paint);
        graphics2D.fill(shape);

        super.paintComponent(g);

        graphics2D.dispose();        
    }   
}