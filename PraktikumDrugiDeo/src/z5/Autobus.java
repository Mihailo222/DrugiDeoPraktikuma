package z5;

public class Autobus {
boolean[] sedista=new boolean[50];
//true-slobodno
//false-zauzeto
	

public Autobus() {
	for(int i=0; i<50; i++) {
		sedista[i]=true;
	}
}

 void ubaciPitnika(int brSedista) {
	for(int i=0; i<sedista.length;i++) { 
		if(sedista[brSedista]==true) {
			sedista[brSedista]=false;
		}else
			System.out.println("Sediste je vec zauzeto");
			}	
        }
 
 
 
 boolean  daLiImaSlobodnihMesta() {
	for(int i=0;i<sedista.length; i++) {
		if(sedista[i]==true) return true;
		
	}
	return false;
 }
 
 
 int vratiBrojSlobodnihMesta() {
	 int brSlobodnih=0;
	for(int i=0;i<sedista.length; i++) {
		brSlobodnih++;
		if(sedista[i]==true) return brSlobodnih;
		
	}
	return brSlobodnih;
 }
 
 
 
 int vratiZauzetihMesta() {
	 int brZauzetih=0;
	for(int i=0;i<sedista.length; i++) {
		brZauzetih++;
		if(sedista[i]==true) return brZauzetih;
		
	}
	return brZauzetih;
 } 
 
 
 void ispisiStatus() {
	
	 for(int i=0; i<sedista.length;i++) {
		 if(sedista[i]==true) {
			 System.out.println("Sediste je slobodno");
		 }else {
			 System.out.println("Sediste je zauzeto");
		 }
			 
 }
 }
 
	 
	 //napisi metodu koja pravi kopij unesenog niza
	 
	 static int[] kopiraj(int[] niz) {
		int[] kopija = new int[niz.length];
		for(int i=0; i<niz.length; i++) {
			kopija[i]=niz[i];
		}
		return kopija;
	 }
	 
	 //SPOJ 2 NIZA!!! 
	 
	 static int[] spoji(int[] niz1, int[] niz2) {
		 int[] niz3=new int[niz1.length+niz2.length];
		 for(int i=0; i<niz1.length; i++) {
			 niz3[i]=niz1[i];
		 }
		 for(int i=0;i<niz2.length; i++) {
			 niz3[niz1.length+i]=niz2[i];
		 }
		 
		 return niz3;
	 }
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
