package senac.poo.aula02;
import java.util.Scanner;

public class ProgramaPessoa {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("INFORME QUANTAS PESSOAS DESEJA CADASTRAR: ");
        int num = entrada.nextInt();
        System.out.printf("%d SERÃO CADASTRADAS\n", num);
        
        /*
        //CRIAÇÃO DE UM OBJETO
        Pessoa hum = new Pessoa();
        
        hum.nome   = "Matheus";
        hum.sexo   = 'M';
        hum.idade  = 18;
        hum.altura = 1.74;
        
        System.out.println("NOME: " + hum.nome);
        System.out.println("SEXO: " + hum.sexo);
        System.out.println("IDADE: " + hum.idade);
        System.out.println("ALTURA: " + hum.altura);*/
    }
    
}
