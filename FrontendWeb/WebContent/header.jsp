<%@page import="javax.xml.transform.stream.StreamResult"%>
<%@page import="javax.xml.transform.dom.DOMSource"%>
<%@page import="javax.xml.transform.OutputKeys"%>
<%@page import="java.io.StringWriter"%>
<%@page import="javax.xml.transform.Transformer"%>
<%@page import="javax.xml.transform.TransformerFactory"%>
<%@page import="org.w3c.dom.Element"%>
<%@page import="java.lang.reflect.Field"%>
<%--@page import="com.ibm.websphere.security.saml2.Saml20Token"--%>
<%@page import="java.util.List"%>
<%@page import="com.ibm.websphere.security.cred.WSCredential"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="com.ibm.websphere.security.auth.WSSubject"%>
<%@page import="javax.security.auth.Subject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<b>
<%
	Subject subject = WSSubject.getRunAsSubject();
	out.write("Welcome " + subject.getPrincipals());
%>
</b>
<br />
<%
Set<?> credentials = subject.getPublicCredentials();
if (credentials != null)
{
	Iterator<?> iterator = credentials.iterator();
	while (iterator.hasNext())
	{
		Object o = iterator.next();
		if (o instanceof WSCredential)
		{
			WSCredential credential = (WSCredential) o;
			List<?> groups = credential.getGroupIds();
			for (Object g : groups)
			{
				out.write(g.toString() + "<br />");
			}
		} else
		{
			out.write(o.toString() + "<br />");
		}
	}
}
%>
<br />
<%
/*credentials = subject.getPrivateCredentials();
if (credentials != null)
{
	Iterator<?> iterator = credentials.iterator();
	while (iterator.hasNext())
	{
		Object credential = iterator.next();
		//out.write(credential.toString() + "<br />");
		if (credential instanceof Saml20Token)
		{
			Saml20Token saml = (Saml20Token)credential;
			
			Field f = saml.getClass().getDeclaredField("assertionDOM");
			f.setAccessible(true);
			Element samlElement = (Element)f.get(saml);
			
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer();
			StringWriter buffer = new StringWriter();
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			transformer.transform(new DOMSource(samlElement),
			      new StreamResult(buffer));
			String str = buffer.toString();
			System.out.println(str);
			out.write(str + "<br />");
		}
	}
}*/
%>
<br />
