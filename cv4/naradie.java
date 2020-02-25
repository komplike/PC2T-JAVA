package cv4;

public class naradie extends Zbozi {
	private int zaruka;
	
	public naradie(String nazov, float cena, int zaruka) {
		super(nazov,cena);
		naradie.this.zaruka=zaruka;
	}
	
	// getters and setters
	public int getZaruka() {
		return zaruka;
	}

	public void setZaruka(int zaruka) {
		this.zaruka = zaruka;
	}
	public String getJednotka() {
		return "mesiacov";
	}

}
