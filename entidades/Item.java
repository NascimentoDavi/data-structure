public class Item {
    private int code;
    private String name;

    public Item(){
        this.code = 0;
        this.name = "";
    }

    public Item(int code, String name){
        this.code = code;
        this.name = name;
    }

    public int getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }
    public void setCode(int code){
        this.code = code;
    }
    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "Code="+this.code+", Name="+this.name;
    }
}
