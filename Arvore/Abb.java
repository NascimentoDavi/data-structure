package arvore;

import entidades.Item;
import entidades.NoAbb;
import Lista.LCItem;

public class Abb {
    private NoAbb raiz;
    private int quant;
    
    /*
        Essa classe, além dos gets (observe que não faremos os sets)
        os métodos: eVAzia, pesquisar, inserir, remover 
        e outros métodos para visitar cada nó da árvore, 
        que veremos mais à frente. 
    */

    public Abb() {
        this.raiz = null;
        this.quant = 0;
    }

    public NoAbb getRaiz() {
        return raiz;
    }

    public int getQuant() {
        return quant;
    }
    public boolean eVazia (){
        if (this.quant == 0){
            return true;
        }
        return false;
    }
    
    public NoAbb pesquisa(int cod){
        return pesquisa(cod, this.raiz);
    }

    public NoAbb pesquisa(int cod, NoAbb no){
        if(no == null){
            return null;
        }
        if(cod < no.getItem.getCodigo()){
            return pesquisa(cod, no.getLeft());
        } else if (cod > no.getItem().geCodigo()){
            return pesquisa(cod, no.getRight());
        } else {
            return no;
        }

        // se achar retorna o proprio no;
        // se raiz nula, retorna null;
        // se nao achar, retorna null;

    }

    public boolean insere(Item item){
        NoAbb aux = pesquisa(item.getCodigo());

        // se for arvore vazia ou nao achar o elemento especificado pelo codigo

        if(aux == null){
            this.raiz = insere(item, this.raiz);
            return true;
        }

        // caso ja esteja na arvore, nao insere novamente

        return false;
    }

    private NoAbb insere(Item item, NoAbb no){
        if(no == null){
            NoAbb novoNo = new NoAbb(item);
            this.quant++;
            return novoNo;
        }
        if(item.getCodigo() < no.getItem().getLeft()){
            no.setLeft(insere(item, no.getLeft()));
        } else {
            no.setRight(item, no.getRight());
        }

        // se achar o elemento, nao insere novametne

        return no;
    }

    public NoAbb remove(int num){
        remove(num, this.raiz);
    }

    private NoAbb remove(int num, NoAbb no){
        if(no == null){
            return null;
        } else if (num < no.getItem().getCodigo()){
            no.setLeft(remove(no.getEsq()));
        } else if(num > no.getItem().getCodigo()){
            no.setRigth(remove(no.getRight()));
        } else if (no.getRigth()==null) {
            this.quant--;
            return no.getLeft();
        } else if (no.getLeft()==null) {
            this.quant--;
            return no.getRight();
        } else {
            no.setLeft(biggerLeft(no, no.getLeft()));
        }
    }

    private NoAbb biggerLeft(NoAbb no, NoAbb bigger){
        if(bigger == null){
            bigger.setRight(biggerLeft(no, no.getRight()));
        } else {
            no.setItem(bigger.getItem());
            return bigger.getLeft();
        }
    }
}
