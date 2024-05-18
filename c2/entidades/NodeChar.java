package entidades;

public class NodeChar {
    private Item item;
    private NodeChar prox;

    public NodeChar(Item item){
        this.item = item;
        this.prox = null;
    }

    public void setItem(Item item){
        this.item = item;
    }
    public void setProx(NodeChar node){
        this.prox = node;
    }

    public Item getItem(){
        return this.item;
    }
    public NodeChar getProx(){
        return this.prox;
    }

    @Override
    public String toString(){
        return "item="+this.item.toString();
    }
}
