package senac.poo.exercicios.lista4;

public class Pessoa {
    
    protected String nome, endereco, telefone;
    
    Pessoa(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public void setPessoa(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public void apresentacao(){
        System.out.println("Apresento os fornecedores e suas dividas (caso tenham): \n");
    }
    
    public String getPessoaNome(){
        return this.nome;
    }
    
    public String getPessoaEndereco(){
        return this.endereco;
    }
    
    public String getPessoaTelefone(){
        return this.telefone;
    }
}
