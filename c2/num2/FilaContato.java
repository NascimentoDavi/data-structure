package num2;

public class FilaContato {
    private NoContato head, tail;
    private int quant;

    public FilaContato(){
        this.head = null;
        this.tail = null;
        this.quant = 0;
    }

    public boolean isEmpty(){
        if(this.quant == 0){
            return true;
        }
        return false;
    }

    public NoContato getHead(){
        return this.head;
    }

    public int getQuant(){
        return this.quant;
    }

    public void enqueue(Contato contato){
        NoContato newNoContato = new NoContato(contato);
        if(isEmpty()){
            this.head = newNoContato;
        } else {
            this.tail.setProx(newNoContato);
        }
        this.tail = newNoContato;
        this.quant++;
    }

    public NoContato dequeue(){
        NoContato aux = this.head;
        if(!isEmpty()){
            this.head = this.head.getProx();
            this.quant--;
        }
        return aux;
    }

    @Override
    public String toString(){
        String list = " ";
        NoContato aux = this.head;
        for(int i = 0; i < this.quant; i++){
            list += aux.getContato().toString()+"\n";
            aux = aux.getProx();
        }
        return list;
    }
}
