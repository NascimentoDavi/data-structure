package arvore;

import entidades.Item;
import entidades.NoAbb;
import Lista.LCItem;

public class Abb {
    private NoAbb root;
    private int quant;
    
    /*
        Essa classe, além dos gets (observe que não faremos os sets)
        os métodos: eVAzia, searchr, inserir, remover 
        e outros métodos para visitar cada nó da árvore, 
        que veremos mais à frente. 
    */

    public Abb(){
        this.root = null;
        this.quant = 0;
    }

    public NoAbb getroot(){
        return this.root;
    }

    public int getQuant(){
        return this.quant;
    }

    public boolean isEmpty(){
        if(this.quant == 0){
            return true;
        }
        return false;
    }

    public NoAbb search(int num){
        return search(num, this.root);
    }

    public NoAbb search (int num, NoAbb node){
        if(num == 0){
            return null;
        }
        if(num < node.getItem().getCod()) {
            return pesquisa(num, node.getLeft());
        } else if (num > node.getItem().getCode()){
            return pesquisa(num, node.getRight());
        } else {
            // if finds, return it
            return node;
        }
    }
}