package arvore;

public class LCItem {
	private Item[] lista;
	private int quant;
	
	public LCItem() {
		this.lista = new Item[10];
		this.quant = 0;
	}
	
	public LCItem(int tamanho) {
		this.lista = new Item[tamanho];
		this.quant = 0;
	}
	
	public int tamanho () {
		return this.lista.length;
	}
	
	public int getQuant() {
		return this.quant;
	}
	/*
	 * eVazia() => retorna verdadeiro se a lista estiver vazia e 
	 *             falso caso contrário.
	 */
	public boolean eVazia() {
		if (this.quant==0) {
			return true;
		}
		return false;
	}
	
	public boolean eCheia() {
		if (this.quant==this.lista.length) {
			return true;
		}
		return false;
	}
	
	public Item getItem (int pos) {
		if (pos>=0 && pos<this.quant) {
			return this.lista[pos];
		}
		return null;
	}
	
	public int pesquisa (int cod) {
		for (int i = 0; i<quant; i++) {
			if (this.lista[i].getCod() == cod) {
				return i;
			}
		}
		return -1;
	}

	public boolean insere (Item item, int pos) {
		if (pos<0 || pos>quant) {// posicao invalida
			return false;
		}
		if (quant==this.lista.length) {
			aumenta();
		}
		for (int i = quant; i> pos; i--) {
			this.lista[i] = this.lista[i-1];
		}
		this.lista[pos] = item;
		this.quant++;
		return true;
	}
	
	public void insereInicio (Item item) {
		insere (item, 0);
	}
	
	public void insereFinal (Item item) {
		if (quant==this.lista.length) {
			aumenta();
		}
		this.lista[quant] = item;
		this.quant++;
	}
	
	private void aumenta() {
		Item[] novo;
		novo = new Item[lista.length+lista.length/2];
		for (int i=0; i<this.quant; i++) {
			novo[i] = this.lista[i];
		}
		this.lista = novo;
	}
	
	public Item remove (int cod) {
		Item aux;
		int pos = this.pesquisa(cod);
		if (pos==-1) {
			return null;
		}
		aux = this.lista[pos];
		for (int i = pos; i<quant-1; i++) {
			this.lista[i] = this.lista[i+1];
		}
		this.lista[quant-1] = null;
		this.quant--;
		return aux;
	}
	
	public Item removePos (int pos) {
		Item aux;
		if (pos<0 || pos>=quant) {
			return null;
		}
		aux = this.lista[pos];
		for (int i = pos; i<quant-1; i++) {
			this.lista[i] = this.lista[i+1];
		}
		this.lista[quant-1] = null;
		this.quant--;
		return aux;
	}
	
	public String toString () {
		String aux = "";
		for (int i=0; i<this.quant; i++) {
			aux += this.lista[i].toString();
		}
		return aux;
	}
	
}
