package senac.poo.ado;

public abstract class Funcionario {
  
    protected int codigo;
    protected String nome, endereco;
    
    
    public Funcionario(String nome, int codigo, String endereco){
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }
    
    public void imprimirApresentacao(){
        System.out.println("Aqui está a lista de funcionario:\n");
    }
    
    public void setFuncionario(String nome, int codigo, String endereco){
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
}
