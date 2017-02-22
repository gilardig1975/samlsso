package it.ibm.fe.sample.servlets;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class GenericServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		service(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		service(request, response);
	}

	@Override
	protected final void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		ServiceResults sr = new ServiceResults();
		try
		{
			doService(request, response, sr);
		} catch (Exception ex)
		{
			appendException(sr, ex);
		}
		if (sr.content != null)
		{
			request.setAttribute("content", sr.content);
		}
		request.setAttribute("messages", sr.messages);
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

	protected abstract void doService(HttpServletRequest request, HttpServletResponse response, ServiceResults serviceResults)
			throws ServletException, IOException;

	protected void appendMessage(ServiceResults sr, String message)
	{
		//append(sr, "<li>");
		sr.messages.add(message);
		//append(sr, "</li>\n");
	}

	protected void appendException(ServiceResults serviceResults, Exception ex)
	{
		Throwable t = ex;
		Throwable t1 = null;
		while (t != null && t != t1)
		{
			appendMessage(serviceResults, "<font color=\"red\">" + t.getMessage() + "</font>");
			t1 = t;
			t = t1.getCause();
		}
	}

	protected static class ServiceResults
	{

		public String content;
		private final List<String> messages = new ArrayList<String>();

	}
}
