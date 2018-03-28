package senac.poo.ado;

public class Funcionario {
  
    private int codigo;
    private String nome, endereco;
    
    public void setfuncionario(String nome, int codigo, String endereco){
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
