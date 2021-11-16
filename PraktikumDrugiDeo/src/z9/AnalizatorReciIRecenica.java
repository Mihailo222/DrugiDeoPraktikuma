package z9;

public class AnalizatorReciIRecenica {

	String tekst="nepoznat";
	
	
	String getTekst() {
		return tekst;
	}
	
	void setTekst(String tekst) {
		if(tekst!=null && !tekst.isEmpty() )
			this.tekst=tekst;
		else
			System.out.println("Error");
		}
	
	
	String vratiTekstBezPrvogSlova() {
		return tekst.substring(1);//od 1 do poslednjeg znaci
		
	}
	
	String vratiTekstBezPrvaCetiriSlova() {
		return tekst.substring(4);//pocinjemo od 5.slova(index4, pa do kraja)		
	}
	
	
	String vratiTekstBezPrveReci() {
		if(tekst.indexOf(' ')==-1){
	      return null;
		}
		else
			return tekst.substring(tekst.indexOf(' ')+1);//pa do kraja
	}
	
	//sta ako se prva recenica zavrsava sa ! ili ?
	String vratiTekstBezPrveRecenice() {
		return tekst.substring(tekst.indexOf('.')+1);
		
	}
	
	String vratiPoslednjuRec() {
		return tekst.substring(tekst.lastIndexOf(' ')+1);
	}
	
	
	String vratiPoslednjuRecenicu() {
		if(tekst.indexOf(' ')==tekst.lastIndexOf(' '))
			return tekst.substring(tekst.lastIndexOf('.')+1);
		else
			return null;
	}
	
	String vratiDeoTekstaBezPrvogIPoslednjegSlova() {
		return tekst.substring(1, tekst.length()-1);
		// interval je[prvi koji nam treba, poslednji koji nam treba)
		//vrati od indexa 1(drugo slovo) do index posl. slova koji se ne ukljucuje
		//ali length nam govori koliko ima slova-1 zbog indexa 0
	}
	
	
	String odTrecegDoPoslednjegSlova() {
		return tekst.substring(2, tekst.length()-1);
	}
	
	/*
	String drugaRec() {
		if(tekst.indexOf(' ')==tekst.lastIndexOf(' '))
			System.out.println("Error");
		else
			return tekst.substring(tekst.indexOf(' ')+1, )
	}
	
	*/
	//kako da nadjem index drugog praznog mesta???
	
	
	
	boolean daLiSeZavrsavaSa(String nesto) {
		if(tekst.endsWith(nesto))
			return true;
		else
			return false;
		}
	
	
	
	boolean daLiPocinjeSa(String nesto) {
		if(tekst.startsWith(nesto))
			return true;
		else
			return false;
		}
	
	
	//uradi test u mainu
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
