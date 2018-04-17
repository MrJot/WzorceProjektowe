package wzorce.projektowe.symulator.człowieka.STRATEGY;

public class canNotSpeak implements Speaking {

	@Override
	public String speak() {
		return "I cannot speak at all:-( ";
	}

}
