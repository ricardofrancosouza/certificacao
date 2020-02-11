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
	 * Uma subclasse � permitida no caso de tipo de retornos serem classes
	 * O m�todo de substitui��o pode lan�ar um subconjutno de exce��o ou subclasse das exce��es lan�adas pela classe substitu�da.
	 * A cl�usula n�o ter arremessos tamb�m � valida, pois um conjunto vazio � um subconjunto v�lido
	 * Um m�todo @override n�o pode lan�ar uma exce��o que � uma superclasse da exce��o lan�ada pelo m�todo de substiui��o.
	 */
	@Override
	public Retorno2 metodoRetornoObj()throws ClassCastException {
		// TODO Auto-generated method stub
		return null;
	}


	/*
	 * (non-Javadoc)
	 * @see certificacao.heranca.sobreescrita.MetodosExemploAbstract#metodoRetornoPrimitivo()
	 * O m�todo @override n�o pode tornar o m�todo @Override mais privado
	 * O m�todo de substitui��o deve ter o mesmo tipo de retorno no caso de primitivas
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
        * n�o compila pq voce s� pode modificar o tipo de acesso para mais visivel e n�o para menos vis�vel. Aqui esta sendo 
        * void metodoPrivate(){
        * }
        */
		 
    }
	
}

