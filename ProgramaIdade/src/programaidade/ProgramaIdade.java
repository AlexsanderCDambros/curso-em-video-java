package programaidade;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Alexsander Chagas Dambros
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Ano de nascimento: ");
        int nasc = t.nextInt();
        Calendar hoje = Calendar.getInstance();
        int i = hoje.get(Calendar.YEAR) - nasc;
        System.out.println("Sua idade é " + i);
        if (i>=18) {
            System.out.println("Maior de Idade");
        }
        else{
            System.out.println("Menor de Idade");
        }
        
    }
    
}
