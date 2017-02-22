
package it.ibm.ls.sample.ejbs;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "LocalMessageServiceService", targetNamespace = "http://ejbs.sample.ls.ibm.it/", wsdlLocation = "META-INF/wsdl/LocalMessageServiceService.wsdl")
public class LocalMessageServiceService
    extends Service
{

    private final static URL LOCALMESSAGESERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException LOCALMESSAGESERVICESERVICE_EXCEPTION;
    private final static QName LOCALMESSAGESERVICESERVICE_QNAME = new QName("http://ejbs.sample.ls.ibm.it/", "LocalMessageServiceService");

    static {
        LOCALMESSAGESERVICESERVICE_WSDL_LOCATION = it.ibm.ls.sample.ejbs.LocalMessageServiceService.class.getClassLoader().getResource("META-INF/wsdl/LocalMessageServiceService.wsdl");
        WebServiceException e = null;
        if (LOCALMESSAGESERVICESERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/LocalMessageServiceService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        LOCALMESSAGESERVICESERVICE_EXCEPTION = e;
    }

    public LocalMessageServiceService() {
        super(__getWsdlLocation(), LOCALMESSAGESERVICESERVICE_QNAME);
    }

    public LocalMessageServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOCALMESSAGESERVICESERVICE_QNAME, features);
    }

    public LocalMessageServiceService(URL wsdlLocation) {
        super(wsdlLocation, LOCALMESSAGESERVICESERVICE_QNAME);
    }

    public LocalMessageServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOCALMESSAGESERVICESERVICE_QNAME, features);
    }

    public LocalMessageServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LocalMessageServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LocalMessageServiceSEI
     */
    @WebEndpoint(name = "LocalMessageServicePort")
    public LocalMessageServiceSEI getLocalMessageServicePort() {
        return super.getPort(new QName("http://ejbs.sample.ls.ibm.it/", "LocalMessageServicePort"), LocalMessageServiceSEI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LocalMessageServiceSEI
     */
    @WebEndpoint(name = "LocalMessageServicePort")
    public LocalMessageServiceSEI getLocalMessageServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ejbs.sample.ls.ibm.it/", "LocalMessageServicePort"), LocalMessageServiceSEI.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOCALMESSAGESERVICESERVICE_EXCEPTION!= null) {
            throw LOCALMESSAGESERVICESERVICE_EXCEPTION;
        }
        return LOCALMESSAGESERVICESERVICE_WSDL_LOCATION;
    }

}
