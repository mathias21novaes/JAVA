package senac.poo.ado9;
import java.io.*;

public class ProgramaCliente {
    
    public static void main(String[] args){
        
        //ESTANCIAMENTO DE OBJETOS
        Placa Plc1 = new Placa("125-AGF", "SP", "Vermelho");
        Placa Plc2 = new Placa("187-RGE", "AC", "Preto");
        Placa Plc3 = new Placa("165-OHT", "PR", "Branco");
        
        int cont_obj = 0;
        FileOutputStream entradaDados;
        FileInputStream saidaDados;
        ObjectInputStream objeto_arquivoS = null;
        
        try{
            entradaDados = new FileOutputStream("Placa.ser");
            ObjectOutputStream objeto_arquivoE = new ObjectOutputStream(entradaDados);
            objeto_arquivoE.writeObject(Plc1);
            objeto_arquivoE.writeObject(Plc2);
            objeto_arquivoE.writeObject(Plc3);
            objeto_arquivoE.close();
            System.out.println("Arquivo gerado com sucesso!!!\n");
            
            saidaDados = new FileInputStream("Placa.ser");
            objeto_arquivoS = new ObjectInputStream(saidaDados);
            while(true){
                Plc1 = (Placa) objeto_arquivoS.readObject();
                System.out.println(Plc1);
                cont_obj++;
            }
            //System.out.println("Objeto lido do arquivo: \n\n"+Plc1+"\n"+Plc2+"\n"+Plc3);
            
        }
        catch(EOFException e){
            System.out.println("Numero de objetos lidos: "+cont_obj);
            System.out.println("Chegou ao final do arquivo!!!");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }     
    }
}
