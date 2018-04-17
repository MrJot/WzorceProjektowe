package wzorce.projektowe.symulator.człowieka.STRATEGY;

public abstract class Człowiek {
	
	public abstract void humanIntroduction();
	
	public abstract void showMeYourSkills();
	
	private Swimming swimming;
	private Reading reading;
	private Speaking speaking;
	private Walking walking;
	
	public void makeSwim() {
		swimming.swim();
	}
	
	public void makeRead() {
		reading.read();
	}
	
	public void makeSpeak() {
		speaking.speak();
	}
	
	public void makeWalk() {
		walking.walk();
	}
	
	public void changeSpeakBehaviour(Speaking speaking) {
		this.speaking=speaking;
	}
	
	public void changeReadBehaviour(Reading reading) {
		this.reading=reading;
	}
	
	
	


}
