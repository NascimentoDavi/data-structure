package lista;

import entidades.Item;

public class LCItem{

    private Item[] lista;
    private int quant;

    public LCItem(){
        this.lista = new Item[10];
        this.quant = 0;
    }

    public LCItem(int tamanho){
        this.lista = new Item[tamanho];
        this.quant = 0;
    }

    public int getTamanho(){
        return this.lista.length;
    }

    public int getQuant(){
        return this.quant;
    }

    public boolean eVazia(){
        if(this.quant == 0){
            return true;
        }
        return false;
    }

    public boolean eCheia(){
        if(this.quant == this.lista.length){
            return true;
        }
        return false;
    }

    // Retornando elemento por indexacao

    public Item getItem(int pos){
        if(pos >= 0 && pos < this.quant){
            return this.lista[pos];
        }
        return null;
    }

    public int pesquisa(int cod){

        // retorna a posicao do elemento pesquisado

        for(int i = 0; i < this.quant; i++) {
            if(this.lista[i].getCodigo() == cod){
                return i;
            }
        }
        return -1;
    }

    // adicionar item em determinada posicao

    public boolean insere(Item item, int pos){
        if(pos < 0 || pos > this.quant){
            return false;
        }
        if(this.quant == this.lista.length){
            aumenta();
        }
        for(int i = this.quant; i > pos; i--){
            this.lista[i] = this.lista[i-1];    
        }
        this.lista[i] = item;
        this.quant++;
        return true;
    }

    // metodo privado somente para aumentar lista estatica

    private void aumenta(){
        Item[] novo;
        novo = new Item[this.lista.length + this.lista.length / 2];
        for(int i = 0; i < this.quant; i++) {
            novo[i] = this.lista[i];
        }
        this.lista = novo;
    }

    public void insereInicio(Item item){
        insere(item, 0);
    }

    public void insereFinal(Item item){
        if(this.quant == this.lista.length){
            aumenta();
        }
        this.lista[this.quant] = item;
        this.quant++;
    }

}
