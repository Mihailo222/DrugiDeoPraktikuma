package z10;

public class BrojacReci {
//String tekst="nepoznat";
static int vratiBrojReci(String tekst) {
	String reci[]=tekst.split(" ");
	return reci.length;
}


static int brojPojavljivanjaReciLep(String tekst) {
	String[] reci=tekst.split(" ");
	int brojac=0;
	for(int i=0; i<reci.length; i++) {
		if(reci[i].equals("lep"))  brojac++;
	}
	return brojac;
}


static int brojReci(String tekst) {
	int brojac=0;
	String[] reci= tekst.split(" ");
	return reci.length-1;
}

static int brPojavljivanjaReci(String tekst, String rec) {
	String[] reci=tekst.split(" ");
	int brojac=0;
	
	for(int i=0; i<reci.length; i++) {
		if(reci[i].equals(rec))  brojac++;
	}
	return brojac;
}


static String maxRec(String tekst) {//br. pojavljivanja reci
	String[] reci=tekst.split(" ");
	String maxRec=reci[0]; //maxRec je rec koja se najvise pojavljuje
	int maxBrojPojavljivanjaReci=0;
	for(int i=0; i<reci.length; i++) {
		if(brPojavljivanjaReci(tekst, reci[i])>maxBrojPojavljivanjaReci) {
			
			maxRec=reci[i];
		    maxBrojPojavljivanjaReci=brPojavljivanjaReci(tekst, reci[i]);
		}
		
		    
		
	}
	return maxRec;
}

static String minRec(String tekst) {//br. pojavljivanja reci
	String[] reci=tekst.split(" ");
	String minRec=reci[0]; //maxRec je rec koja se najvise pojavljuje
	int minBrojPojavljivanjaReci=0;
	for(int i=0; i<reci.length; i++) {
		if(brPojavljivanjaReci(tekst, reci[i])<minBrojPojavljivanjaReci) {
			
			minRec=reci[i];
		    minBrojPojavljivanjaReci=brPojavljivanjaReci(tekst, reci[i]);
		}
		
		    
		
	}
	return minRec;
}





	
	
	
//uradi test	
	
	
	
	
}
