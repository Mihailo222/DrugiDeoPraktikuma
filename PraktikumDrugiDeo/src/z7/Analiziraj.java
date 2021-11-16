package z7;

public class Analiziraj {
public static void main(String[] args) {
	AnalizatorTeksta text1;
	AnalizatorTeksta text2;
	
	text1= new AnalizatorTeksta();
	text2=new AnalizatorTeksta();
	
	
	String a1=text1.postaviTekst("Danas je lep dan");
	String a2=text2.postaviTekst("Juce smo se lepo druzili");
	
	//ovom metodom ne mozemo imenovati prom, jer ne vraca nista-void je
    //ove metode dodaju ove vrednosti na promenljivu tekst i menjaju je
	text1.dodajNoviNaPocetak("Marko: ");
	text2.dodajNoviTekstNaKrajPrethodnog(", rekla je Mia");
	

	System.out.println(a1);
	System.out.println(a2);
	//mogli smo i samo onu metodu sto vraca txt da iskoristimo
	
	System.out.println(text1.getTekst());
	System.out.println(text2.getTekst());
	
	
}
}
