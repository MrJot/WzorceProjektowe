package wzorce.projektowe.symulator.gryPrzygodowej.STRATEGY;

public class Rycerz extends Postac {

	public Rycerz() {
		bronZachowanie = new LukStrzalyZachowanie();
	}

	@Override
	public void przestawieniePostaci() {
		System.out.println("Jam jest rycerz, i z jakiegoś bliżej nieokreślonego powodu walcze łukie");
		
	}
	
	

}
