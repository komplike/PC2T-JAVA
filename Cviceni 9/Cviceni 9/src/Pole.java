import java.util.Scanner;

public class Pole {

	// Konstruktor s velikosti pole
	Pole(int velikost)
	{
		mojeHranoly=new Hranol[velikost];
		Hranol.setPocetHranolu(0);
		sc=new Scanner(System.in);
	}
	
	// vlozeni hranolu do pole na prvni volnou pozici
	void zadejHranol(){
		boolean drevena=false;
		float delka=0;
		float vyska=0;
		System.out.println("Zadejte delku podstavy hranolu");
		while(!sc.hasNextFloat())
		{
			sc.next();
		}
		delka=sc.nextFloat();
		System.out.println("Zadejte vysku hranolu");
		while(!sc.hasNextFloat())
		{
			sc.next();
		}
		vyska=sc.nextFloat();
		System.out.println("Je drevena?(Y-yes/N-no)");
		if (sc.hasNext("Y"))
			drevena=true;
		else
			drevena=false;
		if (Hranol.getPocetHranolu()>=mojeHranoly.length)
		{
			System.out.println("Pole uz je zaplneno");
			return;
		}
		mojeHranoly[Hranol.getPocetHranolu()]=new Hranol(delka,vyska,drevena);
	}
	
	// vypis objemu vsech hranolu
	void vypoctiObjem()
	{
		for (int i=0;i<Hranol.getPocetHranolu();i++)
			//System.out.println("Objem i. hranolu je" + mojeHranoly[i].vypoctiObsah());
			System.out.println("Objem "+i+". hranolu je" + mojeHranoly[i].vypoctiObjem());
	}
	
	// vypis obsahu podstavy vsech hranolu
	void vypoctiObsahPodstavy()
	{
		for (int i=0;i<Hranol.getPocetHranolu();i++)
			//System.out.println("Obsah i. hranolu je" + mojeHranoly[i].vypoctiObjem());
			System.out.println("Obsah "+i+". hranolu je" + mojeHranoly[i].getHrana()*mojeHranoly[i].getHrana());
	}
	
	// nalezeni indexu nejmensiho hranolu
	int najdiNejmensiObjem()
	{							
		int idx=0;
		float min=mojeHranoly[idx].vypoctiObjem();
		for (int i=1;i<Hranol.getPocetHranolu();i++)
		{
			if (mojeHranoly[i].vypoctiObjem()<min){
				min=mojeHranoly[i].vypoctiObjem();
				idx=i;
			}
		}
		return idx;
	}
	
	// zjisteni celkoveho poctu drevenych kostek
	int zjistiPocetDrevenych(){
		int pocetDrevenych=0;
		for (int i=0;i<mojeHranoly.length;i++)			
		{
			if (mojeHranoly[i].zeDreva=true)
				pocetDrevenych++;
		}
		return pocetDrevenych;
	}

	private Scanner sc;
	private Hranol []mojeHranoly;
}
