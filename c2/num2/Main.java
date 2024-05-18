package num2;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static FilaContato filaContato = new FilaContato();
    
    public static void main(String[] args){

        int opt = 0;

        while(opt != 3){

            System.out.print("\nbem vindo ao call center!\n1 - Inserir Contato;\n2 - Atendimento;\n3 - Sair\n: ");

            opt = Integer.parseInt(scan.nextLine());

            switch (opt) {
                case 1:
                    inserirContato();   
                    break;

                case 2:
                    try {
                        System.out.println(atendimento());
                    } catch (Exception e){
                        System.out.println("Fila de atendimentos está vazia!");
                        continue;
                    }
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

        System.out.print("nome: ");
        nome = scan.nextLine();
        System.out.print("cpf: ");
        cpf = scan.nextLine();
        System.out.print("numero: ");
        numero = scan.nextLine();

        Contato novoContato = new Contato(nome, cpf, numero);

        filaContato.enqueue(novoContato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public static Contato atendimento(){
        return filaContato.dequeue().getContato();
    }
}
