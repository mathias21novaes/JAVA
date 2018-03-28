package senac.poo.exercicios.lista5;

public class Moto extends Veiculo {
    
    private int cilindrada;
    private boolean abs;
    
    
    public Moto(String marca, String modelo, String cor, int anoFabri, int valor, int cilindrada, boolean abs){
        super(marca, modelo, cor, anoFabri, valor);
        this.cilindrada = cilindrada;
        this.abs = abs;
    }
    
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
    
    public void setAbs(boolean abs){
        this.abs = abs;
    }
    
    public int getCilindrada(){
        return this.cilindrada;
    }
    
    public boolean getAbs(){
        return this.abs;
    }
    
}
