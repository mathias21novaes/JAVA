package senac.poo.ado2;
import java.util.Scanner;

public class ProgramaFibonacci {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor a ser calculado: ");
        
        int x = entrada.nextInt();
	int y = 0;
		
	Fibonacci fib = new Fibonacci();
	int j = fib.calFibonacci(x);
	System.out.println(j);

    }
}
