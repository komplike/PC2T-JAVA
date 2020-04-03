
public class Hranol extends Ctverec{//Cetverec

	// konstruktor se zadanim delky hrany, vysky a materialu
	Hranol(float hrana,float vyska, boolean drevena){
		super(hrana);
		this.hrana=hrana;			
		this.vyska=vyska;
		zeDreva=drevena;
		pocetHranolu++;
	}
	
	// vypocet objemu hranolu
	float vypoctiObjem() {
		return this.vypoctiObsah()*this.vyska;		
	}
	
	// nastaveni materialu
	void setDreveny(boolean dreveny){
		zeDreva=dreveny;
	}
	
	// zjisteni materialu
	boolean jeDreveny(){
		return zeDreva;
	}
	
	// zjisteni celkoveho poctu existujicich kostek
	//static
	static int getPocetHranolu(){
		return pocetHranolu;
	}
	static void setPocetHranolu(int i){
		Hranol.pocetHranolu=i;
	}
	
	// zjisteni vysky hranolu
	float getHrana(){					
		return hrana;
	}
	// nastaveni vysky hranolu
	void setHrana(float delka){			
		hrana=delka;
	}
	// zjisteni vysky hranolu
		float getVyska(){					
			return vyska;
		}
		// nastaveni vysky hranolu
		void setVyska(float delka){			
			hrana=vyska;
		}
	
	private float vyska;
	private float hrana;
	boolean zeDreva;
	private static int pocetHranolu=0;			
	
	
}
