package senac.poo.exercicios.lista2;

public class Funcionario {
    
    String nome, empresa;
    double salario;
    int dia, mes, ano, rg;
    boolean estado = false;
    
    void dadosFuncionario(){
        System.out.println("---------------------------------");
        System.out.println("NOME: " +nome);
        System.out.println("EMPRESA: " +empresa);
        System.out.println("SALÁRIO: R$" +salario);
        System.out.println("DATA DA CONTRATAÇÃO: "+dia+"/"+mes+"/"+ano);
        System.out.println("RG: " +rg);
        if(estado == false)
            System.out.println("ESTADO ATUAL DO FUNCIONARIO: Desempregado");
        else
            System.out.println("ESTADO ATUAL DO FUNCIONARIO: Empregado");
        System.out.println("---------------------------------\n");
    }
    
    void dataContratacao(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    void contratar(boolean estado){
        if(estado == true){
            System.out.println("Funcionario Admitido");
            this.estado = estado;
        }
        else
            System.out.println("Funcionario não foi selecionado para a contratação");
    }
    
    void demitir(){
        if(estado == true){
            System.out.println("Funcionario Demitido");
            this.estado = estado;
        }
        else
            System.out.println("Funcionario ainda está contratado na empresa");
    }
    
}
