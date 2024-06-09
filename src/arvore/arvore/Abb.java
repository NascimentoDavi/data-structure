package arvore;
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

    public boolean eVazia() {
        if (this.quant == 0) {
            return true;
        }
        return false;
    }

    public NoAbb pesquisa(int num) {
        return pesquisa(num, this.raiz);
    }

    private NoAbb pesquisa(int num, NoAbb no) {
        if (no == null) {
            return null;
        }
        if (num < no.getItem().getCod()) {
            return pesquisa(num, no.getEsq());
        } else if (num > no.getItem().getCod()) {
            return pesquisa(num, no.getDir());
        } else {
            return no;
        }
    }

    public boolean insere(Item item) {
        NoAbb no = pesquisa(item.getCod());
        if (no == null) {
            this.raiz = insere(item, this.raiz);
            return true;
        }
        return false;
    }

    private NoAbb insere(Item item, NoAbb no) {
        if (no == null) {
            NoAbb novoNo = new NoAbb(item);
            quant++;
            return novoNo;
        }
        if (item.getCod() < no.getItem().getCod()) {
            no.setEsq(insere(item, no.getEsq()));
        } else {
            no.setDir(insere(item, no.getDir()));
        }
        return no;
    }

    public NoAbb remove(int codigo) {
        return remove(codigo, this.raiz);
    }

    private NoAbb remove(int codigo, NoAbb no) {
        if (no == null) {
            return null;
        } else if (codigo < no.getItem().getCod()) {
            no.setEsq(remove(codigo, no.getEsq()));
        } else if (codigo > no.getItem().getCod()) {
            no.setDir(remove(codigo, no.getDir()));
        } else if (no.getDir() == null) {
            quant--;
            return no.getEsq();
        } else if (no.getEsq() == null) {
            quant--;
            return no.getDir();
        } else {
            no.setEsq(maiorEsq(no, no.getEsq()));
            quant--;
        }
        return no;
    }

    private NoAbb maiorEsq(NoAbb no, NoAbb maior) {
        // andar para a direita procurando o maior elemento
        // da sub-arvore da esquerda
        if (maior.getDir() != null) {
            maior.setDir(maiorEsq(no, maior.getDir()));
            return maior;
        } else {
            no.setItem(maior.getItem());
            return maior.getEsq();
        }
    }

    public LCItem CamInOrdem() {
        LCItem vetor = new LCItem(this.quant);
        fazCamInOrdem(vetor, this.raiz);
        return (vetor);
    }

    private void fazCamInOrdem(LCItem vetor, NoAbb no) {
        if (no != null) {
            fazCamInOrdem(vetor, no.getEsq());
            vetor.insereFinal(no.getItem());
            fazCamInOrdem(vetor, no.getDir());
        }
    }

    public LCItem CamPreOrdem() {
        LCItem vetor = new LCItem(this.quant);
        fazCamPreOrdem(vetor, this.raiz);
        return (vetor);
    }

    private void fazCamPreOrdem(LCItem vetor, NoAbb no) {
        if (no != null) {
            vetor.insereFinal(no.getItem());
            fazCamPreOrdem(vetor, no.getEsq());
            fazCamPreOrdem(vetor, no.getDir());
        }
    }
    
    public LCItem CamPosOrdem() {
        LCItem vetor = new LCItem(this.quant);
        fazCamPosOrdem(vetor, this.raiz);
        return (vetor);
    }

    private void fazCamPosOrdem(LCItem vetor, NoAbb no) {
        if (no != null) {
            fazCamPosOrdem(vetor, no.getEsq());
            fazCamPosOrdem(vetor, no.getDir());
            vetor.insereFinal(no.getItem());
        }
    }

    public Abb balancear() {
        LCItem vetor = CamInOrdem(); // retorna vetor ordenado
        Abb arvAux = new Abb();
        balancear (vetor, arvAux, 0, vetor.getQuant()-1);
        return arvAux;
	}
	
	private void balancear (LCItem vetor, Abb arv, int esq, int dir) {
		int meio;
		
		if (esq <= dir) {
			meio = (esq+dir)/2;
			arv.insere(vetor.getItem(meio));
			balancear(vetor, arv, esq, meio-1);
			balancear(vetor, arv, meio+1, dir);
		}
	}

    public int maiorValor(){
        return maiorValor(0, this.raiz);
    }

    private int maiorValor(int aux, NoAbb no){
        if(no == null){
            return aux;
        } else {
            aux = no.getItem().getCod();
            return maiorValor(aux, no.getDir());
        }
    }
}
