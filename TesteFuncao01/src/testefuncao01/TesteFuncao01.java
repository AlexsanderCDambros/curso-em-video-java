/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author User
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static void soma01(int a, int b) {
        int s = a+b;
        System.out.println("A soma01 é: " + s);
    }
    
    static int soma02(int a, int b) {
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Executando...");
        soma01(5,2);
        int sm = soma02(5, 7);
        System.out.println("soma02 retornou: " + sm);
    }
    
}
