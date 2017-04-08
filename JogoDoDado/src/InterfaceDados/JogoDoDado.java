/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDados;

import java.util.Scanner;

/**
 *
 * @author Fabrício
 */
public class JogoDoDado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char opcao = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Jogo do dado\n");
        System.out.println("Deseja iniciar o jogo?");
        opcao = leitor.next().charAt(0);
        if (opcao == 's') {
            while (opcao != 'n') {
                int dado = (int) (Math.random() * 6 + 1);
                System.out.println("Face do Dado: " + dado);
                System.out.println("\nDeseja jogar novamente o dado?");
                opcao = leitor.next().charAt(0);
            }
            System.out.println("\nFim do Jogo.");
        } else {
            System.out.println("\nFim do Jogo.");
        }

//        do {            
//            
//            System.out.println("Deseja jogar o dado?");
//            opcao = leitor.next().charAt(0);
//            int dado = (int) (Math.random() * 6 + 1);
//            System.out.println("Face: " + dado);
//        } while (opcao == 's');
    }
}
