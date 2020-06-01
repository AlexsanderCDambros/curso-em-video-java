/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author User
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Repetição com for

        for (int i = 0; i <= 100; i+=10) {
            System.out.println("Cambalhota " + i);
        }
        */
        
        System.out.println("<html><body><table>");
        for (int i = 0; i < 10; i++) {
            System.out.println("<tr>");
            for (int j = 0; j < 10; j++) {
                System.out.println("<td>" + i+j + "</td>");
            }
            System.out.println("</tr>");
        }
        System.out.println("</table></body></html>");
    }

}
