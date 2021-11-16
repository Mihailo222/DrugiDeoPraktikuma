package z1;

public class MesecniProfit {
double[] profit= new double[12];// meseci od indexa 0 do indexa 11


void unesiProfit(double unesenProfit, int mesec) {
	profit[mesec-1]=unesenProfit; //indeks januara je0, feb1..do 11
}


void ispisi() {
	for(int i=0;i<profit.length;i++)
		System.out.println(profit[i]);
}

}
