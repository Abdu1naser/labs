import javax.swing.*;
import java.awt.*;

public class labfor7 {
    public static void main(String[] args) {
        JFrame fr=new JFrame();
        fr.setBounds(10,10,500,500);
        fr.setDefaultCloseOperation(3);
        JPanel pe=new JPanel()
        {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.red);

                g.fillRect(10,10,100,100);


            }

        };
        fr.add(pe);
        fr.setVisible(true);
    }



}
