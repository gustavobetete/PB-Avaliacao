package com.company;

public class Funcionario {
    String nome;
    double salario;
    double bonus;
    double salarioLiquido;
    double desconto;

    public void calculaBonus(double salario){
        if (salario <= 1000) {
            this.bonus = salario * 0.2;
        }else if (salario <= 2000){
            this.bonus = salario * 0.1;
        }else if (salario > 2000){
            this.desconto = salario * 0.1;
        }
        this.salarioLiquido = (salario - desconto) + bonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        calculaBonus(salario);
    }

    public double getBonus() {
        return bonus;
    }


    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
}
