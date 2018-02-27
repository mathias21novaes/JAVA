/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logaritmoneperiano;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author luiz.rgguimaraes
 */
public class Main {
    public static void main(String[] args){
        //System.out.println("EI MUNDO");
        BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
        Mensagens msg = new Mensagens();
        double entradad=0;
        
        try {
            msg.iniciar();
            String s = buffer.readLine();
            while (s != null){//por algum motivo esta condicao nao funciona nos finais de linha
                
                try{ //verificar se linha está vazia
                    s.charAt(0);
                }
                catch(StringIndexOutOfBoundsException erro){
                    break;
                }
                
                try{//validar numero

                    entradad=Double.parseDouble(s);
                    if(entradad >= 2.0 || entradad <= 0){
                        msg.invalidar();
                        msg.iniciar();
                        s = buffer.readLine();
                        continue;
                    }
                }catch(NumberFormatException erro){
                    msg.invalidar();
                    msg.iniciar();
                    s = buffer.readLine();
                    continue;
                }
                
                System.out.println("RESULTADO: ln (" + s + ") = " + Ln.calcular(entradad));
                msg.iniciar();
                s = buffer.readLine();
            }
            buffer.close();
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
