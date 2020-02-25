package cv4;

public abstract class Zbozi {
	private String nazov;
	private float cena;
	static private float dph=21;
	
	//explicit constructor
	public Zbozi(String nazov, float cena) {
		this.nazov=nazov;
		this.cena=cena;
	}
	//getters and setters
	public String getNazov() {
		return nazov;
	}

	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

	public float getCena() {
		return cena+cena*dph/100;
	}

	public void setCena(float cena) {
		this.cena = cena;
	}

	public static float getDph() {
		return dph;
	}

	public static void setDph(float dph) {
		Zbozi.dph = dph;
	}
	public abstract String getJednotka();
}
