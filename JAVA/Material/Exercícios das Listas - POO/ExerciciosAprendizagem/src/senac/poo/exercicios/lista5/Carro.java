package senac.poo.exercicios.lista5;

public class Carro extends Veiculo {
    
    private int kmRodado, quant_portas;
    private boolean arCond, direcaoHidra;
    
    
    public Carro(String marca, String modelo, String cor, int anoFabri, int valor, int km, int quant_portas, boolean arCond, boolean direcaoHidra){
        super(marca, modelo, cor, anoFabri, valor);
        this.kmRodado = km;
        this.quant_portas = quant_portas;
        this.arCond = arCond;
        this.direcaoHidra = direcaoHidra;
    }
    
    
    public void setKm(int km){
        this.kmRodado = km;
    }
    
    public void setPortas(int portas){
        this.quant_portas = portas;
    }
    
    public void setAr(boolean ar){
        this.arCond = ar;
    }
    
    public void setDirecao(boolean direcao){
        this.direcaoHidra = direcao;
    }
    
    public int getKm(){
        return this.kmRodado;
    }
    
    public int getPortas(){
        return this.quant_portas;
    }
    
    public boolean getAr(){
        return this.arCond;
    }
    
    public boolean getDirecao(){
        return this.direcaoHidra;
    }
}
