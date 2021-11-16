package z7;

public class AnalizatorTeksta {
	String tekst;
	public AnalizatorTeksta() {
		tekst="nepoznat";
	}
	
	public AnalizatorTeksta(String nekiTekst) {
		tekst=nekiTekst;
	}
	
	String getTekst() {
		return tekst;
	}
	
	
	String postaviTekst(String noviTekst) {
		if(!noviTekst.isEmpty() && noviTekst!=null) {//nije prazan String, 
			                                       // nije null vrednost u str.
		tekst=noviTekst;
		}
		return tekst;
	}
	
	
	void dodajNoviTekstNaKrajPrethodnog(String noviTekst) {
		if(noviTekst!=null && !noviTekst.isEmpty()) {
			if(noviTekst.equals("nepoznat"))
				tekst=noviTekst;
			else
				tekst=tekst+noviTekst;
		}else {
			System.out.println("Error");
		}
	}
	
	
	void dodajNoviNaPocetak(String noviTxt) {
		if(!noviTxt.isEmpty() && noviTxt!=null) {
		    if(noviTxt.equals("nepoznat")) {
		    	tekst=noviTxt;
		    }else {
		    	tekst=noviTxt+tekst;
		    }
	
		}else {
			System.out.println("Error");
		}
	}
	
	void proveriTekstove(String uneseniTekst) {
		if(tekst.equals(uneseniTekst)) System.out.println("Tekstovi isti");
		else System.out.println("Tekstovi se razlikuju");
	}
	
	
	void proveriTekstoveBezObziraNaVelicinuSlova(String uneseniTekst) {
		if(tekst.equalsIgnoreCase(uneseniTekst)) System.out.println("Tekstovi isti");
		else System.out.println("Tekstovi se razlikuju");
	}
	
	
	void leksikografskaProvera(String noviTekst) {
		if(tekst.compareTo(noviTekst)>0)
			System.out.println("Tekst je posle novog teksta");
		if(tekst.compareTo(noviTekst)<0)
			System.out.println("Tekst je pre novog teksta");
		if(tekst.compareTo(noviTekst)==0)
			System.out.println("Dva teksta su jednaka");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
