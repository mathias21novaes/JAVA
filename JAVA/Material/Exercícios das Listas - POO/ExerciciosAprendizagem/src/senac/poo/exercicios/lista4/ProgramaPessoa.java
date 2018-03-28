package senac.poo.exercicios.lista4;

public class ProgramaPessoa {
    
    public static void main(String[] agrs){
        
        Fornecedor forn1 = new Fornecedor("Matheus", "Avenida Kennedy", "942581777", 0.00, 0.00);
        
        forn1.apresentacao();
        forn1.imprimir();
        
        forn1.obterSaldo();
        forn1.setValores(7850.90, 2586.20);
        forn1.obterSaldo();
        //forn1.getCredito();
        //forn1.getDivida();
        //forn1.obterSaldo();
    }
   
}
