/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo_de_Boca;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class jogo_de_boca {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jogo, rodada, n, valor;

        System.out.println("=== Jogo de Boca ===");
        System.out.println("\nDigite o n�mero objetivo do jogo: ");
        jogo = input.nextInt();
        valor = 0;

        while (valor < jogo) {
            for (rodada = 1; valor < jogo; rodada++) {
                if (rodada % 2 != 0) {
                    System.out.println("\n" + rodada + "� Rodada");
                    System.out.println("Primeiro Jogador digite 1 ou 2: ");
                    n = input.nextInt();
                    while ((n != 1) && (n != 2)) {
                        System.out.println("N�mero inv�lido, tente novamente: ");
                        n = input.nextInt();
                    }
                    valor = valor + n;
                    System.out.println("A somat�ria chegou em: " + valor);

                } else {
                    System.out.println("\n" + rodada + "� Rodada");
                    System.out.println("Segundo Jogador digite 1 ou 2: ");
                    n = input.nextInt();
                    while ((n != 1) && (n != 2)) {
                        System.out.println("N�mero inv�lido, tente novamente: ");
                        n = input.nextInt();
                    }
                    valor = valor + n;
                    System.out.println("A somat�ria chegou em: " + valor);
                }
                if ((valor == jogo) && (rodada % 2 != 0)) {
                    System.out.println("\nFim do Jogo!");
                    System.out.println("Primeiro jogador venceu, parab�ns! ");
                } else if ((valor == jogo) && (rodada % 2 == 0)) {
                    System.out.println("\nFim do Jogo!");
                    System.out.println("Segundo jogador venceu, parab�ns! ");

                }
            }
        }
    }
}
