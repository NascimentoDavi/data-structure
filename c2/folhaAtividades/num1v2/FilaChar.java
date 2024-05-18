package folhaAtividades.num1v2;
import entidades.Item;
import entidades.NodeChar;

public class FilaChar {
    private NodeChar head, tail;
    private int quant;

    public FilaChar(){
        this.head = null;
        this.tail = null;
        this.quant = 0;
    }

    public NodeChar getHead(){
        return this.head;
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

    public void enqueue(Item item){
        NodeChar newNode = new NodeChar(item);
        if(isEmpty()){
            this.head = newNode;
        } else {
            this.tail.setProx(newNode);
        }
        this.tail = newNode;
        this.quant++;
    }

    public NodeChar dequeue(){
        NodeChar aux = this.head;
        if(!isEmpty()){
            this.head = this.head.getProx();
            this.quant--;
        }
        return aux;
    }

    @Override
    public String toString(){
        String list = "";
        NodeChar aux = this.head;
        for(int i = 0; i < this.quant;i++){
            list += aux.getItem().toString()+"\n";
            aux = aux.getProx();
        }
        return list;
    }
}
