public class Fila {
    private NoItem head, tail;
    private int quant;

    public Fila(){
        this.head = null;
        this.tail = null;
        this.quant = 0;
    }

    public boolean isEmpty(){
        if(this.quant==0){
            return true;
        }
        return false;
    }

    public int getQuant(){
        return this.quant;
    }

    public NoItem getHead(){
        return this.head;
    }

    // enqueue: enfileirar, colocar no final
    // insercoes sao feitas no final da fila
    public void enqueue(Item item){
        NoItem newNode = new NoItem(item);
        if(isEmpty()){
            this.head = newNode;
        } else {
            this.head = this.head.getProx();
        }
        this.tail = newNode;
        this.quant++;
    }

    // enquanto remocoes sao feitas no inicio da mesma
    public NoItem dequeue(){
        NoItem aux = this.head; // segmento de pilha
        if(!isEmpty()){
            this.tail = tail.getProx(); // null
            this.quant--;
        }
        return aux;
    }

    @Override
    public String toString(){
        String list = " ";
        NoItem aux = this.head;
        for(int i=0;i<this.quant;i++){
            list += aux.getItem().toString()+"\n";
            aux = aux.getProx();
        }
        return list;
    }
}
