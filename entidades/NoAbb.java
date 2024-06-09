package arvore;

public class NoAbb {
    private Item item;
    private NoAbb esq, dir;

    public NoAbb(Item item) {
        this.item = item;
        this.dir = null;
        this.esq = null;
    }

    public Item getItem() {
        return item;
    }

    public NoAbb getEsq() {
        return esq;
    }

    public NoAbb getDir() {
        return dir;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setEsq(NoAbb esq) {
        this.esq = esq;
    }

    public void setDir(NoAbb dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "NoAbb{" + "item=" + item + '}';
    }
    
}
