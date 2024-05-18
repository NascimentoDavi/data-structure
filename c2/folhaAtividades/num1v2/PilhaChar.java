package folhaAtividades.num1v2;
import entidades.Item;
import entidades.NodeChar;

public class PilhaChar {
    private NodeChar top;
    private int quant;

    public PilhaChar(){
        this.top = null;
        this.quant = 0;
    }

    public NodeChar getTop(){
        return this.top;
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

    public void push(Item item){
        NodeChar newNode = new NodeChar(item);
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

    // toString()
}
