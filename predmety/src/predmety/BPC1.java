package predmety;

public class BPC1 implements Subject {

	private String name;
	private int examP=0;
	private int activP=0;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public float getPoints() {
		// TODO Auto-generated method stub
		return (examP+activP);
	}

	@Override
	public boolean isEnough() {
		// TODO Auto-generated method stub
		return (activP>=minP);
	}
	
	public void activityP(int points) {
		if (points+activP<=20) {
			activP=activP+points;
		}
		else {
			System.out.println("Max points reached(20); You have = "+ activP);
		}
	}
	public void finalexamP(int points) {
		if (points<=80) {
			examP=points;
		}
	}
}
