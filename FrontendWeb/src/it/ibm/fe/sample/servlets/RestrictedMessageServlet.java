package it.ibm.fe.sample.servlets;

import it.ibm.cs.sample.ejbs.CloudMessageServiceSEI;

import javax.servlet.annotation.WebServlet;

@WebServlet("/restrictedService")
public class RestrictedMessageServlet extends AbstractMessageServlet
{

	private static final long serialVersionUID = 1L;

	@Override
	protected String doCall(CloudMessageServiceSEI port)
	{
		return port.callLocalService();
	}
}
