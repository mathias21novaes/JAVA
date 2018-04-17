package senac.poo.ado;
import java.*;

public class NumeroInteiro {
    
    public int soma, subtracao, multiplicacao, divisao;
    int valor1, valor2, valor3, valor4;
    
    public NumeroInteiro(int valor1, int valor2, int valor3, int valor4){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
        this.valor4 = valor4;
    }
    
    public void Soma(int valor1, int valor2){
        try{
            this.soma = valor1 + valor2;
            System.out.println("A soma deu: "+soma);
        }
        catch(ArithmeticException e){
            System.out.println("Exceção: "+e.getMessage());
        }
    }
    
    public void Subtração(int valor1, int valor2){
        try{
            this.subtracao = valor1 - valor2;
            System.out.println("A subtração deu: "+subtracao);
        }
        catch(ArithmeticException e){
            if(subtracao <= 0)
                System.out.println("Exceção: "+e.getMessage()); 
        }
    }
    
    public void Multiplicação(int valor1, int valor2){
        try{
            this.multiplicacao = valor1*valor2;
            System.out.println("A multiplicação deu: "+multiplicacao);
        }
        catch(ArithmeticException e){
            System.out.println("Exceção: "+e.getMessage()); 
        }
    }
    
    public void Divisão(int valor1, int valor2){
        try{
            this.divisao = valor1/valor2;
            System.out.println("A divisão deu: "+divisao);
        }
        catch(ArithmeticException e){
            System.out.println("Exceção: "+e.getMessage()); 
        }
    }
}
