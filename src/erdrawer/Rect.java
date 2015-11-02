/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erdrawer;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
/**
 *
 * @author Wayne
 */
public class Rect {
    Page parent;
    Rect(Page p,Point p1,Point p2,boolean b,Color c)
    {
        parent = p;
        Color color;
        Graphics g=Rect.this.parent.getGraphics();
        if(b==true)
        {
            color=new Color(this.parent.getBackground().getRed()^c.getRed(),this.parent.getBackground().getGreen()^c.getGreen(),this.parent.getBackground().getBlue()^c.getBlue());
            g.setXORMode(color);
            g.drawLine(p1.x, p1.y, p1.x, p2.y);
            g.drawLine(p1.x, p2.y, p2.x, p2.y);
            g.drawLine(p1.x, p1.y, p2.x, p1.y);
            g.drawLine(p2.x, p1.y, p2.x, p2.y);
        }
        else if(b==false)
        {
            g.setPaintMode();
            g.setColor(c);
            g.drawLine(p1.x, p1.y, p1.x, p2.y);
            g.drawLine(p1.x, p2.y, p2.x, p2.y);
            g.drawLine(p1.x, p1.y, p2.x, p1.y);
            g.drawLine(p2.x, p1.y, p2.x, p2.y);
        }
    }
    
}
