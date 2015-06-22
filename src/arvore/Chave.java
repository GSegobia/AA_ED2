package arvore;

public class Chave {
	
	private int valor;
	private Chave proxima;
	
	public Chave(int valor){
		
		this.valor = valor;
	}
	
	public int exibirValor(){
		
		return this.valor;
	}
	
	public void proximaChave(Chave chave){
		
		this.proxima = chave;
	}
}
