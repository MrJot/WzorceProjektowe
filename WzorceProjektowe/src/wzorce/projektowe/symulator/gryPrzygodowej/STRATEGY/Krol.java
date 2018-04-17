package wzorce.projektowe.symulator.gryPrzygodowej.STRATEGY;

public class Krol extends Postac {
	
	

	public Krol() {
		bronZachowanie = new MieczZachowanie();
	}

	@Override
	public void przestawieniePostaci() {
		System.out.println("Jam jest krol, maz krolowej i wlasciwie to tyle");
		
	}
	
	

}
