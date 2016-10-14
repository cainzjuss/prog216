public abstract class KõrgusegaKujund{
	double kõrgus;
	public KõrgusegaKujund(double uusKõrgus){
		kõrgus=uusKõrgus;
	}
	public abstract double põhjaPindala();
	public double ruumala(){
		return põhjaPindala()*kõrgus;
	}
}