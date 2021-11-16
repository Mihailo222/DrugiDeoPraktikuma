package z12;

public class OceneStudenta {

	//.... 
	
	String[] ocene; 
	
	
	//metoda koja ispisiuje fda li su studenti polozili i prebrojava ih
   //format: 0064/99 Maja Vukovic 10;..

	
	
	void ispisiOneKojiSuPolozili() {
		for(int i=0; i<ocene.length; i++) {
			
		
		String ocena=ocene[i].substring(ocene[i].lastIndexOf(' ')+1);
		if(!ocena.equals("5"))   System.out.println(ocene[i]);
		}
		}
	
	
	void ispisiSveKojiSuUpisali99() {
		for(int i=0; i<ocene[i].length(); i++) {
			String godina=ocene[i].substring(5, 7);
			if(godina.equals("99"))  System.out.println(godina);
		}
	}
	
	
	
	//napravi test metodu....





























}
