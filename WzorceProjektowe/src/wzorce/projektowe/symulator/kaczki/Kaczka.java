package wzorce.projektowe.symulator.kaczki;

public abstract class Kaczka {

	Kwakanie kwakanie;
	Latanie latanie;


	public void plywanie() {

		System.out.println("All ducks are flying  !!!");
	}

	public void makeFly() {
		latanie.lec();
	}

	public void makeNoise() {
		kwakanie.kwacz();
	}

	public abstract void print();

	public void  zmianaNapeduLotnegoKaczki(Latanie lot) {
		latanie = lot;
	}
	
	public void zmianaMetodyDzwiekuKaczki(Kwakanie kwa) {
		kwakanie = kwa;
	}

}
