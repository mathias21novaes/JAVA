package senac.poo.exercicios.lista3;

public class Curso {
    
    public double codigo; 
    private int creditos;
    public String descricao;
    
    Curso(double codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    void entrarCurso(){
        if(creditos >= 375){
            System.out.println("Você entrou no curso");
            creditos = creditos - 375;
        }
        else
            System.out.println("CREDITOS INSUFICIENTE");
    }
    
    void sairCurso(){
        System.out.println("Você saiu do curso\n taxa a pagar: 200");
        creditos = creditos - 200;
    }
    
    public void setCredito(int credito){
        this.creditos = credito;
    }
    
    public int getCredito(){
        return this.creditos;
    }
}
