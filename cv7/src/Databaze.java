import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Databaze {
	public Databaze() {
		studenti = new HashMap<String,Student>();
		sc=new Scanner(System.in);
	}
	
	public void setStudent() {
		System.out.println("Zadejte jmeno studenta, rok narozeni");
		String jmeno=sc.next();
		int rok=Test.pouzeCelaCisla(sc);
		studenti.put(jmeno,new Student(jmeno,rok));
	}
	
	public Student getStudent(String jmeno) {
		return studenti.get(jmeno);
	}
	
	public void setPrumer(String jmeno, float prumer) throws prumerException {
		if (studenti.containsKey(jmeno))
			studenti.get(jmeno).setStudijniPrumer(prumer);
		else
			System.out.println("Student "+jmeno+" nie je v databazi.");
	}
	
	public void printDatabaze() {
		studenti.forEach((k,s)->{
			try {
				System.out.println("Jmeno: " + k + " rok narozeni: " + s.getRocnik() + " prumer: " + s.getStudijniPrumer());
			} catch (prumerException e) {
				System.out.println("Jmeno: " + s.getJmeno() + " rok narozeni: " + s.getRocnik() + " prumer nezadan");
			}
		});
	}
	
	public void delStudent(String meno) {
		if (studenti.containsKey(meno))
			studenti.remove(meno);
		else
			System.out.println("Student "+meno+" nie je v databazi.");
	}
	
	private Scanner sc;
	private Map<String, Student> studenti;
}