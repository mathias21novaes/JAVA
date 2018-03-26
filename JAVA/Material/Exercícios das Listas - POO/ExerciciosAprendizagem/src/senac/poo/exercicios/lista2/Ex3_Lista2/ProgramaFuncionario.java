package senac.poo.exercicios.lista2.Ex3_Lista2;

public class ProgramaFuncionario {
    
    public static void main(String[] args){
        
        Funcionario Matheus = new Funcionario();
        
        Matheus.nome = "Matheus";
        Matheus.empresa = "Apple Developer Academic";
        Matheus.salario = 5780.46;
        Matheus.rg = 523623860;
        Matheus.estado = false;
        
        Matheus.dataContratacao(5, 8, 1999);  
        Matheus.dadosFuncionario();
        Matheus.contratar(true);
        Matheus.demitir();
        Matheus.dadosFuncionario();
    }
    
}
