package arvore;

import java.util.Scanner;

public class App {
    public static void main(String args[]){

        Abb arv = new Abb();
        LCItem vet;

        insere(arv);
        vet = arv.CamInOrdem();
        System.out.println(vet.toString());
        vet = arv.CamPreOrdem();
        System.out.println(vet.toString());
        vet = arv.CamPosOrdem();
        System.out.println(vet.toString());
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
