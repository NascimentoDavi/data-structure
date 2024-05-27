package entidades;

public class NoAbb {
    private Item item;
    private NoAbb right;
    private NoAbb left;

    public NoAbb(Item item){
        this.item = item;
        this.right = null;
        this.left = null;
    }

    public Item getItem(){
        return this.item;
    }

    public NoAbb getLeft(){
        return this.left;
    }

    public NoAbb getRight(){
        return this.right;
    }

    public void setLeft(Item item){
        this.left = item;
    }

    public void setRight(Item item){
        this.right = item;
    }

    public void setItem(Item item){
        this.item = item;
    }

}
