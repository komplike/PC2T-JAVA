package cv2;
import java.util.Scanner;

public class DatabaseOperation {

	public static void main(String[] args) {
		Scanner sc;
		database [] pole;
		
		//naplnenie databazy
		while(true) {
			System.out.println("Pocet osob: ");
			sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				break;
			}
		}
		pole = new database [sc.nextInt()];
		
		for (int i=0;i<pole.length;i++) {
			System.out.println("Zadajte meno osoby c."+ (i+1) + ":");			
			sc = new Scanner(System.in);
			String meno=sc.next();
			while(true) {
				System.out.println("Rok narodenia:");
				sc = new Scanner(System.in);
				if (sc.hasNextInt()) {
					break;
				}	
			}
			int rocnik=sc.nextInt();
			pole[i] = new database(meno,rocnik);
		}
		
		//max_uvazek
		while(true) {
			System.out.println("Vyska max. uvazku:");
			sc = new Scanner(System.in);
			if (sc.hasNextFloat()) {
				break;
			}	
		}
		database.setMax_uvazek(sc.nextFloat());

		//vypis osob podla indexu
		int i;
		while(true) {
			System.out.println("Index osoby:");
			sc = new Scanner(System.in);
			if (!sc.hasNextInt()) {
				continue;
				}
			i = sc.nextInt();
			System.out.println("Meno: " + pole[i].getMeno());
			System.out.println("Rocnik: " + pole[i].getRocnik());
			if ( pole[i].getUvazek()  == database.getMax_uvazek() ) {
				System.out.println("Dosiahnuty max. uvazek:" + pole[i].getUvazek());
			}
			else {
				System.out.println("Uvazek: " + pole[i].getUvazek());
			}
		}		
	}
}