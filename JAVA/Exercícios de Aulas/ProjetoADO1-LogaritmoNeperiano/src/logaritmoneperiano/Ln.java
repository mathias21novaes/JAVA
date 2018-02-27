/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logaritmoneperiano;

/**
 *
 * @author luiz.rgguimaraes
 */
public class Ln {
    public static double calcular(Double x){
        x=x-1;
        double resfinal=0,potenciadex=0;
        for(int n=1;n<=10;n++){
            potenciadex=x;
            for(int i=2;i<=n;i++){
                potenciadex*=x;
            }
            if(n%2==0){//par
                potenciadex*=-1;
            }
            resfinal+=potenciadex/n;
        }
        return resfinal;
    }
}
