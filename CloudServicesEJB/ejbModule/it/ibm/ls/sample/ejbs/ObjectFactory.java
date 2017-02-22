
package it.ibm.ls.sample.ejbs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.ibm.ls.sample.ejbs package. 
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

    private final static QName _GetLocalMessageResponse_QNAME = new QName("http://ejbs.sample.ls.ibm.it/", "getLocalMessageResponse");
    private final static QName _GetLocalMessage_QNAME = new QName("http://ejbs.sample.ls.ibm.it/", "getLocalMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.ibm.ls.sample.ejbs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLocalMessage }
     * 
     */
    public GetLocalMessage createGetLocalMessage() {
        return new GetLocalMessage();
    }

    /**
     * Create an instance of {@link GetLocalMessageResponse }
     * 
     */
    public GetLocalMessageResponse createGetLocalMessageResponse() {
        return new GetLocalMessageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocalMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs.sample.ls.ibm.it/", name = "getLocalMessageResponse")
    public JAXBElement<GetLocalMessageResponse> createGetLocalMessageResponse(GetLocalMessageResponse value) {
        return new JAXBElement<GetLocalMessageResponse>(_GetLocalMessageResponse_QNAME, GetLocalMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocalMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbs.sample.ls.ibm.it/", name = "getLocalMessage")
    public JAXBElement<GetLocalMessage> createGetLocalMessage(GetLocalMessage value) {
        return new JAXBElement<GetLocalMessage>(_GetLocalMessage_QNAME, GetLocalMessage.class, null, value);
    }

}
