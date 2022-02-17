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
    }
}
