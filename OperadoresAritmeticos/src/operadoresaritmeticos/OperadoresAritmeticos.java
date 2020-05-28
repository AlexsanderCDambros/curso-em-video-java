package operadoresaritmeticos;

/**
 *
 * @author Alexsander Chagas Dambros
 */
public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        // Média aritmética
        System.out.println("Média aritmética");
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);
        
        System.out.println("");
        // Pós Incremento++ -- |-> Faz a operação antes da incre/decrementação
        System.out.println("Pós Incremento");
        int numero = 5;
        int valor = 5 + numero++;
        System.out.println(valor);
        System.out.println(numero);
        
        System.out.println("");
        // Pré Incremento++ -- |-> Faz a incre/decrementação antes da operação
        System.out.println("Pré Incremento");
        int numero2 = 5;
        int valor2 = 5 + ++numero2;        
        System.out.println(valor2);
        System.out.println(numero2);
        
        System.out.println("");
        // a[operador]=b
        System.out.println("a[operador]=b");
        int a = 2;
        int b = 3;
        a += b;
        //a -= b;
        //a *= b;
        //a /= b;
        System.out.println(a);
        
        System.out.println("");
        //Arredondamentos
        System.out.println("Arredondamentos");
        float v = 8.3f;
        System.out.println("Valor " + v);
        System.out.println("Para Baixo " + (int) Math.floor(v));
        System.out.println("Para Cima " + (int) Math.ceil(v));
        System.out.println("Aritmético/Normal " + (int) Math.round(v));
        
        System.out.println("");
        //Valor Absoluto
        System.out.println("Valor Absoluto");
        float abs = -8.95f;
        System.out.println("Valor " + abs);
        System.out.println("Vlor Absoluto " + Math.abs(abs));
        
        System.out.println("");
        //Valor Randômico
        System.out.println("Valor Randômico");
        double ale = Math.random();
        System.out.println("Aleatório padrão, de 0 até 1: " + ale);
        int min = 0;
        int max = 50;
        int ale2 = (int) (min + ale * (max-min));
        System.out.println("Aleatório parametrizado min:" + min + " max:" + max + " Valor:" + ale2);
    }
    
}
