package wzorce.projektowe.symulator.gryPrzygodowej.STRATEGY;

public abstract class Postac {
	
	BronZachowanie bronZachowanie;
	
	public void podejmijWalke() {
		bronZachowanie.walcz();
	}
	
	public abstract void przestawieniePostaci();
	
	public void zmienNarzedzieWalki(BronZachowanie bronZachowanie) {
		this.bronZachowanie = bronZachowanie;
	}
}
