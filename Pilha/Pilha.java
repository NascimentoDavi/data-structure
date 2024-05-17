class Pilha{
    private NoItem top; // segmento de pilha
    private int quant; // segmento de pilha

    public Pilha(){
        this.top = null;
        this.quant = 0;
    }

    public boolean isEmpty(){
        if(this.quant==0){
            return true;
        }
        return false;
    }

    public NoItem getTop(){
        return this.top;
    }

    public int getQuant(){
        return this.quant;
    }

    // push: empilhar elementos na pilha
    public void push (Item item){
        NoItem newNode = new NoItem(item); // segmento de pilha
        if(!isEmpty()){
            newNode.setProx(this.top);
        }
        this.top=newNode;
        this.quant++;
    }

    // desempilhar elementos da pilha
    public NoItem pop(){
        NoItem aux = this.top;
        if(!isEmpty()){
            this.top = this.top.getProx();
            this.quant--;
        }
        return aux;
    }

    public String toString(){
        String list = " ";
        NoItem aux = this.top;
        for(int i=0;i<this.quant;i++){
            list+=aux.getItem().toString()+"\n";
            aux = aux.getProx();
        }
        return list;
    }
}