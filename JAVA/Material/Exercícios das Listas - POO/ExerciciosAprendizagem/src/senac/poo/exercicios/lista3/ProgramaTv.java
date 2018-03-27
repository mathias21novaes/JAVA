package senac.poo.exercicios.lista3;

public class ProgramaTv {
    
    public static void main(String[] args){
        
        Tv televisao = new Tv("none", 00.00, false);
        
        televisao.setMarca("Samsung");
        televisao.setPreco(4528.36);
        televisao.ligar = true;
        
        televisao.ligarTv();
        
        System.out.println(televisao.GetMarca());
        System.out.println(televisao.Getpreco());
    }
}
