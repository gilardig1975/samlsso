
package it.ibm.cs.sample.ejbs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.ibm.cs.sample.ejbs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMessage_QNAME = new QName("http://ejbs.sample.cs.ibm.it/", "getMessage");
    private final static QName _CallLocalServiceResponse_QNAME = new QName("http://ejbs.sample.cs.ibm.it/", "callLocalServiceResponse");
    private final static QName _GetMessageResponse_QNAME = new QName("http://ejbs.sample.cs.ibm.it/", "getMessageResponse");
    private final static QName _CallLocalService_QNAME = new QName("http://ejbs.sample.cs.ibm.it/", "callLocalService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.ibm.cs.sample.ejbs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMessageResponse }
     * 
     */
    public GetMessageResponse createGetMessageResponse() {
        return new GetMessageResponse();
    }

    /**
     * Create an instance of {@link GetMessage }
     * 
     */
    public GetMessage createGetMessage() {
        return new GetMessage();
    }

    /**
     * Create an instance of {@link CallLocalService }
     * 
     */
    public CallLocalService createCallLocalService() {
        return new CallLocalService();
    }

    /**
     * Create an instance of {@link CallLocalServiceResponse }
     * 
     */
    public CallLocalServiceResponse createCallLocalServiceResponse() {
        return new CallLocalServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs.sample.cs.ibm.it/", name = "getMessage")
    public JAXBElement<GetMessage> createGetMessage(GetMessage value) {
        return new JAXBElement<GetMessage>(_GetMessage_QNAME, GetMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallLocalServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs.sample.cs.ibm.it/", name = "callLocalServiceResponse")
    public JAXBElement<CallLocalServiceResponse> createCallLocalServiceResponse(CallLocalServiceResponse value) {
        return new JAXBElement<CallLocalServiceResponse>(_CallLocalServiceResponse_QNAME, CallLocalServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs.sample.cs.ibm.it/", name = "getMessageResponse")
    public JAXBElement<GetMessageResponse> createGetMessageResponse(GetMessageResponse value) {
        return new JAXBElement<GetMessageResponse>(_GetMessageResponse_QNAME, GetMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallLocalService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs.sample.cs.ibm.it/", name = "callLocalService")
    public JAXBElement<CallLocalService> createCallLocalService(CallLocalService value) {
        return new JAXBElement<CallLocalService>(_CallLocalService_QNAME, CallLocalService.class, null, value);
    }

}
