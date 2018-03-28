package senac.poo.ado;

public class ProgramaFuncionario {
    
    public static void main (String[] args){
        
        Engenheiro engenheiro1 = new Engenheiro("Jose", 159, "rua amora", 159789);
        Engenheiro engenheiro2 = new Engenheiro("maria", 160, "rua paranagua", 260157);
        
        Motorista motorista1 = new Motorista("marcio", 156, "avenida fdp", 123456);
        Motorista motorista2 = new Motorista("jacao", 789, "avenida putamare", 852364);
        
        Gerente gerente1 = new Gerente("Godofredo", 834, "Rua Omã", "rh");
        Gerente gerente2 = new Gerente("Paulo", 807, "Rua Washigton", "compras");
        Gerente gerente3 = new Gerente("Matheus", 777, "Rua matheus é reis", "contabilidade");
        
        Secretaria secretaria1 = new Secretaria("Alice", 348, "Rua Kubi", "Portugues");
	Secretaria secretaria2 = new Secretaria("Talita", 331, "Rua Francisco", "ingles");
        
        engenheiro1.imprimirApresentacao();
        engenheiro1.imprimeDados();
        motorista2.imprimeDados();
        secretaria1.imprimeDados();
        secretaria2.imprimeDados();
        gerente2.imprimeDados();
        gerente3.imprimeDados();
        gerente1.imprimeDados();
        
    }
    
}
