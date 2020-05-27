package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Alexsander Chagas Dambros
 */
public class ResolucaoDaTela {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d= tk.getScreenSize();
        System.out.print("A resolução da sua tela é ");
        System.out.println((int)d.getWidth() + " x " + (int)d.getHeight() + ".");
    }
    
}
