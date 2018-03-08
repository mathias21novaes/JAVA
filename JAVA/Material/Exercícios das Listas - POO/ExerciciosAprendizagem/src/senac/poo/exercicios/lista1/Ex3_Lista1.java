package senac.poo.exercicios.lista1;

public class Ex3_Lista1 {
    
    public static void main(String[] args){
        
        int x = 7;
        int y;
        int tam = 143;
        
        System.out.println("São multiplos de 7 entre 33 e 143 os seguintes elementos:\n");
        
        for(int i = 0; i <= tam; i++){
            y = x * i;
            
            if(y >= 33 && y<=tam)
                System.out.printf("Elemento %d = %d\n", +i, + y);
        }
    }
    
}
