package z3;

public class NizBrojeva {
	int[] nizCelihBrojeva= new int[40];
	int brojac=0;
	void dodajElement(int e) {
		if(brojac<nizCelihBrojeva.length) {
		nizCelihBrojeva[brojac]=e;
		brojac++;
		}else
			System.out.println("Kapacitet je premasen");
	}

	
	void ispisiPrvi() {
		System.out.println(nizCelihBrojeva[0]);
	}
	
	void ispisiDeseti() {
		System.out.println(nizCelihBrojeva[9]);
	}
	
	void ispisiElement(int index) {
		System.out.println(nizCelihBrojeva[index]);
	}
	
	void ispisiSve() {
		for(int i=0; i<brojac; i++) System.out.println(nizCelihBrojeva[i]);
		//mora ici samo< bez = zbog onog brojac++ iz metode dodaj
		//koji ubaci posle da bi se popunilo prvo slobodno mesto
	}
	
	int zbir() {
		int zbir=0;
		for(int i=0; i<brojac; i++) {
			zbir=zbir+nizCelihBrojeva[i];
		}
		return zbir;
	}
	
	int proizvod() {
		int proizvod=0;
		for(int i=0; i<brojac; i++) {
			proizvod=proizvod*nizCelihBrojeva[i];
		}
		return proizvod;
	}
	
	
	int minimalniElement() {
		int min=nizCelihBrojeva[0];
		for(int i=0; i<brojac; i++) {
			if(nizCelihBrojeva[i]<min)
				System.out.println(nizCelihBrojeva[i]);
		}
		return min;
	}
	
	
	int maksimalniElement() {
		int max=nizCelihBrojeva[0];
		for(int i=0; i<brojac; i++) {
			if(nizCelihBrojeva[i]>max)
				System.out.println(nizCelihBrojeva[i]);
		}
		return max;
	}
	
     boolean proveriClan(int x) {
    	 for(int i=0; i<brojac; i++) {
    		 if(nizCelihBrojeva[i]==x) 
    			 return true;
    	 }
    	 return false;
     }
	
     //saberi prvi i poslednji
     int saberiPrviIPoslednji() {
    	 int zbirDvaBroja;
 zbirDvaBroja=nizCelihBrojeva[0]+nizCelihBrojeva[brojac-1];
 return zbirDvaBroja;
    	 }
     
     
     int saberiPozitivne() {
    	 int zbirPozitivnih=0;
    	 for(int i=0; i<nizCelihBrojeva.length; i++) {
    		 if(nizCelihBrojeva[i]>0)   zbirPozitivnih=zbirPozitivnih+nizCelihBrojeva[i];
    	 }
    	 return zbirPozitivnih;
    }
     
    
     int saberiNegativne() {
    	 int zbirNegativnih=0;
    	 for(int i=0; i<nizCelihBrojeva.length; i++) {
    		 if(nizCelihBrojeva[i]<0)   zbirNegativnih=zbirNegativnih+nizCelihBrojeva[i];
    	 }
    	 return zbirNegativnih;
    }
     
     
     
     //broj ponavljanja unesenog broja
     
     int brojPonavljanja(int c) {
    	 int broj=0;
    	 for(int i=0; i<brojac; i++) {
    		 if(nizCelihBrojeva[i]==c) {
    			 broj++;
    		 }
    	 }
    	 return broj;
     }
    
     
     
     //ispisi parne
     
     void ispisiParne() {
    	 for(int i=0; i<brojac; i++) {
    		 if(nizCelihBrojeva[i]%2==0) {
    			 System.out.println(nizCelihBrojeva[i]);
    		 }
    	 }
     }
     
     
     void saberiDeljiveSaPet() {
    	 for(int i=0; i<brojac; i++) {
    		 if(nizCelihBrojeva[i]%5==0) {
    			 System.out.println(nizCelihBrojeva[i]);
    		 }
    	 }
     }
     
     
     void ispisiObrnuto() {
    	 for(int i=brojac-1; i>=0; i--) {
    		 System.out.println(nizCelihBrojeva[i]);
    	 }
     }
     
     
     
     double prosek() {
    	 int zbir=0;
    	 for(int i=0; i<brojac; i++) {
    		 zbir=zbir+nizCelihBrojeva[i];
    	 }
    	 return zbir/brojac;
     }
     
     
     
     
     //ispisi brojeve vece od nekog broja
     
     void ispisiBrojeveVeceOdPet(int a) {
    	 for(int i=0; i<brojac; i++) {
    		 if(nizCelihBrojeva[i]>a) {
    			 System.out.println(nizCelihBrojeva[i]);
    		 }
    	 }
    	 
     }
     
     
     
     
     
     
     
     
     
     
	
	
	
}
