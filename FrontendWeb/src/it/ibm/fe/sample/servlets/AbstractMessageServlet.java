package it.ibm.fe.sample.servlets;

import it.ibm.cs.sample.ejbs.CloudMessageServiceSEI;
import it.ibm.cs.sample.ejbs.CloudMessageServiceService;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.BindingProvider;

public abstract class AbstractMessageServlet extends GenericServlet
{

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doService(HttpServletRequest request, HttpServletResponse response, ServiceResults serviceResults) throws ServletException,
			IOException
	{
		long start = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("aaaa-MM-dd hh:mm:ss.SSS");
		CloudMessageServiceService service = new CloudMessageServiceService();
		CloudMessageServiceSEI port = service.getCloudMessageService();
		BindingProvider bp = (BindingProvider) port;

		String endpointURL = "https://localhost:9444/CloudServicesEJB/CloudMessageServiceService";
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointURL);

		appendMessage(serviceResults, "start " + sdf.format(new Date(start)));
		appendMessage(serviceResults, "calling service with SAML authentication for service user group");
		try
		{
			appendMessage(serviceResults, "service response: " + doCall(port));
		} catch (Exception ex)
		{
			appendException(serviceResults, ex);
		}
		long end = System.currentTimeMillis();
		appendMessage(serviceResults, "end " + sdf.format(new Date(end)) + "\n");
		appendMessage(serviceResults, "elapsed " + (end - start) + " millis");

		serviceResults.content = "fragments/service.jsp";

	}

	protected abstract String doCall(CloudMessageServiceSEI port);
}
