package ado1.fibonacci;
package Fibonacci;
import java.util.Scanner;

public class ProgramaFibonacci {
    
    public static void main(String[]args){
        
        Scanner valor = new Scanner(System.in);
        System.out.print("Digite um valor para calcular Fibonacci: ");
        int x = valor.nextInt();
        
        Fibonacci fib = new Fibonacci();
        int x = fib.calculaFibonacci();
        System.out.println(x);
        
    }
}
