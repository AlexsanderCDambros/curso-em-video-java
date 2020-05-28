package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Alexsander Chagas Dambros
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        //ENTRADA DE DADOS
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno ");
        float nota = teclado.nextFloat();
        
        //SAIDA DE DADOS
        // print
        System.out.print("A nota de " + nome + " é " + nota);
        System.out.println(""); // Para quebrar a linha
        
        //println - ln quebra a linha
        System.out.println("A nota de " + nome + " é " + nota);
        
        //printf
        /* %s - String
         * %f - float
         * \n - quebra de linha
         */
        System.out.printf("A nota de %s é %.2f \n",nome,nota);
        
        //format = printf 
        System.out.format("A nota de %s é %.2f \n",nome,nota);
    }
    
}
