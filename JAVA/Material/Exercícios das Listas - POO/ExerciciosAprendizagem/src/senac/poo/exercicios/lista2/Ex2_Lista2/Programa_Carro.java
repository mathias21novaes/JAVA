package senac.poo.exercicios.lista2.Ex2_Lista2;

public class Programa_Carro {
    
    public static void main(String[] args){
        
        Carro corsa = new Carro();
        
        corsa.modelo = "Corsa Sedan";
        corsa.cor = "Vermelho";
        corsa.fabricante = "Chevrolet";
        corsa.quant_portas = 2;
        
        corsa.mostrarCaracteristicas();
        corsa.fecharPortas(false);
        corsa.ligarCarro();
        
    }
}
