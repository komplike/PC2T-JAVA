package cv4;

public class potravina extends Zbozi {
	private int trvanlivost;

	//constructor
	public potravina(String nazov, float cena, int trvanlivost) {
		super(nazov,cena);
		this.trvanlivost=trvanlivost;
	}
	// getters and setters
	public int getTrvanlivost() {
		return trvanlivost;
	}

	public void setTrvanlivost(int trvanlivost) {
		this.trvanlivost = trvanlivost;
	}
	
	public String getJednotka() {
		return "dni";
	}
}
