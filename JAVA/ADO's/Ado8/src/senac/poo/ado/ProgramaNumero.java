package senac.poo.ado;

public class ProgramaNumero {
    
    public static void main(String[] args){
        
        NumeroInteiro num = new NumeroInteiro(0, 0, 0, 0);
        
        num.Soma(5, 10);
        num.Subtração(10, 15);
        num.Multiplicação(5, 3);
        num.Divisão(5, 0);
    }
}
