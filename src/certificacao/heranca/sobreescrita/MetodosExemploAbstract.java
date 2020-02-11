package certificacao.heranca.sobreescrita;

import certificacao.heranca.sobreescrita.tiposretornos.InterfaceRetorno;
import certificacao.heranca.sobreescrita.tiposretornos.Retorno1;
import certificacao.heranca.sobreescrita.tiposretornos.RetornoTypeInterface;

public abstract class MetodosExemploAbstract {
	public abstract Retorno1 metodoRetornoObj()throws RuntimeException;
	protected abstract int metodoRetornoPrimitivo()throws RuntimeException;
	
	 abstract InterfaceRetorno metodoInterfaceRetorno();
	

	public abstract RetornoTypeInterface metodoRetornoTypeInterface();
}
