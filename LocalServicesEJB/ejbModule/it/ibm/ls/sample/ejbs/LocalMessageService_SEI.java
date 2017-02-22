package it.ibm.ls.sample.ejbs;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.jws.soap.SOAPBinding.ParameterStyle;

@SOAPBinding(style=Style.DOCUMENT,use=Use.LITERAL,parameterStyle=ParameterStyle.WRAPPED)
@WebService

public interface LocalMessageService_SEI extends java.rmi.Remote
{
  public java.lang.String getLocalMessage();
}