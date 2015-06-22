package arvore;

public class Pagina {
	
	private int numChaves;
	private Pagina[] filhos;
	private Chave primeira;
	boolean folha;
	
	public Pagina(int ordem, int valor){
		
		numChaves = 0;
		filhos = new Pagina[2 * ordem + 1]; //Raiz(2---2D+1) | Páginas(D---2D+1) 
		chaves = new int[2 * ordem];//Raiz(1---2D) | Páginas(D---2D)	
	}
	
	private boolean verificaFilhos(){
		
		if(filhos[filhos.length - 1] != null)
			return true;
		else
			return false;
	}
}