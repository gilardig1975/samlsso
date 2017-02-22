
package it.ibm.ls.sample.ejbs;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "LocalMessageService_SEI", targetNamespace = "http://ejbs.sample.ls.ibm.it/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LocalMessageServiceSEI {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLocalMessage", targetNamespace = "http://ejbs.sample.ls.ibm.it/", className = "it.ibm.ls.sample.ejbs.GetLocalMessage")
    @ResponseWrapper(localName = "getLocalMessageResponse", targetNamespace = "http://ejbs.sample.ls.ibm.it/", className = "it.ibm.ls.sample.ejbs.GetLocalMessageResponse")
    @Action(input = "http://ejbs.sample.ls.ibm.it/LocalMessageService_SEI/getLocalMessageRequest", output = "http://ejbs.sample.ls.ibm.it/LocalMessageService_SEI/getLocalMessageResponse")
    public String getLocalMessage();

}
