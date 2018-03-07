package senac.poo.ado2;

public class Fibonacci {
    
    int calFibonacci(int valor) {
        
        if(valor < 2)   
            return valor;
        
        else if (valor == 0)
            return 0;
        
        else {       
            int resultado = calFibonacci(valor - 1) + calFibonacci(valor - 2);
            return resultado;
        }
    }
}
    