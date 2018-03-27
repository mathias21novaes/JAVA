package senac.poo.exercicios.lista3;

public class ProgramaCurso {
    
    public static void main (String[] args){
        
        Curso Bcc = new Curso(78951.2018, "Curso de tecnologia da Universiade Senac");
        
        Bcc.setCredito(1275);
        System.out.println("Total de creditos: " +Bcc.getCredito());
        
        Bcc.entrarCurso();
        System.out.println("Total de creditos: " +Bcc.getCredito());
        
        Bcc.sairCurso();
        System.out.println("Total de creditos: " +Bcc.getCredito());
    }
}
