/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Esse ano é bisexto? [S/N]: ");
        boolean bi = t.next().equals("S");
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul",
            "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, bi ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < mes.length; i++) {
            System.out.println("O mês de " + mes[i] + " tem " + tot[i]
                    + " dias ao todo.");
        }
    }

}
