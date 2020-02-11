package certificacao.heranca.sobreescrita;

public class Base {
	void methodA(){
		
	}
	
	class Sub extends Base{
		public void methodA(){
			System.out.println("sub - MethodA");
		}
		
		public void methodB(){
			System.out.println("sub - MethodB");
		}
		
	}
	public static void main(String... args){
		Base base = new Sub();
		base.methodA();
		base.methodB();
	}
}
