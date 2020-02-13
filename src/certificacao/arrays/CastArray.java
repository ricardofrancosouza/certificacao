package certificacao.arrays;

/*
 * Elementos de matrizes de tipos primitivos s�o inicializados com o seu valor padr�o ( ou seja, 0 para tipos inerais, 0,0 float/double e false para booleano. Elementos de matrizes de tipos n�o primitivos s�o inicializados como nulos
 * Arrays s�o passados por referencia. Tanto eles sendo dos tipos primitivos ou de objetos
 * Arrays s�o obj
 * N�o podemos realizar cast de array do tipo primitivo, exemplo
 * Quando o array � de referencia(objetos) � poss�vel realizar o cast de arrays
 */
public class CastArray {

	public static void main(String... args){
		CastArray cast = new CastArray();
		cast.atribuicaoSemCastArray();
		cast.exceptionClassCastException();
		cast.testeArrayComPolimorfismo();
		cast.getOrdemArray();
		cast.getOrdemArray2();
		cast.getOrdemArray3();
		
		cast.sum();
	}
	
	public void testeArrayComPolimorfismo(){
		/*
		 * Caso a classe Prova seja abstrata, devido ao polimorfismo � poss�vel adicionar filhas de Prova nesse array: o polimorfismo funciona normalamente, portanto funciona igualmente para interfaces
		 */
		Prova[] provas = new Prova[2];
		provas[0] = new Prova();
		provas[1] = new ProvaPratica();
	}
	
	
	public void getOrdemArray(){
		int[][] a = {{00,01},{10,11}};
		int i = 99;
		try{
			/*
			 * 1� executa a funcao val()
			 * 2� lanca a excecao e i=1 n�o vai ser executada
			 *
			 */
			a[val()][i=1]++;
		}catch(Exception e){
			System.out.println(i+", "+a[1][1]);
		}
	}
	public void getOrdemArray2(){
		int[][] a = {{00,01},{10,11}};
		int i = 99;
		try{
			/*
			 * 1� executa primeiro i=0
			 * 2� executa a func val()
			 * 3� lan�a a execao sem comcluir o ++
			 */
			a [i=0][val()]++;
		}catch(Exception e){
			System.out.println(i+", "+a[1][1]);
		}
	}
	
	public void getOrdemArray3(){
		int[][] a = {{00,01},{10,11}};
		int i = 99;
		try{
			a [i=1][i=1]++;
			++a [i=1][i=0];
			System.out.println(i+", "+a[1][0]);
			System.out.println(i+", "+a[1][1]++);
		}catch(Exception e){
			System.out.println(i+", "+a[1][1]);
		}
	}
	public int val()throws Exception{
		throw new Exception("unimplemented");
	}
	
	public void testeArrayComPolimorfismoErroCompilacao(){
		/*ProvaPratica[] provas = new ProvaPratica[2];
		provas[0] = new Prova();
		provas[1] = new ProvaPratica();*/
	}
	
	public void tentativaCastArrayPrimitivos() {
		int[] valores = new int[10];
		// nao compila
		// long[] vals = valores;
	}

	public void atribuicaoSemCastArray() {
		String[] valores = new String[2];
		valores[0] = "Bruce Wayne";
		valores[1] = "Arthur Fleck";

		Object[] vals = valores;
		for (Object valor : vals) {
			System.out.println(valor);
		}
	}
	/*
	 * isso acontece porque a classe dos dois � distintas e a classe pai de array de string n�o � um array de objeto, e sim um Objeto.
	 * Todo array herda de Object
	 */
	public void exceptionClassCastException() {
		Object[] valores = new Object[2];
		valores[0] = "Batman";
		valores[1] = "Coringa";
		try {
			String[] vals = (String[]) valores;
			for (Object valor : vals) {
				System.out.println(valor);
			}
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
			Object[] ob = new Object[2];
			String[] strings = new String[2];
			System.out.println(ob.getClass().getName());
			System.out.println(strings.getClass().getName());
			System.out.println(ob.getClass().getSuperclass());
			System.out.println(strings.getClass().getSuperclass());
			
		}

	}
	
	public void sum(){
		int sum =0;
		/*
		 * Vai printar 0, porque na condicao (sum > 20) sum � menor que 20
		 */
		for(int i = 0, j=10; sum > 20; i++, --j){
			sum = sum+ i +j;
		}
		System.out.println("Sum ="+ sum);
		sum =0;
		/*
		 * Antes da condicao (++sum >0) sum � incrementado
		 */
		for(int i = 0, j=10; ++sum >0 && sum<2; i++, --j){
			sum = sum+ i +j;
		}
		sum =0;
		for(int i = 0, j=10; ++sum >0 && ++sum<2; i++, --j){
			sum = sum+ i +j;
		}
		System.out.println("Sum ="+ sum);
		sum =0;
		for(int i = 0, j=10; sum++ <1; i++, --j){
			sum = sum+ i +j;
		}
		System.out.println("Sum ="+ sum);
	}
	class Prova{
		
	}
	class ProvaPratica extends Prova{
		
	}
}
