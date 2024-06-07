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
        if(this.root == null){
            return true;
        }
        return false;
    }

    // public NoAbb search(int num){
    //     return search(num, this.root); // to guarantee the first node will be the root
    // }

    // public NoAbb search(int num, NoAbb node){
    //     // null root or element was not found
    //     if(node == null){
    //         return null;
    //     }
    //     if(num < node.getItem().getCod()) {
    //         return search(num, node.getLeft());
    //     } else if (num > node.getItem().getCode()){
    //         return search(num, node.getRight());
    //     } else {
    //         // if finds, return it
    //         return node;
    //     }
    // }

    public NoAbb search(int cod){
        return search(cod, this.root);
    }

    private NoAbb search(int cod, NoAbb node){
        if(node == null){
            return null;
        } else {
            if(cod < node.getItem().getCod()){
                return search(cod, node.getLeft());
            } else if (cod > node.getItem().getCod()){
                return search(cod, node.getRight());
            } else {
                return node;
            }
        }
    }

    // public boolean insert(int cod){
    //     if(this.search(cod) != null){
    //         return false;
    //     } else {
    //         this.root = insert(cod, this.root);
    //         this.quant++;
    //     }
    // }
    
    // private NoAbb insert(int cod, NoAbb node){
    //     // root is empty
    //     if(node == null){
    //         NoAbb newNode = new NoAbb(cod);
    //         return newNode;
    //     } else {
    //         if(cod > node.getItem().getCod()){
    //             node.setRight(insert(cod, node.getRight()));
    //         } else {
    //             node.setLeft(insert(cod, node.getLeft()));
    //         }
    //         return node;
    //     }
    // }

        public boolean insert(int cod){
            if(this.search(cod) != null) {
                return false;
            } else {
                this.root = insert(cod, this.root);
                this.quant++;
                return true;
            }
        }

        private NoAbb insert(int cod, NoAbb node){
            // if root is empty
            if(node == null){
                NoAbb newNode = new NoAbb(cod);
                return newNode;
            } else {
                if(cod > node.getItem().getCod()){
                    node.setRight(insert(cod, node.getRight()));
                } else {
                    node.setLeft(insert(cod, node.getLeft()));
                }
                return node;
            }
        }

        public booleam remover(int cod){
            if(remover(cod, this.root) == null){
                return false;
            }
            return true;
        }
        
        private NoAbb remover(int cod, NoAbb node){
            
            // if root is empty
            if(no == null){
                return null;
            }
            
            if(cod < node.getItem().getCod()){
                node.setLeft(remover(cod, node.getLeft()));
            } else if (cod > node.getItem().getCod()){
                node.setRight(remover(cod, node.getRight()));

                // if right is null, returns left
            } else if (node.getRight() == null) {
                return node.getLeft();

                // if theres on right, asks for left
                // if its null, returns
            } else if (node.getLeft() == null){
                return node.getRight();
            }
        }
}