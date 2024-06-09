package arvore;
public class Item {

    private int cod;

    public Item(){
        this.cod = 0;
    }

    public Item(int cod){
        this.cod = cod;
    }

    public int getCod(){
        return this.cod;
    }

    public void setCod(int cod){
        this.cod = cod;
    }

    @Override
    public String toString(){
        return this.cod + " | ";
    }
}