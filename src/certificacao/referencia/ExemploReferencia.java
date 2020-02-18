package certificacao.referencia;

import javax.print.attribute.SetOfIntegerSyntax;

public class ExemploReferencia {
	public static void main(String... args){
	
		ExemploReferencia ex = new ExemploReferencia();
		ex.teste();
		
		
	}
	
	
	private  void teste() {
		// TODO Auto-generated method stub
		final Holder a = new Holder(5);
		Holder b = new Holder(10);
		a.link = b;
		b.link = setIt(a,b);
		System.out.println(a.link.value +" "+ b.link.value);
	}


	class Holder{
		int value =1;
		Holder link;
		public Holder(int val){
			this.value = val;
		}
		
	}
	public Holder setIt(final Holder a, final Holder b){
		a.link = b.link;
		return a;
	}
	
	
	
 
}
