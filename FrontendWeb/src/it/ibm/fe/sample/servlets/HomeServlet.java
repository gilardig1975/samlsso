package it.ibm.fe.sample.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends GenericServlet
{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doService(HttpServletRequest request, HttpServletResponse response, ServiceResults serviceResults) throws ServletException,
			IOException
	{
		serviceResults.content = "fragments/home.jsp";
	}
}
