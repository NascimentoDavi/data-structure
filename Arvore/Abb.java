package arvore;

import entidades.Item;
import entidades.NoAbb;
import Lista.LCItem;

public class Abb {
    private NoAbb root;
    private int quant;
    
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

    public NoAbb search(int num, NoAbb node){
        if(node == null){
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

    public boolean insert(Item item){
        NoAbb node = search(item.getCodigo());
      
        if(node == null){
            this.root = insert(item, this.root);
            return true;
        }
        return false;
    }

    private NoAbb insert(Item item, NoAbb node){
        if(node == null){
            NoAbb newNode = new NoAbb(item);
            this.quant++;
            return newNode;
        }
        if(item.getCod() < node.getItem().getCod()){
            node.setLeft(insert(item, node.getLeft()));
        } else {
            node.setRight(insert(item, node.getLeft()));
        }
        return node;
    }

    public NoAbb remove(int cod){
        return remove(codigo, this.root;)
    }

    private NoAbb remove(int cod, NoAbb node){

    }
}