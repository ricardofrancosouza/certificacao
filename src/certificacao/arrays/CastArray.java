package certificacao.arrays;

import java.util.ArrayList;

/*
 * Elementos de matrizes de tipos primitivos são inicializados com o seu valor padrão ( ou seja, 0 para tipos inerais, 0,0 float/double e false para booleano. Elementos de matrizes de tipos não primitivos são inicializados como nulos
 * Arrays são passados por referencia. Tanto eles sendo dos tipos primitivos ou de objetos
 * Arrays são obj
 * Não podemos realizar cast de array do tipo primitivo, exemplo
 * Quando o array é de referencia(objetos) é possível realizar o cast de arrays
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
		//cast.tryNegativeArraySizeExceptionWhenRun();
		cast.testeArrayList();
		cast.getExemploDeInicializacaoDeArrays();
		cast.getExemploDeCastParaArray();
		cast.getExemploLabelFor();
		
	}
	
	private void getExemploLabelFor() {
		int [] numbers = {1,2,3,4,5};
		
		externo:
		for(int i=0; i<5;i++) {
			interno:
				for(int j =0; j<5; j++) {
					if(j==3) {
						System.out.println("quebrou o laço externo");
						break externo;
					}
					if(j<3) {
						System.out.println("proxima interacao");
						continue interno;
					}
				}
		}
		
	}

	private void getExemploDeCastParaArray() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("teste");
		System.out.println(arr.size());
		Object [] objects = arr.toArray();
		String[] strings = arr.toArray(new String[arr.size()]);
		
	}

	private void getExemploDeInicializacaoDeArrays() {
		int [] numbers;
		numbers = new int[] {1,2,3};
		//quando inicializamos um array de objtos, podemos inicializar com valores null's
		Prova provas[];
		provas = new Prova[] {new Prova(), new ProvaPratica(), null};
		
		int []number2 = {1,2,3};
		
		Prova provas2[] = {new Prova(), new ProvaPratica(), null};
		
		
	}

	public void testeArrayComPolimorfismo(){
		/*
		 * Caso a classe Prova seja abstrata, devido ao polimorfismo é possível adicionar filhas de Prova nesse array: o polimorfismo funciona normalamente, portanto funciona igualmente para interfaces
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
			 * 1º executa a funcao val()
			 * 2º lanca a excecao e i=1 não vai ser executada
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
			 * 1º executa primeiro i=0
			 * 2º executa a func val()
			 * 3º lança a execao sem comcluir o ++
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
	 * isso acontece porque a classe dos dois é distintas e a classe pai de array de string não é um array de objeto, e sim um Objeto.
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
		 * Vai printar 0, porque na condicao (sum > 20) sum é menor que 20
		 */
		for(int i = 0, j=10; sum > 20; i++, --j){
			sum = sum+ i +j;
		}
		System.out.println("Sum ="+ sum);
		sum =0;
		/*
		 * Antes da condicao (++sum >0) sum é incrementado
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
	
	public void testeArrayList() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("java");
		arr.add("java");
		arr.add("cetificacao");
		
		System.out.println("possui a palavra java no array: "+arr.contains("java"));
		arr.remove("java");
		System.out.println("possui a palavra java no array: "+arr.contains("java"));
		arr.remove("java");
		System.out.println("possui a palavra java no array: "+arr.contains("java"));
		
	}
	
	/*
	 * Ao tentarmos criar um array com tamanho negativo, ele vai compilar mas ira ser lançado a exception NegativeArraySizeException quando executar, segue exempo
	 */
	public void tryNegativeArraySizeExceptionWhenRun() {
		int [] number = new int[-1];
	}
	
	class Prova{
		
	}
	class ProvaPratica extends Prova{
		
	}
}
