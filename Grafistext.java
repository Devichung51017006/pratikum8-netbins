package grafistext;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;
public class Grafistext extends Panel{
    Font f;
    String text= "HALO KHARISMA";
    Grafistext(){
    setBackground(Color.GRAY);
}
    public void paint(Graphics g) {
        f = new Font("Helvitica", Font.BOLD,48);
        //kotak hijau
        g.setColor(Color.GREEN);
        g.fillRect(7, 8, 455, 105);
        //warna hitam pinngiran
        g.setColor(Color.BLACK);
        g.drawRect(7, 8, 455, 105);
        g.setColor(Color.pink);
        g.fillOval(10, 10, 450, 100);
        //diberi pinggiran warna merah tebal (3X)
        g.setColor(Color.red);
        g.drawOval(10, 10, 450, 100);
        g.drawOval(9, 9, 450, 100);
        g.drawOval(8, 8, 450, 100);
        //tulisan warna hitam dengan font helvetica
        g.setColor(Color.BLACK);
        g.setFont(f);
        g.drawString(text, 40, 75);
    }
    public static void main(String[] args) {
        Frame f = new Frame("Testing Graphics Panel");
        Grafistext gp = new Grafistext();
        f.add(gp);
        f.setSize(900, 900);
        f.setVisible(true);
    }
    

}

