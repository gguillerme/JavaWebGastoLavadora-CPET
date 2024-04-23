package com.cpetead;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/resultado")
public class ResultadoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeAluno = request.getParameter("nomeAluno");
        // Obtenha os parâmetros para os 12 meses e processe-os conforme necessário
        // Chame o método CalculadoraConsumoEnergia com os dados recebidos
        // Envie os resultados para a página JSP para exibição
    }
}
