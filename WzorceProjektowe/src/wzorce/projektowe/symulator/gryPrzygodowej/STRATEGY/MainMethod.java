package wzorce.projektowe.symulator.gryPrzygodowej.STRATEGY;

public class MainMethod {

	public static void main(String[] args) {
		
		Postac rycerz = new Rycerz();
		rycerz.przestawieniePostaci();
		rycerz.podejmijWalke();
		rycerz.zmienNarzedzieWalki(new ToporZachowanie());
		System.out.println("No to teraz zmienilem narzedzie walki");
		rycerz.podejmijWalke();

	}

}
