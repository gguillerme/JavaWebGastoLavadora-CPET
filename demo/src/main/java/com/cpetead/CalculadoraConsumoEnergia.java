package com.cpetead;

import java.util.Scanner;

public class CalculadoraConsumoEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora de Consumo de Energia");
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        double[] consumoMensal = new double[12];
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o consumo de energia para " + (i+1) + "º o mês : ");
            consumoMensal[i] = scanner.nextDouble();
        }

        // Calcular o valor total gasto no ano
        double totalGasto = 0;
        for (double consumo : consumoMensal) {
            totalGasto += consumo;
        }

        // Encontrar o mês com maior e menor consumo
        int mesMaiorConsumo = 0;
        int mesMenorConsumo = 0;
        double maiorConsumo = consumoMensal[0];
        double menorConsumo = consumoMensal[0];
        for (int i = 1; i < 12; i++) {
            if (consumoMensal[i] > maiorConsumo) {
                maiorConsumo = consumoMensal[i];
                mesMaiorConsumo = i;
            }
            if (consumoMensal[i] < menorConsumo) {
                menorConsumo = consumoMensal[i];
                mesMenorConsumo = i;
            }
        }

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        // Resultado final
        System.out.println("\nResultado:");
        System.out.println("NOME DO ALUNO: " + nomeAluno);
        System.out.println("GASTO DA LAVADORA: " + totalGasto + "W ANUAL");
        System.out.println("MÊS COM MAIOR CONSUMO: " + meses[mesMaiorConsumo]);
        System.out.println("MÊS COM MENOR CONSUMO: " + meses[mesMenorConsumo]);

        scanner.close();
    }
}
