package wzorce.projektowe.symulator.człowieka.STRATEGY;

public class canNotSwim implements Swimming {

	@Override
	public String swim() {
		return "I cannot swim, please help me :-(";
	}

}
