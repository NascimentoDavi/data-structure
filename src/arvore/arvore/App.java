package arvore;

import java.util.Scanner;

public class App {
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
    }

    public static void insere(Abb arv){
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 12; i++){
            System.out.print("value: ");
            int value = scan.nextInt();
            Item item = new Item(value);
            arv.insere(item);
        }

        scan.close();
    }

}
