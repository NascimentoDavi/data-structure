package num2;

public class NoContato {
    private Contato contato;
    private NoContato prox;

    public NoContato(Contato contato){
        this.contato = contato;
        this.prox = null;
    }

    public void setContato(Contato contato){
        this.contato = contato;
    }
    public void setProx(NoContato noContato){
        this.prox = noContato;
    }

    public Contato getContato(){
        return this.contato;
    }
    public NoContato getProx(){
        return this.prox;
    }

    @Override
    public String toString(){
        return this.contato.toString();
    }
}
