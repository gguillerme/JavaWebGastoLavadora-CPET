<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultado da Calculadora de Consumo de Energia</title>
    <style>
        /* Estilos */
    </style>
</head>
<body>
    <%
        String nomeAluno = request.getParameter("nomeAluno");
        double[] consumoMensal = new double[12];
        for (int i = 0; i < 12; i++) {
            consumoMensal[i] = Double.parseDouble(request.getParameter("consumoMensal" + (i+1)));
        }

        // Código Java para processar os dados e calcular os resultados
        double totalGasto = 0;
        for (double consumo : consumoMensal) {
            totalGasto += consumo;
        }

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
    %>

    <h2>Resultado da Calculadora de Consumo de Energia</h2>
    <p>Nome do Aluno: <%= nomeAluno %></p>
    <p>Valor total gasto no ano: <%= totalGasto %></p>
    <p>Mês com maior consumo: <%= meses[mesMaiorConsumo] %></p>
    <p>Mês com menor consumo: <%= meses[mesMenorConsumo] %></p>
</body>
</html>
