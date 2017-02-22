package it.ibm.cs.sample.ejbs;

import it.ibm.ls.sample.ejbs.LocalMessageServiceSEI;
import it.ibm.ls.sample.ejbs.LocalMessageServiceService;

import javax.annotation.security.RolesAllowed;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.xml.ws.BindingProvider;

/**
 * Session Bean implementation class CloudMessageService
 */
@Stateless
@LocalBean
@WebService(targetNamespace = "http://ejbs.sample.cs.ibm.it/", serviceName = "CloudMessageServiceService", portName = "CloudMessageService", endpointInterface = "it.ibm.cs.sample.ejbs.CloudMessageService_SEI", wsdlLocation = "META-INF/wsdl/CloudMessageService.wsdl")
@RolesAllowed("CloudServiceAccessRole")
public class CloudMessageService
{

	public String getMessage()
	{
		return "Response from " + getClass().getSimpleName() + ".getMessage at " + System.currentTimeMillis();

	}

	public String callLocalService()
	{
		LocalMessageServiceService service = new LocalMessageServiceService();
		LocalMessageServiceSEI port = service.getLocalMessageServicePort();
		BindingProvider bp = (BindingProvider) port;

		String endpointURL = "https://localhost:9445/LocalServicesEJB/LocalMessageServiceService";

		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointURL);

		return port.getLocalMessage();

	}
}
