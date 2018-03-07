
package senac.poo.ado1;


public class Logaritmo {
    
    public static double calculo(double num){
        num = num-1;
        double valor = 0;
	double potencia = 0;

        for(int n=1; n<=100; n++){
            potencia = num;

            for(int i=2;i<=n;i++){
                potencia *= num;
            }
            if(n%2 == 0){
                potencia*=-1;
            }
            valor += potencia/n;
        }
        return valor;
    }
    
}
