/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String resp;
        Scanner t = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            n = t.nextInt();
            s += n;
            System.out.print("Quer Continuar? [S/N]: ");
            resp = t.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é: " + s);
    }
    
}
