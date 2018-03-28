package senac.poo.ado;

public class Secretaria extends Funcionario implements Prioridade {
    
    String idioma;
    
    public void setIdoma(String idioma){
        this.idioma = idioma;
    }
    
    public String getIdioma(){
        return this.idioma;
    }
    
    public boolean autentica(int senha){
        if(senha == 50){
            System.out.println("AUTORIZADO");
        }
        else
            System.out.println("ACESSO NEGADO");
    }
    
}
