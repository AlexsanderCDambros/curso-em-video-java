/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = {3, 7, 6, 1, 9, 4, 2};
        Arrays.sort(v);
        int p = Arrays.binarySearch(v,3);
        System.out.println("Posição " + p);
    }
     
}
