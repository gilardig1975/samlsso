
package it.ibm.cs.sample.ejbs;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "CloudMessageServiceService", targetNamespace = "http://ejbs.sample.cs.ibm.it/", wsdlLocation = "WEB-INF/wsdl/CloudMessageService.wsdl")
public class CloudMessageServiceService
    extends Service
{

    private final static URL CLOUDMESSAGESERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException CLOUDMESSAGESERVICESERVICE_EXCEPTION;
    private final static QName CLOUDMESSAGESERVICESERVICE_QNAME = new QName("http://ejbs.sample.cs.ibm.it/", "CloudMessageServiceService");

    static {
            CLOUDMESSAGESERVICESERVICE_WSDL_LOCATION = it.ibm.cs.sample.ejbs.CloudMessageServiceService.class.getResource("/WEB-INF/wsdl/CloudMessageService.wsdl");
        WebServiceException e = null;
        if (CLOUDMESSAGESERVICESERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'WEB-INF/wsdl/CloudMessageService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        CLOUDMESSAGESERVICESERVICE_EXCEPTION = e;
    }

    public CloudMessageServiceService() {
        super(__getWsdlLocation(), CLOUDMESSAGESERVICESERVICE_QNAME);
    }

    public CloudMessageServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CLOUDMESSAGESERVICESERVICE_QNAME, features);
    }

    public CloudMessageServiceService(URL wsdlLocation) {
        super(wsdlLocation, CLOUDMESSAGESERVICESERVICE_QNAME);
    }

    public CloudMessageServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CLOUDMESSAGESERVICESERVICE_QNAME, features);
    }

    public CloudMessageServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CloudMessageServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CloudMessageServiceSEI
     */
    @WebEndpoint(name = "CloudMessageService")
    public CloudMessageServiceSEI getCloudMessageService() {
        return super.getPort(new QName("http://ejbs.sample.cs.ibm.it/", "CloudMessageService"), CloudMessageServiceSEI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CloudMessageServiceSEI
     */
    @WebEndpoint(name = "CloudMessageService")
    public CloudMessageServiceSEI getCloudMessageService(WebServiceFeature... features) {
        return super.getPort(new QName("http://ejbs.sample.cs.ibm.it/", "CloudMessageService"), CloudMessageServiceSEI.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CLOUDMESSAGESERVICESERVICE_EXCEPTION!= null) {
            throw CLOUDMESSAGESERVICESERVICE_EXCEPTION;
        }
        return CLOUDMESSAGESERVICESERVICE_WSDL_LOCATION;
    }

}
