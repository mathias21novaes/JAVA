package senac.poo.exercicios.lista2;

public class Carro {
    
    String fabricante, modelo, cor;
    int pot_motor, quant_portas, velocidade, voltagem;
    boolean est_motor = false, est_portas = false;
    
    void mostrarCaracteristicas(){
        System.out.println("CARACTERÍTICAS DO CARRO:");
        System.out.println("----> MODELO: " +modelo);
        System.out.println("----> COR: " +cor);
        System.out.println("----> FABRICANTE: " +fabricante);
        System.out.println("----> QUANT. DE PORTAS: " +quant_portas);
        
    }
    
     void fecharPortas(boolean portas){
        est_portas = portas;
    }
     
    void ligarCarro(){
        if(est_portas == true){
            est_motor = true;
            System.out.println("\nAs portas estão fechadas\nO carro pode ser ligado!");
            System.out.println("O carro está ligando . . .");
            System.out.println("O CARRO ESTÁ LIGADO, PODE DIRIGIR!");
        }
        else{
            est_motor = false;
            System.out.println("\nAs portas estão abertas\nO carro não pode ser ligado!");
            System.out.println("Feche as portas do carro !");
        }
    }
    
    void desligarCarro(boolean portas){
        if(est_portas == true){
            est_motor = true;
            System.out.println("\nAs portas estão abertas\nO carro não pode ser desligado!");
            System.out.println("Feche as portas do carro !");
        }
        else{
            est_motor = false;
            System.out.println("\nAs portas estão fechadas\nO carro pode ser desligado!");
            System.out.println("O carro está desligando . . .");
            System.out.println("O CARRO ESTÁ DESLIGADO, OBRIGADO POR DIRIGIR!");
        }
    }
    
    void acelerarCarro(int velo){
        this.velocidade += velo * voltagem;
        System.out.printf("Com %d/Volts. . .\n", +voltagem);
        System.out.printf("O carro está aumentando %d/Rpm na sua velocidade\n", +velocidade);
        System.out.printf("VELOCIDADE ATUAL: %d/Rpm\n", +velocidade);
        System.out.println("---------------------------------------");
    }
    
    void desacelerarCarro(int velo){
        this.velocidade -= velo / voltagem;
        System.out.printf("Com %d/Volts. . .\n", +voltagem);
        System.out.printf("O carro está diminuindo %d/Rpm na sua velocidade\n", +velocidade);
        System.out.printf("VELOCIDADE ATUAL: %d/Rpm\n", +velocidade);
        System.out.println("---------------------------------------");
    }
    
    void frear(){
        
    }
}
