package wzorce.projektowe.symulator.gryPrzygodowej.STRATEGY;

public class Troll extends Postac {
	
	

	public Troll() {
		bronZachowanie = new ToporZachowanie();
	}

	@Override
	public void przestawieniePostaci() {
		System.out.println("Jam jest Troll, świetnie władam toporemm");
		
	}
	
	

}
