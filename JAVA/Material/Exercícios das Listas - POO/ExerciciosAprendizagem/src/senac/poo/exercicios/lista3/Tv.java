package senac.poo.exercicios.lista3;

public class Tv {
    
    //Atributos
    private String marca;
    private double preco;
    public boolean ligar;
    
    //Construtor
    Tv(String marca, double preco, boolean ligar){
        this.marca = marca;
        this.preco = preco;
        this.ligar = ligar;
    }
    
    void ligarTv(){
        if(ligar == true){
            System.out.println("A TV foi ligada");
        }
        else{
            System.out.println("A TV está desligada");
        }
        
    }
    
    //Metodos Stters
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    //Metodos Getters
    public String GetMarca(){
        return this.marca;
    }
    
    public double Getpreco(){
        return this.preco;
    }
}
