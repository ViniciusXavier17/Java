package Conta;

import java.util.Random;

public class ContaCorrente {
    private Pessoa nomeCorretista;
    private int numeroConta;
    private int numeroAgencia;
    private double saldo;

    //Construtor
    /*  ContaCorrente(){
        Random gerador = new Random();
        this.numeroConta = gerador.nextInt(50000); // numero da conta é gerada de forma aleatoria
        this.saldo = 0;  // toda conta começa com saldo 0


    }*/

    //get de numeroConta
    public int getNumeroConta(){
        return this.numeroConta;
    }

     //get e set de nomeCorretista
     public void setNomeCorretista(Pessoa nc){
        this.nomeCorretista = nc;
    }
    public Pessoa getNomeCorretista(){

        return this.nomeCorretista;
    }

    //get e set de numeroAgencia
    public void setNumeroAgencia(int na){
        this.numeroAgencia = na;
    }

    public int getNumeroAgencia(){
        return this.numeroAgencia;
    }

    //get e set de numeroAgencia
    public void setSaldo(double s){
        this.saldo = s;
    }
    public double getSaldo(){
        return this.saldo;
    }



    public void abirContaCorrente(Pessoa nc, int na){
        nomeCorretista = nc;
        Random gerador = new Random();
        this.numeroConta = gerador.nextInt(50000); // numero da conta é gerada de forma aleatoria
        setNumeroAgencia(na);
        setSaldo(0);  // toda conta assim começacom saldo 0
        

    }
    

    public void Infomacoes(){
        System.out.println("nome do corretista: "+getNomeCorretista());
        System.out.println("numero da conta: "+ getNumeroAgencia());
        System.out.println("Numero da agencia: "+ getNumeroAgencia());
        System.out.println("Saldo da conta: "+ getSaldo());
    }
}