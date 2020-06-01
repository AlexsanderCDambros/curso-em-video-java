/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // foreach
        double v[] = {3.5, 2.75, 9, -4.83};
        
        // Colocar vetor em ordem
        Arrays.sort(v);
        
        for (double d : v) {
            System.out.println(d);
        }
    }
}
