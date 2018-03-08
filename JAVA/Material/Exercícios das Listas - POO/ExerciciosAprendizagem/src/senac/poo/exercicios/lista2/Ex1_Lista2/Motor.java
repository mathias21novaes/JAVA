package senac.poo.exercicios.lista2.Ex1_Lista2;

public class Motor {
    
    int velocidade;
    String fabricante;
    int voltagem;
    boolean estado = false;  

    void mostrarCaracteristicas(String chassi, int num_chassi){
        System.out.println("CARACTERISTICAS DO MOTOR:\n");
        System.out.println("Chassi: "+chassi+ "-" +num_chassi);
        System.out.println("Fabricante: " +fabricante);
        
    }
    
    void ligaMotor(){
        estado = true;
        System.out.println("\nTESTE DO MOTOR:");
        System.out.printf("\nO motor está ligado . . .\n");
        System.out.printf("VELOCIDADE ATUAL: %d/Rpm\n\n", +velocidade);
    }
    
    void desligaMotor(){
        estado = false;
        velocidade = 0;
        System.out.printf("\nO motor está desligado . . .\n");
        System.out.printf("VELOCIDADE ATUAL: %d/Rpm\n", +velocidade);
    }
    
    void aumentaVelocidade(int velo){
        this.velocidade += velo * voltagem;
        System.out.printf("Com %d/Volts. . .\n", +voltagem);
        System.out.printf("O motor está aumentando %d/Rpm na sua velocidade\n", +velocidade);
        System.out.printf("VELOCIDADE ATUAL: %d/Rpm\n", +velocidade);
        System.out.println("---------------------------------------");
    }
    
    void diminuiVelocidade(int velo){
        this.velocidade -= velo / voltagem;
        System.out.printf("Com %d/Volts. . .\n", +voltagem);
        System.out.printf("O motor está diminuindo %d/Rpm na sua velocidade\n", +velocidade);
        System.out.printf("VELOCIDADE ATUAL: %d/Rpm\n", +velocidade);
        System.out.println("---------------------------------------");
        
        if(velocidade <= 0){
            estado = false;
            System.out.println("\nO motor está desligado. . .\n OBS: Velocidade baixa !");
        }
    }
}

