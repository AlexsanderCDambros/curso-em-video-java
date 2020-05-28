/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Alexsander Chagas Dambros
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome1 = "Alex";
        String nome2 = "Alex";
        String nome3 = new String("Alex");
        String res;
        
        // Tipos Primitivos
        res = nome1==nome2?"Igual":"Diferente";
        System.out.println(res);
        
        // Classes Invólucro
        res = nome1.equals(nome3)?"Igual":"Diferente";
        System.out.println(res);
    }
    
}
