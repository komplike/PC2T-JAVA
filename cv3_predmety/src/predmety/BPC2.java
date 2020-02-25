package predmety;

public class BPC2 implements Subject {
	private int Pproject;
	private int Phalfexam;
	private int Pfinalexam;
	
	public void setPproject(int points) {
		if (points<=30) {
			Pproject=points;
		}
	}
	
	public void setPhalfexam(int points) {
		if (points<=20) {
			Phalfexam=points;
		}
	}
	public void setPfinalexam(int points) {
		if (points<=50) {
			Pfinalexam=points;
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "BPC2";
	}

	@Override
	public float getPoints() {
		// TODO Auto-generated method stub
		return (Pproject+Phalfexam+Pfinalexam);
	}

	@Override
	public boolean isEnough() {
		// TODO Auto-generated method stub
		return ((Pproject+Phalfexam)>=minP);
	}

}
