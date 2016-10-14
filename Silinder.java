public class Silinder extends KõrgusegaKujund{
	double r;
	public Silinder(double kõrgus, double raadius){
		super(kõrgus);
		r=raadius;
	}
	public double põhjaPindala(){
		return 3.14*r*r;
	}
}