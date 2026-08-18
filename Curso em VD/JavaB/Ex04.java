package JavaB;

import java.awt.*;
import java.awt.font.GraphicAttribute;
import java.awt.font.ImageGraphicAttribute;
import java.util.Locale;
//import java.util.Date;


public class Ex04 {
    static void main(String[] args) {

//        Date data = new Date();
//        System.out.println("A hora do sistema e: ");
//        System.out.println(data.toString());


//        Locale.getDefault();
//        System.out.println("A limgua e ");
//        System.out.println(Locale.getDefault());

//            Toolkit tk  = Toolkit.getDefaultToolkit();
//            Dimension D = tk.getScreenSize();
//        System.out.println("Scren widt"+D.width);
//        System.out.println("Scren Height"+D.height);
//            EX siples so pra entender


        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        System.out.println("Sua tela tem resolução " + lar + " x " + alt); // Esse e o "certo"
        }
    }