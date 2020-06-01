/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testefuncao02;

/**
 *
 * @author User
 * @author Alexsander Chagas Dambros
 */
public class Operacoes {

    public static String contador(int i, int f) {
        String s = "";
        for (int j = i; j <= f; j++) {
            s += j + " ";
        }
        return s;
    }
}
