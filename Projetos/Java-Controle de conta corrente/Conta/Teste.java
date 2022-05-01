package Conta;

/* O codigo ainda está inconpleto */

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ContaCorrente p1 = new ContaCorrente();
        int menu =0;



        do {
            System.out.println("*--------------------------------------*");
            System.out.println("[1] Abrir conta corrente");
            System.out.println("[2] Depositar");
            System.out.println("[3] Sacar");
            System.out.println("[4] Consultar saldo"); 
            System.out.println("[5] Transferencia entre contas");
           // System.out.println(" [6] Listagens de contas abertas");
            System.out.println("[7] Sair");
            System.out.print("Digite uma das opções: ");
            menu = Integer.parseInt(teclado.nextLine());
            
            switch (menu) {
                case 1:
            
                System.out.print("Informe o seu nome: ");
                p1.setNomeCorretista(teclado.nextLine());

                System.out.print("informe o numero da agencia: ");
                p1.setNumeroAgencia(Integer.parseInt(teclado.nextLine()));
                break;
                    
            }

            
        } while (menu != 7);
        if(menu == 7){
            System.out.println("obrigado por usar nosso banco, tenha um Bom Dia!");
        }

        teclado.close();    
    }

    
    
}
