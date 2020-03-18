import java.util.Scanner;


public class Test {

	public static int pouzeCelaCisla(Scanner sc) {
		int cislo = 0;
		try {
			cislo = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}
	
	public static float pouzeCisla(Scanner sc) {
		float cislo = 0;
		try {
			cislo = sc.nextFloat();
		}
		catch(Exception e) {
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cislo ");
			sc.nextLine();
			cislo = pouzeCisla(sc);
		}
		return cislo;
	}

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze();
		String idx;
		float prumer;
		int volba;
		boolean run=true;
		while(run) {
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vlozeni noveho studenta");
			System.out.println("2 .. nastaveni prumeru studenta");
			System.out.println("3 .. vypis informace o studentovi");
			System.out.println("4 .. vypis cele databaze");
			System.out.println("5 .. vymazanie studenta");
			System.out.println("6 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba) {
				case 1:
					try {
						mojeDatabaze.setStudent();
					}
					catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Nebylo mozno vytvorit novou polozku, databaze je plna");
					}
					break;
				case 2:
					System.out.println("Zadejte meno a prumer studenta");
					idx= sc.next();
					prumer = pouzeCisla(sc);
					try {
						mojeDatabaze.setPrumer(idx,prumer);
					}
					catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Vybrana polozka mimo rozsah databaze");
					}
					catch (NullPointerException e) {
						System.out.println("Vybrana polozka neexistuje");
					} 
					catch (prumerException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:
					System.out.println("Zadejte meno studenta");
					idx=sc.next();
					Student info = null;
					try {	
						info=mojeDatabaze.getStudent(idx);
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer());
					}
					catch (prumerException e) {
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer nezadan");
					}
					catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Vybrana polozka mimo rozsah databaze");
					}
					catch (NullPointerException e) {
						System.out.println("Vybrana polozka neexistuje");
					}
					break;
				case 6:
					run=false;
					break;
				case 4:
					mojeDatabaze.printDatabaze();
					break;
				case 5:
					System.out.println("Zadejte meno studenta");
					idx=sc.next();
					mojeDatabaze.delStudent(idx);
					break;
			}
			
		}
	}

}