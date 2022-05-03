package Conta;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private String dataNasc;

    public void setNome(String n){
        this.nome = n;

    }

    public String getNome(){
        return this.nome;
    }


    public void setIdade(int i){
        this.idade = i;
    }

    public int getIdade(){
      return this.idade;
    }

    public void setDataNasc(String dn){
        this.dataNasc = dn;
    }

    public String getDataNasc(){
        return this.dataNasc;
    }


    
}
