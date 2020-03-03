import java.util.InputMismatchException;
import java.util.Scanner;


public class Test {

	public static int pouzeCelaCisla(Scanner sc) 
	{
		int cislo = 0;
		try
		{
			cislo = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}
	


	public static void main(String[] args) throws my_exceptions, my_exception {	
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze(1);
		int idx;
		float prumer;
		int volba;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vytvoreni nove databaze");
			System.out.println("2 .. vlozeni noveho studenta");
			System.out.println("3 .. nastaveni prumeru studenta");
			System.out.println("4 .. vypis informace o studentovi");
			System.out.println("5 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					System.out.println("Zadejte pocet studentu");
					mojeDatabaze=new Databaze(sc.nextInt());
					break;
				case 2:
					mojeDatabaze.setStudent();
					break;
				case 3:
					System.out.println("Zadejte index a prumer studenta");
					try {
						idx=sc.nextInt();
					}
					catch(InputMismatchException e) {
						System.out.println("->Index musi byt formatu int (napr: 3)");
						continue;
					}
					try {
						prumer =sc.nextFloat();
					}
					catch(InputMismatchException e) {
						System.out.println("->Prumer musi byt formatu int (napr: 3)");
						continue;
					}
					try {
						mojeDatabaze.setPrumer(idx,prumer);
					}
					catch(my_exception e) {
						System.out.println("->Prumer v rozsahu 1-5");
						continue;
					}
					catch(NullPointerException e) {
						System.out.println("->Student na indexu "+idx+" neexistuje.");
						continue;
					}
					catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("->Student na indexu "+idx+" neexistuje.");
						continue;
					}
					break;
				case 4:
					System.out.println("Zadejte index studenta");
					idx=sc.nextInt();
					try {
						Student info=mojeDatabaze.getStudent(idx);
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer());
					}
					catch(NullPointerException e) {
						System.out.println("->Student na indexu "+idx+" neexistuje.");
						continue;
					}
					catch(my_exceptions e) {
						System.out.println("->Prumer neni nastaven");
						continue;
					}
					catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("->Student na indexu "+idx+" neexistuje.");
						continue;
					}
					break;
				case 5:
					run=false;
					break;
			}
			
		}
	}

}
