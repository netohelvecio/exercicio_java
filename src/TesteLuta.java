
public class TesteLuta {
	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Pretty Boy", "Fran�a", 27, 1.75, 68.9, 11, 2, 1, 4, 4, 4);
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 13, 4, 3, 5, 4, 2);
		//l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
		//l[3] = new Lutador("Dead Code", "Austr�lia", 28, 1.93, 81.6, 13, 0, 2);
		//l[4] = new Lutador("UFOCobol", "Alemanha", 37, 1.70, 119.3, 5, 4, 3);
		//l[5] = new Lutador("Neraart", "EUA", 30, 1.81, 105.7, 12, 2, 4);
		
		Luta UFC01 = new Luta();
		
		UFC01.marcarLuta(l[1], l[1]);
		UFC01.lutar();
		l[0].status();
	}

}
