package z2;

public class Test {
public static void main(String[] args) {
	

	OceneNaIspitnomRoku o;
	o=new OceneNaIspitnomRoku();
	
	
	o.postaviOcenu(10);
	o.postaviOcenu(9);
	o.postaviOcenu(8);
	o.postaviOcenu(10);
	o.postaviOcenu(10);
	o.postaviOcenu(10);
	
	o.ispisi();
	
}
}