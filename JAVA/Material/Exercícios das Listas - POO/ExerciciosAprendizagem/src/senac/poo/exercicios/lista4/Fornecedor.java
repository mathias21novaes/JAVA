package senac.poo.exercicios.lista4;

public class Fornecedor extends Pessoa{
    
    private double valorCredito, valorDivida, saldo;
    
    Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida){
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }
    
    public void setValores(double valorCredito, double valorDivida){
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }
    
    public double getCredito(){
        return this.valorCredito;
    }
    
    public double getDivida(){
        return this.valorDivida;
    }
    
    public void obterSaldo(){
        this.saldo = valorCredito -  valorDivida;
        System.out.println("Credito: "+getCredito());
        System.out.println("Credito: "+getDivida());
        System.out.println("Seu saldo atual disponível é: "+saldo);
    }
    
    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Telefone: "+telefone);
    }
}
