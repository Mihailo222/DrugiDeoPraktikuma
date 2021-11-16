package z8;

public class AnalizatorSlovaUTekstu {
	String tekst="nepoznat";
	
	String getTekst() {
		return tekst;
	}
	
	void postaviTekst(String tekst) {
		
		if(!tekst.isEmpty() && tekst!=null)
		     this.tekst=tekst;
		else
			System.out.println("Error");
			}

	
	
	int vratiDuzinu() {
		return tekst.length();
	}
	
	int izbrojPojavljivanja() {
		int brojac=0;
		for(int i=0; i<tekst.length(); i++) {
			if(tekst.charAt(i)=='a') brojac++;
		//ako je index od i=a, povecaj mi brojac za 1
		}
		
		return brojac;
	}
	
	int brojPojavljivanjaParametra(char c) {
		int brojac=0;
		for(int i=0; i<tekst.length(); i++) {
			if(tekst.charAt(i)==c) brojac++;
		}
		return brojac;
	}
	
	//metoda koja vraca broj recenica koje se pojavljuju u textu
	//recenica se zavrsava sa: ., !, ili ?
	
    int brojacRecenica() {
		int brojac=0;
		for(int i=0; i<tekst.length(); i++) 
			if(tekst.charAt(i)=='!' || tekst.charAt(i)=='.' || tekst.charAt(i)=='?')
				brojac++;
			
	return brojac;
		}
    
    
    int brojPojavljivanjaSamoglasnika() {
    	return brojPojavljivanjaParametra('A')+brojPojavljivanjaParametra('a')+
    			+brojPojavljivanjaParametra('E')+brojPojavljivanjaParametra('e')+
    			+brojPojavljivanjaParametra('I')+brojPojavljivanjaParametra('i')+
    			+brojPojavljivanjaParametra('o')+brojPojavljivanjaParametra('O')+
    			+brojPojavljivanjaParametra('U')+brojPojavljivanjaParametra('u');
    	}
    
    
    int vratiZnakSaNajvisePonavljanja() {
    int maxBroj=0;//max broj
    char maxSlovo=tekst.charAt(0);//slovo koje je najcesce
    for(int i=0; i<tekst.length(); i++) {
    	if(tekst.charAt(i)!=' ' && brojPojavljivanjaParametra(tekst.charAt(i))>maxBroj){
                                          //charAt je indeks parametra i jod text. znaci neki char na tom indexu
    		maxBroj=brojPojavljivanjaParametra(tekst.charAt(i));
    		}
    	}
    return maxBroj;
    }
    
    
    
    int vratiZnakSaNajmanjePonavljanja() {
        int minBroj=0;//min broj
        char minSlovo=tekst.charAt(0);//slovo koje je najcesce
        for(int i=0; i<tekst.length(); i++) {
        	if(tekst.charAt(i)!=' ' && brojPojavljivanjaParametra(tekst.charAt(i))<minBroj){
                                              //charAt je indeks parametra i jod text. znaci neki char na tom indexu
        		minBroj=brojPojavljivanjaParametra(tekst.charAt(i));
        		}
        	}
        return minBroj;
        }
    
    
    
    int vratiPrviIndex() {
    	return tekst.indexOf('a');
    	
    }
    
    int vratiPoslednjiIndex() {
    	return tekst.lastIndexOf('a');
    	
    }
    
    int vratiPrviIndeks(char c) {
    	return tekst.indexOf(c);
    }
    
    int vratiPoslednjiIndeks(char c) {
    	return tekst.lastIndexOf(c);
    }
    
    
    
    int vratiDrugiIndex() {
    	return tekst.indexOf('a')+1;
    	}
    
    int vratiPretposlednjiIndex() {
    	return tekst.indexOf('a')-1;
    	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
