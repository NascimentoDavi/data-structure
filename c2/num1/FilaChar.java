package num1;

import entidades.*;

public class FilaChar {
    private NodeChar tail, head;
    private int quant;

    public FilaChar(){
        this.tail = null;
        this.head = null;
        this.quant = 0;
    }

    public boolean isEmpty(){
        if(this.quant==0){
            return true;
        }
        return false;
    }

    public int getSize(){
        return this.quant;
    }

    public NodeChar getHead(){
        return this.head;
    }

    // enqueue - enfileirar os elementos, vai pro final da fila
    public void enqueue(Item item){
        NodeChar newNode = new NodeChar(item); // segmento de pilha - variaveis locais
        if(isEmpty()){
            this.head = newNode;
        } else {
            this.tail.setProx(newNode);
        }
        this.tail = newNode;
        this.quant++;
    }

    // dequeue - desenfileirar um elemento da fila
    public NodeChar dequeue(){
        NodeChar aux = this.head; // segmento de pilha
        if(!isEmpty()){
            this.tail = tail.getProx();
            this.quant--;
        }
        return aux;
    }

    @Override
    public String toString(){
        String list = " ";
        NodeChar aux = this.head;
        for(int i=0;i<this.quant;i++){
            list += aux.getItem().toString();
            aux = aux.getProx();
        }
        return list;
    }
}
