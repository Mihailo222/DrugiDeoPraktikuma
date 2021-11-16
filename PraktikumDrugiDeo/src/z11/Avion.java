package z11;

public class Avion {

	String[] sedista=new String[50];
	//slobodno-bull
	//zauzeto-IME PREZIME
	
    public Avion() {
    	
    	for(int i=0; i<50; i++) {
    		sedista[i]=null;
    	}
    	
    }
	
    
    
    String vratiImeIPrezime(int brSedista, String imeIPrezime) {
    	return sedista[brSedista]=imeIPrezime;
    	
    }//oni kazu nema -1??????????????
	
    
    
    void uvediPutnika(String imeIPrezime, int brSedista) {
    	
    	for(int i=0; i<50; i++) {
    	if(sedista[i]==null) {
    		sedista[brSedista]=imeIPrezime;
    	System.out.println("Putnik "+imeIPrezime+" je na "+ brSedista+". sedistu.");
    	
    	}else {
    		System.out.println("Sediste je zauzeto");
    	}
        }
	}
    
    
    void izvediPutnika(int brSedista) {
    	for(int i=0; i<sedista.length; i++) {
    		if(sedista[brSedista]!=null) {
    			sedista[brSedista]=null;
    			System.out.println("Putnik izveden");
    		}else {
    			System.out.println("Sediste je slobodno");
    		}
    	}
    	}
    
    
    int brSlobodnihMesta() {
    	int brojac=0;
    	for(int i=0; i<sedista.length; i++) {
    		if(sedista[i]==null)
    			brojac++;
    	}
    	return brojac;
    }
    
    
    int brZauzetihhMesta() {
    	int brojac=0;
    	for(int i=0; i<sedista.length; i++) {
    		if(sedista[i]!=null)
    			brojac++;
    	}
    	return brojac;
    }
    
    
    void ispisiSveArsice() {
    	for(int i=0; i<50; i++) {
    	if(sedista[i].endsWith("Arsic"))
    		System.out.println(sedista[i]);
    	
    }
    }
   //hoce mi istampati kako treba?????
    	
    	
    	int brPutnikaSaImenomNikola() {
    		int brojac=0;
    		for(int i=0; i<50; i++) {
    	if(sedista[i].startsWith("Nikola"))
    		brojac++;
    		}
    	return brojac;
    	}
    	
    	//ispisi test
    	
    	
    	
    	
    	
    	
    	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
