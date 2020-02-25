package cv4;


public class Test {

	public static void main(String[] args) {

		//creating objects
		Zbozi pole[]=new Zbozi[4];
		pole[0]= new potravina("Rohlik",1.5f,1);
		pole[1]= new naradie("Klieste",278.f,24);
		pole[2]= new potravina("Chlieb",20.8f,6);
		pole[3]= new potravina("Jablko",51.f,20);
		
		//print items
		for(int i=0;i<pole.length;i++) {
			if (pole[i] instanceof potravina) {
				System.out.println(pole[i].getNazov()+", cena: "+pole[i].getCena()+", trvanlivost: "+((potravina)pole[i]).getTrvanlivost()+" "+pole[i].getJednotka());
			}
			else {
				System.out.println(pole[i].getNazov()+", cena: "+pole[i].getCena());
			}
		}
	}

}
