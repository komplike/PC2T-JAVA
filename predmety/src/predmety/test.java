package predmety;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BPC1 subBPC1 = new BPC1();
		BPC2 subBPC2 = new BPC2();
		BPIS subBPIS = new BPIS();
		Scanner sc;
		
		//BPC1
		while(!subBPC1.isEnough()) {
			System.out.println("BPC1 : Zadaj body za aktivitu: ");
			sc = new Scanner(System.in);
			subBPC1.activityP(sc.nextInt());
		}
		System.out.println("BPC1 : Zadaj body zo skusky: ");
		sc = new Scanner(System.in);
		subBPC1.finalexamP(sc.nextInt());
		
		//BPC2
		System.out.println("BPC2 : Zadaj body za projekt: ");
		sc = new Scanner(System.in);
		subBPC2.setPproject(sc.nextInt());
		System.out.println("BPC2 : Zadaj body z polsem. skusky: ");
		sc = new Scanner(System.in);
		subBPC2.setPhalfexam(sc.nextInt());
		if (subBPC2.isEnough()) {
			System.out.println("BPC2 : Zadaj body zo skusky: ");
			sc = new Scanner(System.in);
			subBPC2.setPfinalexam(sc.nextInt());
		}
		
		//BPIS
		subBPIS.setPass();
		
		//results
		System.out.println("BPC1 : zapocet : "+ subBPC1.isEnough());
		System.out.println("BPC2 : zapocet : "+ subBPC2.isEnough());
		System.out.println("BPIS : zapocet : "+ subBPIS.getPass());
	}

}
