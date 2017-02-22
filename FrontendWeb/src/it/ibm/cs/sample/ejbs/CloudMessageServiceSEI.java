
package it.ibm.cs.sample.ejbs;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "CloudMessageService_SEI", targetNamespace = "http://ejbs.sample.cs.ibm.it/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CloudMessageServiceSEI {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "callLocalService", targetNamespace = "http://ejbs.sample.cs.ibm.it/", className = "it.ibm.cs.sample.ejbs.CallLocalService")
    @ResponseWrapper(localName = "callLocalServiceResponse", targetNamespace = "http://ejbs.sample.cs.ibm.it/", className = "it.ibm.cs.sample.ejbs.CallLocalServiceResponse")
    @Action(input = "http://ejbs.sample.cs.ibm.it/CloudMessageService_SEI/callLocalServiceRequest", output = "http://ejbs.sample.cs.ibm.it/CloudMessageService_SEI/callLocalServiceResponse")
    public String callLocalService();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMessage", targetNamespace = "http://ejbs.sample.cs.ibm.it/", className = "it.ibm.cs.sample.ejbs.GetMessage")
    @ResponseWrapper(localName = "getMessageResponse", targetNamespace = "http://ejbs.sample.cs.ibm.it/", className = "it.ibm.cs.sample.ejbs.GetMessageResponse")
    @Action(input = "http://ejbs.sample.cs.ibm.it/CloudMessageService_SEI/getMessageRequest", output = "http://ejbs.sample.cs.ibm.it/CloudMessageService_SEI/getMessageResponse")
    public String getMessage();

}
