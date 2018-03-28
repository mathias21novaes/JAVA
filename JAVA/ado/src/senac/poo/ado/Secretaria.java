package senac.poo.ado;

public class Secretaria extends Funcionario implements Prioridade{
    
    String idioma;
    
    public Secretaria(String nome, int codigo, String endereco, String idioma){
        super(nome, codigo, endereco);
        this.idioma = idioma;
    }
    
    public boolean autentica(){
        if(idioma == "ingles")
            return true;
        else
            return false;
    }
    
    public void imprimeDados() {
        
	System.out.println("Função: Secretaria");
        System.out.println("Nome: " +nome);	
	System.out.println("Código do Trabalhador: " +codigo);
	if(autentica() == true)
            System.out.println("Fluente em Inglês");
        else
            System.out.println("Não fala Inglês");
	System.out.println("Endereço: " +endereco+ "\n");	
    }
    
    public void setIdoma(String idioma){
        this.idioma = idioma;
    }
    
    public String getIdioma(){
        return this.idioma;
    }
    
}
