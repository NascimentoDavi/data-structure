import entidades.Item;
import entidades.NoItem;

public class LSEitem {
    private NoItem first, last;
    private int quant;

    public LSEItem(){
        this.first = null;
        this.last = null;
        this.quant = 0;
    }
    
    public NoItem getFirst(){
        return this.first;
    }
    
    public NoItem getLast(){
        return this.last;
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

    public Item getItem(int pos){
        NoItem aux;
        int count;

        if(pos < 0 || pos >= this.quant){
            return null; 
        }

        aux = this.first;
        count = 0;
        while(count != pos){
            aux = aux.getProx();
            count++;
        }
        return aux.getItem();
    }

    public getNode(int pos){
        NoItem aux;
        int count;

        if(pos < 0 || pos >= this.quant){
            return null;
        }

        aux = this.first;
        count = 0;
        while(count != pos){
            aux = aux.getProx();
            count++;
        }
        return aux;
    }

    public NoItem search(int code){
        NoItem aux = this.first;

        while(aux != null){
            if(aux.getItem().getCode() == code){
                return aux;
            } else {
                aux = aux.getProx();
            }
        }
        return null;
    }

    public void insereInicio(Item item){
        NoItem novoNo = new NoItem(item);
        novoNo.setProx(this.first);
        this.first = novoNo;
        if(isEmpty()){
            this.last = novoNo;
        }
        this.quant++;
    }

    // insereFinal
    public void insereFinal(Item item){
        NoItem novoNo = new novoNo(item);
        if(isEmpty()){
            this.first=novoNo;
        } else {
            this.last.setProx(novoNo);
        }
        this.last = novoNo;
        this.quant++;
    }

    // insere
    public void insere(Item item, int pos){
        
    }
}
