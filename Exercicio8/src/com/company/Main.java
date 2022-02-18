package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Digite a quantidade de funcionarios:");
        int qtdFuncionarios = sc.nextInt();

        for (int i = 0; i < qtdFuncionarios ; i++) {
            Funcionario funcionario = new Funcionario();
            System.out.println("Digite o nome do colaborador:");
            funcionario.setNome(sc.next());
            System.out.println("Digite o salario do colaborador:");
            funcionario.setSalario(sc.nextDouble());

            funcionarios.add(funcionario);

        }
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("Funcionário: "+ funcionarios.get(i).getNome());
            System.out.println("Salário: " + funcionarios.get(i).getSalario());

            if(funcionarios.get(i).getSalario() > 2000){
                System.out.println("Desconto: " + funcionarios.get(i).getDesconto());
            }else {
                System.out.println("Bonus: " + funcionarios.get(i).getBonus());
            }
            System.out.println("Salário Liquido: " + funcionarios.get(i).getSalarioLiquido());
            System.out.println("");
        }
    }
}
