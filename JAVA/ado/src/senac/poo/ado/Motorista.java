package senac.poo.ado;

public class Motorista extends Funcionario {
    
    int CNH;
    
    public Motorista(String nome, int codigo, String endereco, int cnh){
        super(nome, codigo, endereco);
        this.CNH = cnh;
    }
    
    public void imprimeDados() {
        
	System.out.println("Função: Motorista");
        System.out.println("Nome: " +nome);	
	System.out.println("Código do Trabalhador: " +codigo);
	System.out.println("CREA: " +CNH);
	System.out.println("Endereço: " +endereco+ "\n");	
    }
    
    public void setCNH(int cnh){
        this.CNH = cnh;
    }
    
    public int getCNH(){
        return this.CNH;
    }
}
