package textditengah;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Panel;

public class Textditengah extends Panel{
    Textditengah(){
        setBackground (Color.GRAY) ;
    }

    public void paint(Graphics g) {
    Font f = new Font ("Helvitica", Font.BOLD,48);
    FontMetrics fm = getFontMetrics(f);
    g.setFont(f);
    
    String S = "Teks ini tampil ditengah";
    int xpos = (this.size ().width - fm.stringWidth(S)) / 2;
    int ypos = (this.size().height) /2 ;
    g.drawString(S, xpos, ypos);
    }
    
    
    public static void main (String[] args){
        Frame f =  new Frame ("Texting Graphics Panel");
        Textditengah gp = new Textditengah();
        f.add(gp);
        f.setSize(600, 300);
        f.setVisible(true);
    }
    
}
