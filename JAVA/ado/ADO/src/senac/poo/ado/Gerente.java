package senac.poo.ado;

public class Gerente extends Funcionario implements Prioridade {
    
    String departamento;
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }
}
