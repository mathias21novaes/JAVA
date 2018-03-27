package senac.poo.exercicios.lista2;

public class Programa_Carro {
    
    public static void main(String[] args){
        
        Carro corsa = new Carro();
        
        corsa.modelo = "Corsa Sedan";
        corsa.cor = "Vermelho";
        corsa.fabricante = "Chevrolet";
        corsa.quant_portas = 2;
        
        corsa.mostrarCaracteristicas();
        corsa.fecharPortas(true);
        corsa.ligarCarro();
        corsa.acelerarCarro(20);
        corsa.acelerarCarro(15);
        corsa.desacelerarCarro(50);
        corsa.desacelerarCarro(50);
        corsa.desligarCarro(false);
    }
}
