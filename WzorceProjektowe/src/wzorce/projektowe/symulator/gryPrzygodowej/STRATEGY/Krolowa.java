package wzorce.projektowe.symulator.gryPrzygodowej.STRATEGY;

public class Krolowa extends Postac {
	
	

	public Krolowa() {
		bronZachowanie = new NozZachowanie();
	}

	@Override
	public void przestawieniePostaci() {
		System.out.println("Jam jest krolowa, wladczyni wszystkich ziem !");
		
	}
	
	

}
