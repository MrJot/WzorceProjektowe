package wzorce.projektowe.symulator.kaczki.STRATEGY;

public class DzikaKaczka extends Kaczka {
	
	public DzikaKaczka(){
		kwakanie = new Kwacz();
		latanie = new LatanieSkrzydlami();
	}

	@Override
	public void print() {
		System.out.println("To jest Dzika kaczka");
		
	}
	
	

}
