package it.ibm.ls.sample.ejbs;

import javax.jws.WebService;
import javax.annotation.security.RolesAllowed;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class LocalMessageService
 */
@Stateless
@LocalBean
@WebService(targetNamespace = "http://ejbs.sample.ls.ibm.it/", serviceName = "LocalMessageServiceService", portName = "LocalMessageServicePort", endpointInterface = "it.ibm.ls.sample.ejbs.LocalMessageService_SEI", wsdlLocation = "META-INF/wsdl/LocalMessageServiceService.wsdl")
@RolesAllowed("LocalServiceAccessRole")
public class LocalMessageService
{

	public String getLocalMessage()
	{
		return "Response from " + getClass().getSimpleName() + ".getLocalMessage at " + System.currentTimeMillis();
	}
}
