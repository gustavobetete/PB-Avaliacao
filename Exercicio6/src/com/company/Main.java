package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome para começar: ");
        String nome = sc.next();


            List<String> perguntas = new ArrayList<>();

            perguntas.add("Qual a fruta que o macaco gosta?");
            perguntas.add("quanto é 15 + 30?");
            perguntas.add("Em qual mês se comemora o Dia das Mães?");
            perguntas.add("O que é, o que é: cai em pé e corre deitado?");
            perguntas.add("O tomate é um legume ou uma fruta?");

            List<String> respostas = new ArrayList<>();

            respostas.add("banana");
            respostas.add("45");
            respostas.add("maio");
            respostas.add("chuva");
            respostas.add("fruta");

            int i = 0;
            int pontuacao =0;
            int erro = 0;

            System.out.println();

            for (i = 0; i < perguntas.size(); i++) {
                System.out.println(perguntas.get(i));
                String resposta = sc.next().toLowerCase();
                if (resposta.equals(respostas.get(i))) {

                    System.out.println("Voce acertou!!!!\n");
                    pontuacao++;
                }else {

                    System.out.println("Voce errou, vá estudar!\n");
                    erro++;
                }

            }
        System.out.println("-------------------------");
        System.out.println("Nome do usuario: " + nome);
        System.out.println("-------------------------");
        System.out.println("Acertou: " + pontuacao);
        System.out.println("-------------------------");
        System.out.println("Errou: " + erro);
        System.out.println("-------------------------");

    }
    }

