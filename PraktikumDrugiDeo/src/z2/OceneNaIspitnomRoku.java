package z2;

public class OceneNaIspitnomRoku {
	int[] ocene=new int[100];
	int brojac=0; //broji trenutno ocena

	
	
	//metoda koji ubacuje ocenu na prvo slob. mesto
	void postaviOcenu(int ocena) {
		ocene[brojac]=ocena;
		brojac++; //novi el. dodat u niz, pa smo brojac povecali za 1
	}
	
	void ispisi() {
		for(int i=0; i<brojac; i++)
			System.out.println(ocene[i]);
	}
	
	
	
}
