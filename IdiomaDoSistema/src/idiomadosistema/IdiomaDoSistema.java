package idiomadosistema;

import java.util.Locale;

/**
 *
 * @author User
 */
public class IdiomaDoSistema {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.print("O idioma do seu sistema é ");
        System.out.println(idioma.getDisplayLanguage() + ".");
    }
    
}
