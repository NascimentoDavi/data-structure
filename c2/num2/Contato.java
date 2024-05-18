package num2;

public class Contato {

    private String nome;
    private String cpf;
    private String numero;

    public Contato(){
        this.nome  = "";
        this.cpf = "";
        this.numero = "";
    }

    public Contato(String nome, String cpf, String numero){
        this.nome = nome;
        this.cpf = cpf;
        this.numero = numero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getNome(){
        return this.nome;
    }
    public String getCPF(){
        return this.cpf;
    }
    public String getNumero(){
        return this.numero;
    }

    @Override
    public String toString(){
        return "Nome=" + this.nome + " | CPF=" + this.cpf + " | Numero=" + this.numero;
    }
}
