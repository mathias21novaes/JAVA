package senac.poo.ado;

public class Engenheiro extends Funcionario {
    
    private int CREA;
    
    public Engenheiro(String nome, int codigo, String endereco, int crea){
        super(nome, codigo, endereco);
        this.CREA = crea;
    }
    
    public void imprimeDados() {
        
	System.out.println("Função: Engenheiro");
        System.out.println("Nome: " +nome);	
	System.out.println("Código do Trabalhador: " +codigo);
	System.out.println("CREA: " +CREA);
	System.out.println("Endereço: " +endereco+ "\n");	
    }
    
    public void setCREA(int crea){
        this.CREA = crea;
    }
    
    public int getCREA(){
        return this.CREA;
    }
}
