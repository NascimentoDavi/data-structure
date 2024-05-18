package num1;

import entidades.*;

public class PilhaChar {
    private NodeChar top;
    private int quant;

    public PilhaChar(){
        this.top = null;
        this.quant = 0;
    }

    public boolean isEmpty(){
        if(this.quant == 0){
            return true;
        }
        return false;
    }

    public NodeChar getTop(){
        return this.top;
    }

    public int getSize(){
        return this.quant;
    }

    public void push(Item item){
        NodeChar newNode = new NodeChar(item); // segmento de pilha
        if(!isEmpty()){
            newNode.setProx(this.top);
        }
        this.top = newNode;
        this.quant++;
    }

    public NodeChar pop(){
        NodeChar aux = this.top;
        if(!isEmpty()){
            this.top = this.top.getProx();
            this.quant--;
        }
        return aux;
    }

    @Override
    public String toString(){
        String list = "";
        NodeChar aux = this.top;
        for(int i=0;i<this.quant;i++){
            list += aux.getItem().toString()+"\n";
            aux = aux.getProx();
        }
        return list;
    } 
}
