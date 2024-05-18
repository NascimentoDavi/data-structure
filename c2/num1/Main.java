import java.util.Scanner;
import entidades.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        PilhaChar pilha = new PilhaChar();

        String input;
        do {
            System.out.print("Digite uma sequencia de caractéres e verificaremos se é palindromo ou nao\n: ");
            input = scan.nextLine().replaceAll("\\s+", "").toLowerCase(); // remove os espacos em branco

            if(!verificarString(input)){
                break;
            };
            
            addCharPilha(input, pilha);
            
            if(verificarPalindromo(input, pilha)){
                System.out.println(input + ": palindromo\n");
            } else {
                System.out.println(input + ": nao e palindromo\n");
            }

        } while (verificarString(input));

        System.out.println("Devem ser digitas apenas letras");
    }

    public static void addCharPilha(String str, PilhaChar pilha){
        for(int i=0;i<str.length();i++){
            Item item = new Item(str.charAt(i));
            pilha.push(item);
        }
    }

    public static boolean verificarString(String str){
        char c;
        for(int i=0;i<str.length();i++){
            c = str.charAt(i);
            if('a' <= c && c <= 'z'){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean verificarPalindromo(String str, PilhaChar pilha){
        String reversedStr = "";
        while(!pilha.isEmpty()){
            reversedStr += pilha.pop().getItem().getChar();
        }
        if(str.equals(reversedStr)){
            return true;
        }
        return false;
    }
}
