package arvore;

import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);
    public static void main(String args[]){

        Abb arv = new Abb();
        LCItem vet;

        insere(arv);
        vet = arv.CamInOrdem();
        System.out.println("Caminhamento In-ordem: \n"+vet.toString());
        vet = arv.CamPreOrdem();
        System.out.println("Caminhamento Pre-ordem: \n"+vet.toString());
        vet = arv.CamPosOrdem();
        System.out.println("Caminhamento Pos-ordem: \n"+vet.toString());
        System.out.println("Maior valor inserido na árvore: "+arv.maiorValor());
        System.out.println("Soma total: "+arv.somaTotal());

        System.out.print("Digite o valor de um dos nós e mostraremos os elementos da sub-árvore à direita: ");
        int valor = scan.nextInt();
        System.out.println("Elementos da sub-árvore à direita:\n"+arv.mostrarDireita(valor));

    }

    public static void insere(Abb arv){
        Scanner scan = new Scanner(System.in);
        int value = 0;

        System.out.println("**Type -1 to exit**");

        while(value != -1){
            System.out.print("value: ");
            value = scan.nextInt();
            Item item = new Item(value);
            arv.insere(item);
        }
    }

}
