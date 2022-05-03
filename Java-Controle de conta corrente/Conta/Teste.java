package Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 



O codigo ainda está inconpleto 




*/

public class Teste {

    public static void main(String[] args) {

       Scanner teclado = new Scanner(System.in);
       ContaCorrente conta = new ContaCorrente();;
       List<ContaCorrente> listaconta = new ArrayList<ContaCorrente>();
       int menu =0;
       Pessoa p1 = new Pessoa();
       p1.setNome("vinicius");



        do {
            System.out.println("*--------------------------------------*");
            System.out.println("[1] Abrir conta corrente");
            System.out.println("[2] Depositar");
            System.out.println("[3] Sacar");
            System.out.println("[4] Consultar saldo"); 
            System.out.println("[5] Transferencia entre contas");
            System.out.println("[6] Sair");
            System.out.print("Digite uma das opções: ");
            menu = Integer.parseInt(teclado.nextLine());
            
            switch (menu) {
                case 1:
               //conta = new ContaCorrente();
                conta.abrirContaCorrente(p1, 1234);
                listaconta.add(conta);
                    
            }

            
        } while (menu != 6);
        if(menu == 6){
            System.out.println("obrigado por usar nosso banco, tenha um Bom Dia!");
        }
        
        
        System.out.println(listaconta.toString());
        teclado.close();    

    }

}
