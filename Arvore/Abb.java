package Arvore;
import entidades.NoAbb;

public class Abb {

    private NoAbb root;
    private int quant;

    public Abb(){
        this.root = null;
        this.quant = 0;
    }

    public NoAbb getRoot(){
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

    public NoAbb search(int num, NoAbb node) {
        if(node == null) {
            return null;
        }
        if(num < node.getItem().getCodigo()){
            return search(num, node.getLeft());
        } else if (num > node.getItem().getCodigo()){
            return search(num, no.getRight());
        } else {
            return no;
        }
    }
}
