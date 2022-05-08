package Conta;

import java.util.Scanner;
import java.util.Random;

public class ContaCorrente implements InterfaceContaCorrente {
    private String nomeCorretista;
    private int numeroConta;
    private int numeroAgencia;
    private double saldo;

    //get de numeroConta
    public int getNumeroConta(){
        return this.numeroConta;
    }

     //get e set de nomeCorretista
     public void setNomeCorretista(String nc){
        this.nomeCorretista = nc;
    }
    public String getNomeCorretista(){

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


    @Override
    public void abrirContaCorrente(){
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();
        System.out.println("Informe o seu Nome: ");
        setNomeCorretista(teclado.nextLine());
        System.out.println("Informe o número da agencia: ");
        setNumeroAgencia(teclado.nextInt());
        this.numeroConta = gerador.nextInt(50000); // numero da conta é gerada de forma aleatoria
        setSaldo(0);  // toda conta assim começacom saldo 0
        teclado.close();
        
    }

    @Override
    public void Depositar() {
       
        
    }

    @Override
    public void Sacar() {
       
        
    }

    @Override
    public void ConsultarSaldo() {
        
        
    }

    @Override
    public void transferir() {
       
        
    }




   /*public void Infomacoes(List listaconta){
        System.out.println("nome do corretista: "+getNomeCorretista());
        System.out.println("numero da conta: "+ getNumeroAgencia());
        System.out.println("Numero da agencia: "+ getNumeroAgencia());
        System.out.println("Saldo da conta: "+ getSaldo());
    }*/
}