package programacambalhota;

/**
 *
 * @author Alexsander Chagas Dambros
 */
public class ProgramaCambalhota {

    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 1;
        while (cc<=10) {      
            if (cc==3 || cc == 6) {
                cc++;
                continue; //Interrompe o ciclo atual e começa um novo ciclo, mas continua no laço.
            }
            if (cc==7) {
                break; //Interrompe o laço.
            }
            System.out.println("Cambalhota " + cc++);
        }
    }
    
}
