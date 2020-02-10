package certificacao.variaveis;

public class TesteVariaveis {

	static double percent;
	int offset = 10, base = 50;
	
	
	public static double calc(double value){
		int coupon, offset, base;
		if(percent < 10){
			coupon = 15;
			offset = 20;
			base = 10;
		}
		//não compila porque as variaveis locais não foram estanciadas
		return coupon* offset*base*value/100;
	}
	public static void main(String[] args) {
		System.out.print(calc(100));
	}

}
