package ado1.fibonacci;

public class Fibonacci {
    
    static int calculaFibonacci(int x){
        if(x == 1 || x == 2){
            return 1;
        }
        else{
            return calculaFibonacci(x-1) + calculaFibonacci(x-2);
        }
    }   
}
