public class Item {
    private char character;

    public Item(){
        this.character = ' ';
    }

    public Item(char character){
        this.character = character;
    }

    public char getChar(){
        return this.character;
    }
    public void setChar(char character){
        this.character = character;
    }

    @Override
    public String toString(){
        return "Char="+this.character;
    }
}
