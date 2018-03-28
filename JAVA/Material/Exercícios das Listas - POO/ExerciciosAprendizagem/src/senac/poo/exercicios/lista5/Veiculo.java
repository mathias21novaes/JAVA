package senac.poo.exercicios.lista5;

public class Veiculo {
    
    protected int anoFabri, valor;
    protected String cor, marca, modelo;
    
    public Veiculo(String marca, String modelo, String cor, int anoFabri, int valor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabri = anoFabri;
        this.valor =  valor;
    }
    
    public void setVeiculo(String marca, String modelo, String cor, int anoFabri, int valor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabri = anoFabri;
        this.valor =  valor;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public int getAno(){
        return this.anoFabri;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public void venda(){
        System.out.println("O veiculo está a venda");
    }
}
