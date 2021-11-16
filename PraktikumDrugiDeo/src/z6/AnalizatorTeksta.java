package z6;

public class AnalizatorTeksta {
	String tekst;
	
	public AnalizatorTeksta() {
		tekst="nepoznato";
	}
	
	public AnalizatorTeksta(String uneseniTekst) {
		
		if(uneseniTekst!=null && !uneseniTekst.isEmpty())
		      this.tekst=uneseniTekst;
		else
			this.tekst="nepoznato";
		}
	}

 
