public class Risttahukas extends KõrgusegaKujund{
	double p;
	double l;
	public Risttahukas(double kõrgus, double pikkus, double laius){
		super(kõrgus);
		p=pikkus;
		l=laius;
	}
	public double põhjaPindala(){
		return p*l;
	}
}