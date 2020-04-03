import java.util.Scanner;

public class run {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Pole pole=new Pole(1);
		while (true) {
			System.out.println("1 Nove pole");
			System.out.println("2  Pridaj hranol");
			System.out.println("3 pocet drevennych");
			System.out.println("4 najmensi objem");
			System.out.println("5 Objem vsetkych");
			System.out.println("6 Koniec");
			switch (sc.nextInt()) {
			case 1: 
				System.out.println("Velkost pola: ");
				pole=new Pole(sc.nextInt());
				break;
			case 2:
				pole.zadejHranol();
				break;
			case 3:
				System.out.println("pocet drevennych: "+pole.zjistiPocetDrevenych());
				break;
			case 4:
				System.out.println("najmensi objem ma hranol: "+pole.najdiNejmensiObjem());
				break;
			case 5:
				System.out.println("Objem vsetkych: ");
				pole.vypoctiObjem();
				break;
			case 6:
				continue;
			default:
				break;
				
			}
		}
	}

}
