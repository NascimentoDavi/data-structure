package num2;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args){

        FilaContato filaContato = new FilaContato();

        int opt = 0;

        while(opt != 3){

            System.out.println("\nbem vindo ao call center!\n1 - Inserir Contato;\n2 - Atendimento;\n3 - Sair");

            opt = Integer.parseInt(scan.nextLine());

            switch (opt) {
                case 1:
                    // inserirContato();    
                    break;
                case 2:
                    // atendimento();
                    break;
                
                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente");
                    break;
            }
        }
    }

    public static void inserirContato(){
        String nome, cpf, numero;

        System.out.println("nome: ");
        nome = scan.nextLine();
        System.out.println("cpf: ");
        cpf = scan.nextLine();
        System.out.println("numero: ");
        numero = scan.nextLine();

        Contato novoContato = new Contato(nome, cpf, numero);

        
    }
}
