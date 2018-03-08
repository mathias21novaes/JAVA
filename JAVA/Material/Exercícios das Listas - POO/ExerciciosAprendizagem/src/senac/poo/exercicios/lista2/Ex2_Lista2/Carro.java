package senac.poo.exercicios.lista2.Ex2_Lista2;

public class Carro {
    
    String fabricante, modelo, cor;
    int pot_motor, quant_portas;
    boolean est_motor = false, est_portas = false;
    
    void mostrarCaracteristicas(){
        System.out.println("CARACTERÍTICAS DO CARRO:");
        System.out.println("----> MODELO: " +modelo);
        System.out.println("----> COR: " +cor);
        System.out.println("----> FABRICANTE: " +fabricante);
        System.out.println("----> QUANT. DE PORTAS: " +quant_portas);
        
    }
    
    void ligarCarro(){
        if(est_portas == true){
            est_motor = true;
            System.out.println("\nAs portas estão fechadas\nO carro pode ser ligado!");
            System.out.println("O carro está ligado . . .");
            System.out.println("O CARRO ESTÁ LIGADO, PODE DIRIGIR!");
        }
        else{
            est_motor = false;
            System.out.println("\nAs portas estão abertas\nO carro não pode ser ligado!");
            System.out.println("Feche as portas do carro !");
        }
    }
    
    void fecharPortas(boolean portas){
        est_portas = portas;
    }
    
    void desligarCarro(){
        
    }
    
    void acelerarCarro(){
        
    }
    
    void desacelerarCarro(){
        
    }
    
    void frear(){
        
    }
}
