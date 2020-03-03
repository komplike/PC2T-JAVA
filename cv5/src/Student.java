
public class Student {
	public Student(String jmeno, int rocnik) {
		this.jmeno=jmeno;
		this.rocnik=rocnik;
	}
	
	public String getJmeno()
	{
		return jmeno;
	}
	
	public int getRocnik()
	{
		return rocnik;
	}
	
	public float getStudijniPrumer() throws my_exceptions{
		
		if (studijniPrumer==0) {
			throw new my_exceptions();
		}
		else {
			return studijniPrumer;
		}
	}

	public void setStudijniPrumer(float studijniPrumer) throws my_exception {
		if (studijniPrumer>=1 && studijniPrumer<=5) {
			this.studijniPrumer = studijniPrumer;
		}
		else {
			throw new my_exception();
		}
	}

	private String jmeno;
	private int rocnik;
	private float studijniPrumer;
}