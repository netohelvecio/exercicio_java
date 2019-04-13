import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2){
		if (l1.getCategoria() == l2.getCategoria()){
			if(l1 != l2) {
				this.setAprovada(true);
				this.setDesafiado(l1);
				this.setDesafiante(l2);
			}else {
				System.out.println("Luta não pode aconetcer porque os 2 lutadores são os mesmos");
				this.setAprovada(false);
			}
		}else{
			System.out.println("Luta não pode acontecer porque lutadores são de categorias diferentes");
			this.setAprovada(false);
		}
	}	
	public void lutar(){
		if (this.getAprovada()){
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("");
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			System.out.println("");
			System.out.println("### RESULTADO ###");
			this.setRounds();
			System.out.println("Rounds: " + this.getRounds());
			
			int poder, poder2;
			
			poder = this.desafiado.getVelocidade() + this.desafiado.getForca() + (this.desafiado.getResistencia() - this.getRounds());
			poder2 = this.desafiante.getVelocidade() + this.desafiante.getForca() + (this.desafiante.getResistencia() - this.getRounds());
			
			System.out.println(this.desafiado.getNome() + " " + poder + " - " + poder2 + " " + this.desafiante.getNome());
			
			if (poder > poder2) {
				System.out.println("Vencedor: " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
			}else if (poder2 > poder){
				System.out.println("Vencedor: " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
			}else {
				System.out.println("Empate");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
			}
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}
	public void setRounds() {
		Random aleatorioRounds = new Random();
		this.rounds = aleatorioRounds.nextInt(5) + 1;	
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
