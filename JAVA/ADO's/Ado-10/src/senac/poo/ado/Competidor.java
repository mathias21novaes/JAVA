package senac.poo.ado;

public class Competidor extends Thread{
	
	private String nome;
	private int velocidade;
	private int tempo;

	public Competidor(String name, int veloc, int time) {
		this.nome = name;
		this.velocidade = veloc;
		this.tempo = time;
	}
		
	public void run() {
		try {
			for(int i=0;i<7;i++) {
				System.out.println("=====================>  "+nome+ " ESTA NA VOLTA "+i+" COM VELOCIDADE DE "+velocidade+" m/s\n");
				Thread.sleep(tempo);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(nome+" JÁ TERMINOU A CORRIDA  <================ \n");
	}
	
	public void Inicio() {
		System.out.println("------ VAI COMEÇAR A CORRIDAAA ! ! ! --------\n");			
	}
}
