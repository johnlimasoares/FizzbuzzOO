
public abstract class FizzBuzzExtends {
	public ImpressoraImplements impressora = new ImpressoraPadrao();	
	
	public void print(Object value) throws Exception{	
		if(impressora == null){
			throw new Exception("� necess�rio vincular uma impressora.");
		}
		
		impressora.imprimir(value);
	}
	
	public boolean isThis(int value) throws Exception{
		return false;
	};
}
