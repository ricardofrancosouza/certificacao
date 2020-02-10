package certificacao.heranca.interfaces;

public class ExemploInterfaceHeranca {
	C1 o1;
	C2 o2;
	C3 o3;
	public static void main(String[] args) {
		ExemploInterfaceHeranca ex = new ExemploInterfaceHeranca();
	}
	
	
	
	public ExemploInterfaceHeranca() {
		super();
		
		
		this.o1 = new C1();
		C2 o2 = new C2();;
		o2.testI2();
		
		
		C3 o3 = new C3();
		o3.testI1();
		o3.testI2();
		
		C4 c4 = new C4();
		c4.testI1();
		c4.testI2();

		//testando se ira ser printado os mesmo valores da classe C4
		C3 c3Exc = new C4();
		c3Exc.testI2();
		//testando se ira ser printado os mesmo valores da classe C3 mesmo sendo referenciada a classe c4
		c3Exc.testVarLocal();
		
		//testando se ira ser printado os mesmo valores da classe C3
		c3Exc = new C3();
		c3Exc.testI2();
		
		//testando se ira ser printado os mesmo valores da classe C2
		I2 i2 = new C2();
		i2.testI2();
		
		//testando se ira ser printado os mesmo valores da classe C3
		i2 =  c3Exc;
		i2.testI2();
		
	}



	interface I1 {
		public void testI1();
	}

	interface I2 {
		public void testI2();
	}

	class C1 implements I1 {

		@Override
		public void testI1() {
			System.out.println("teste i1");
			
		}
	}

	class C2 implements I2 {
		String value = "C2";
		@Override
		public void testI2() {
			System.out.println("testando c2");
			System.out.println(value);
			
		}
	}

	class C3 extends C1 implements I2 {
		 int  value = 3;
		@Override
		public void testI2() {
			System.out.println("testando c3");
			System.out.println(value);
		}
		public void testVarLocal() {
			System.out.println("testando var local c3");
			System.out.println(value);
		}
	}
	
	//nao foi preciso implementar os metods de i1 e i2 porque os metodos dos mesmos são implementados em c3
	class C4 extends C3 implements I1, I2 {
		int value = 4;
		@Override
		public void testI2() {
			System.out.println("testando c4");
			System.out.println(value);
		}
		
		public void testVarLocal2() {
			System.out.println("testando var local c4");
			System.out.println(value);
		}
		
	}
	

}
