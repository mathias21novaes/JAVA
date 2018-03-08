package senac.poo.exercicios.lista1;
import java.util.Scanner;

public class Ex4_Lista1 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int tam = 10;
        int N[] = new int[tam];
        int i; 
        int pos = 0;
        int menor = N[0];
        
        for(i = 0; i < tam; i++){
            System.out.printf("Digite o valor %d de 9: ", + i);
            N[i] = entrada.nextInt();
            
            if(N[i]< menor){
                menor = N[i];
                pos = i;
            }
        }
        
        System.out.println("\n");
        
        for(i = 0; i < tam; i++){
            System.out.printf("N[%d] = %d\n", + i, + N[i]);     
        }
        System.out.printf("N[%d] = %d <----- Menor\n", +pos, +menor);
    }    
}
