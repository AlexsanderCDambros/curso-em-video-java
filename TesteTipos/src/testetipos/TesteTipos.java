/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author Alexsander Chagas Dambros
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Converte int para String
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        // Converte String para int
        String valor2 = "40";
        int Idade = Integer.parseInt(valor2);
        System.out.println(Idade);
        
        // Converte String para float
        String valor3 = "50";
        float idade2 = Float.parseFloat(valor3);
        System.out.println(idade2);
        
        // Converte float para String
        float idade3 = 60.00f;
        String valor4 = Float.toString(idade3);
        System.out.println(valor4);
    }
    
}
