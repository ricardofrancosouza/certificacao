package certificacao.heranca.sobreescrita;

public class SobreescritaMetodosStaticos {

	 static class A{
		int i = 10;
		public static void m1(){
			
		}
	}
	class B extends A{
		int i = 20;
		/*
		 * M�todos estaticos n�o sao sobreescritos
		 */
		public static void m1(){
			
		}
		public void m2(){
			
		}
	}
}
