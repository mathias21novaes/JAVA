package senac.poo.ado9;
import java.io.Serializable;

public class Placa implements Serializable{
    
    private String placa;
    private String estado;
    private String cor;
    
    public Placa(String pl, String est, String cor){
        this.placa = pl;
        this.estado = est;
        this.cor = cor;
    }
    
    public String toString(){
        return "Placa cadastrada e suas características: \nPLACA: "+placa+"\nESTADO: "+estado+"\nCOR DO VEÍCULO: "+cor+"\n\n";
    }
    
    //METODOS SETTERS
    public void setPlaca(String pl){
        this.placa = pl;
    }
    
    public void setEstado(String est){
        this.estado = est;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    
    //METODOS GETTERS
    public String getPlaca(){
        return placa;
    }
    
    public String getEstado(){
        return placa;
    }
    
    public String getCor(){
        return placa;
    }
       
}
