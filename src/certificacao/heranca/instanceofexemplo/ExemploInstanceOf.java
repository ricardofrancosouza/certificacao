package certificacao.heranca.instanceofexemplo;

public class ExemploInstanceOf {

	public static void main(String... args){
		ExemploInstanceOf ex = new ExemploInstanceOf();
		ex.testeInstanceOf();
		
	}
	
	public void testeInstanceOf(){
		D d = new D();
		System.out.println("d é A? "+ (d instanceof A));
	
		A a = new A();
		System.out.println("a é D? "+(a instanceof D));
		
		a = d;
		System.out.println("a é D? "+(a instanceof D));
		
		B b = new D();
		System.out.println("B é D? "+(b instanceof D));
		
		B b1 = new D();
		System.out.println("B é B? "+(b1 instanceof B));
		
		B b2 = new B();
		System.out.println("B é B? "+(b2 instanceof D));
		System.out.println("B é Object? "+(b2 instanceof Object) );
		
		String str = "";
		/*
		 * O codigo não compila quando tenta utilizar o operador instanceof de uma variável String com uma classe que não seja Object ou String
		 */
		//System.out.println(str instanceof A);
		
		System.out.println("B é Interface2? "+(b2 instanceof InsterfaceT2) );
		
		
	}
	
	
	
	class A implements InterfaceT1, InsterfaceT2{
	}
	class B extends A{}
	class C extends B{}
	class D extends C{}
	
	interface InterfaceT1{}
	interface InsterfaceT2{}
	
}
