package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> loginCadastrado = new ArrayList<>();
        loginCadastrado.add("alura");

        List<String> senhaCadastrada = new ArrayList<>();
        senhaCadastrada.add("alura123");

        int maximoTentativas = 3;
        int tentativaAtual = 1;

        while(tentativaAtual <= maximoTentativas){
            System.out.println("Informe seu login:");
            String loginInformado = sc.next().toLowerCase();

            System.out.println("Informe sua senha:");
            String senhaInformada = sc.next().toLowerCase();

            if (loginInformado.equals(loginCadastrado.get(0)) && senhaInformada.equals(senhaCadastrada.get(0))) {

                System.out.println("Bem vindo ao sistema! " + "Sr./a " + loginInformado);
                tentativaAtual = maximoTentativas;
                Date dataHoraAtual = new Date();

                String hora = new SimpleDateFormat("HH").format(dataHoraAtual);

                int numero = Integer.parseInt(hora);
                if (numero >=6 && numero < 12) {
                    System.out.println("Bom dia, você se logou ao nosso sistema.");
                }else if (numero >= 12 && numero < 18){
                    System.out.println("Boa tarde, você se logou ao nosso sistema.");
                }else if (numero >= 18 && numero < 24){
                    System.out.println("Boa noite, você se logou ao nosso sistema.");
                }else if(numero >= 0 && numero < 6){
                    System.out.println("Boa madrugada, você se logou ao nosso sistema.");
                }

            }else {
                if (tentativaAtual == 3) {
                    System.out.println("Número permitido de tentativas excedeu");
                }else {
                    System.out.println("Login invalido. Tente novamente!");
                }
            }
            tentativaAtual++;
        }


    }
}
