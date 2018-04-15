package wzorce.projektowe.symulator.kaczki;

public class MainMethod {
	
	public static void main(String[] args) {
		Kaczka dzika = new DzikaKaczka();
		dzika.makeFly();
		dzika.makeNoise();
		dzika.print();
		System.out.println("Zmiana napedu napędu kaczki");
		
		dzika.zmianaNapeduLotnegoKaczki(new NapedRakietowy());
		
		dzika.makeFly();
	}

}
