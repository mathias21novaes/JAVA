package senac.poo.exercicios.lista2.Ex1_Lista2;

public class Programa_Motor {
    
    public static void main(String[] args){
        
        Motor mathuas = new Motor();
        
        mathuas.fabricante = "Ford";
        mathuas.velocidade = 0;
        mathuas.voltagem = 10;
        mathuas.estado = false;
        
        mathuas.mostrarCaracteristicas("AGFERXC", 758426341);
        mathuas.ligaMotor();
        mathuas.aumentaVelocidade(20);
        mathuas.diminuiVelocidade(5);
        mathuas.aumentaVelocidade(10);
        mathuas.diminuiVelocidade(15);
        mathuas.diminuiVelocidade(100);
        mathuas.diminuiVelocidade(100);
        mathuas.diminuiVelocidade(5000);
        //mathuas.diminuiVelocidade(15);
        
        mathuas.desligaMotor();
    }
    
}
