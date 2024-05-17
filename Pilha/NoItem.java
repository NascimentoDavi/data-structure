class NoItem {
    private Item item;
    private NoItem prox;

    public NoItem(Item item){
        this.item = item;
        this.prox = null;
    }

    public Item getItem(){
        return this.item;
    }

    public void setItem(Item item){
        this.item = item;
    }

    public NoItem getProx(){
        return this.prox;
    }

    public void setProx(NoItem prox){
        this.prox = prox;
    }

    @Override
    public String toString(){
        return "item=" + item;
    }
}