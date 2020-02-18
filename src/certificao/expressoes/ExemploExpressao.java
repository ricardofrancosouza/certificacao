package certificao.expressoes;

public class ExemploExpressao {
	
	public static void main(String... args){
		int k =1;
		int[] a= {1};
		/*
		 * antes de realizar a atribuiçao de (k +=) executa-se a expessao(k=4) * (k+2), sendo executado todas as operações da esquerda para a direita, assim,   a operação (k=4) k fica com 4
		 *  logo depois executa (k+2) e k fica com o valor de 6 
		 *  e é multiplicado 4*6 + k, k += esta com o valor 1, porque não modifica o valor inicial da variavel mesmo depois das expressoes serem executadas
		 */
		k += (k=4) * (k+2)+1;
		a[0] += (a[0] =4)*(a[0]+2);
		System.out.println(k+" , "+a[0]);
	}

}
