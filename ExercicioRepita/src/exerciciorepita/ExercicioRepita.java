/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Coloca uma mensagem na tela
        //JOptionPane.showMessageDialog(null, "Olá Mundo", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);

        /*
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: ")); //Pede um valor
        JOptionPane.showMessageDialog(null, "O valor Informado foi: " + n); // Imprime um valor
         */
        // Total - Pares - Impares - Acima de 100 - Média dos Valores
        // 0 Interrompe
        int n = 0;
        int s = 0;
        int tP = 0;
        int tI = 0;
        int m100 = 0;
        int m = 0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html><b>Informe um valor:</b> <br /> (0 Interrompe) </html>",
                "Entrada de Valores",
                JOptionPane.INFORMATION_MESSAGE
            ));
            if (n != 0) {
                s += n;
                if (n % 2 == 0) {
                    tP++;
                } else {
                    tI++;
                }
                if (n > 100) {
                    m100 ++;
                }
            }
        } while (n != 0);
        m = s/(tP + tI);
        
        JOptionPane.showMessageDialog(null, 
                "<html><h1>Resultado</h1> <hr />"
                        + "Soma dos valores: " + s
                        + "<br />Total pares: " + tP
                        + "<br />Total ímpares: " + tI
                        + "<br />Maiores que 100: " + m100
                        + "<br />Média dos valores:" + m
                        + "</html>"
            ,"Resultado"
            ,JOptionPane.INFORMATION_MESSAGE);
    }
    
}
