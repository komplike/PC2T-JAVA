package cv2;

public class database {
	private String meno;
	private int rocnik;
	private float uvazek=0;
	private static float max_uvazek=1;
	
	public database(String meno,int rocnik) {
		this.meno=meno;
		this.rocnik=rocnik;
	}
	// set/get generated
	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}

	public int getRocnik() {
		return rocnik;
	}

	public void setRocnik(int rocnik) {
		this.rocnik = rocnik;
	}

	public float getUvazek() {
		return uvazek;
	}

	public void setUvazek(float uvazek) {
		this.uvazek = uvazek;
	}

	public static float getMax_uvazek() {
		return max_uvazek;
	}

	public static void setMax_uvazek(float max_uvazek) {
		database.max_uvazek = max_uvazek;
	}
	//my code
	public boolean addUvazek(float uvazek) {
		if (this.uvazek+uvazek>max_uvazek)
			return false;
		this.uvazek=this.uvazek+uvazek;
		return true;
	}
	
}