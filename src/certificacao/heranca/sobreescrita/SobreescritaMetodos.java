package certificacao.heranca.sobreescrita;

import certificacao.heranca.sobreescrita.tiposretornos.InterfaceRetorno;
import certificacao.heranca.sobreescrita.tiposretornos.Retorno2;
import certificacao.heranca.sobreescrita.tiposretornos.RetornoTypeInterface;

public class SobreescritaMetodos extends MetodosExemploAbstract {

	public static void main(String... args){
		SobreescritaMetodos sob = new SobreescritaMetodos();
		System.out.println(sob.metodoRetornoTypeInterface().getVal());
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see certificacao.heranca.sobreescrita.MetodosExemploAbstract#metodoRetornoObj()
	 * Uma subclasse é permitida no caso de tipo de retornos serem classes
	 * O método de substituição pode lançar um subconjutno de exceção ou subclasse das exceções lançadas pela classe substituída.
	 * A cláusula não ter arremessos também é valida, pois um conjunto vazio é um subconjunto válido
	 * Um método @override não pode lançar uma exceção que é uma superclasse da exceção lançada pelo método de substiuição.
	 */
	@Override
	public Retorno2 metodoRetornoObj()throws ClassCastException {
		// TODO Auto-generated method stub
		return null;
	}


	/*
	 * (non-Javadoc)
	 * @see certificacao.heranca.sobreescrita.MetodosExemploAbstract#metodoRetornoPrimitivo()
	 * O método @override não pode tornar o método @Override mais privado
	 * O método de substituição deve ter o mesmo tipo de retorno no caso de primitivas
	 */
	@Override
	public int metodoRetornoPrimitivo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RetornoTypeInterface metodoInterfaceRetorno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RetornoTypeInterface metodoRetornoTypeInterface() {
		// TODO Auto-generated method stub
		InterfaceRetorno ifRetorno = new RetornoTypeInterface();
		return  (RetornoTypeInterface)ifRetorno;
	}
	
	class ClasseAcessoPrivado {
		protected  void metodoPrivate(){
        	
        }
    }
	
	class ClasseAcessoPrivadoModificado extends ClasseAcessoPrivado {
       /*
        * (non-Javadoc)
        * @see certificacao.heranca.sobreescrita.SobreescritaMetodos.ClasseAcessoPrivado#metodoPrivate()
        * não compila pq voce só pode modificar o tipo de acesso para mais visivel e não para menos visível. Aqui esta sendo 
        * void metodoPrivate(){
        * }
        */
		 
    }
	
}

