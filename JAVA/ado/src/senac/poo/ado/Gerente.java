package senac.poo.ado;

public class Gerente extends Funcionario {
    
    String departamento;
    
    public Gerente(String nome, int codigo, String endereco, String departamento){
        super(nome, codigo, endereco);
        this.departamento = departamento;
    }
    
    public boolean autentica(){
        if(departamento == "rh" || departamento == "compras" || departamento == "pessoal")
            return true;
        else
            return false;
    }
    
    public void imprimeDados() {
        
	System.out.println("Função: Gerente");
        System.out.println("Nome: " +nome);	
	System.out.println("Código do Trabalhador: " +codigo);
	if(autentica() == true)
            System.out.println("Faz parte do departamento: " +departamento);
        else
            System.out.println("Não faz parte de nenhum departamento");
	System.out.println("Endereço: " +endereco+ "\n");	
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }
}
