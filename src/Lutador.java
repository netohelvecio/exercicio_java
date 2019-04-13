
public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	private int velocidade;
	private int forca;
	private int resistencia;
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias,
					int derrotas, int empates, int velocidade, int forca, int resistencia) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.velocidade = velocidade;
		this.forca = forca;
		this.resistencia = resistencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria() {
		if (peso < 52.2){
			this.categoria = "Inválido";
		}
		else if (peso <= 70.3){
			this.categoria = "Leve";
		}
		else if(peso <= 83.9){
			this.categoria = "Médio";
		}
		else if (peso <= 120.2){
			this.categoria = "Pesado";
		}
		else{
			this.categoria = "Inválido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}		
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getResistencia() {
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	
	public void apresentar(){

		System.out.print("Apresentamos o lutador " + this.getNome());
		System.out.println(" diretamente de " + this.getNacionalidade());
		System.out.print(this.getIdade() + " anos, ");
		System.out.print(this.getAltura() + " m, ");
		System.out.println(this.getPeso() + "KG");
		System.out.println("Cartel:");
		System.out.print("Vitórias: " + this.getVitorias());
		System.out.print(" / Derrotas: " + this.getDerrotas());
		System.out.println(" / Empates: " + this.getEmpates());		
	}	
	public void status(){
		System.out.println("-------------------------------------");
		System.out.print(this.getNome());
		System.out.println(" do peso " + this.getCategoria());
		System.out.println("Cartel:");
		System.out.print("Vitórias: " + this.getVitorias());
		System.out.print(" / Derrotas: " + this.getDerrotas());
		System.out.println(" / Empates: " + this.getEmpates());
		
	}	
	public void ganharLuta(){
		this.setVitorias(this.getVitorias() + 1);
	}	
	public void perderLuta(){
		this.setDerrotas(this.getDerrotas() + 1);
	}
	public void empatarLuta(){
		this.setEmpates(this.getEmpates() + 1);
	}	
}
