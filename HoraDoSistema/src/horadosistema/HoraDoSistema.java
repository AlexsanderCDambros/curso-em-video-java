package horadosistema;

import java.util.Date;

/**
 *
 * @author Alexsander Chagas Dambros
 */
public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.print("A date e hora do sistema é ");
        System.out.println(relogio.toString()+".");
    }
    
}
