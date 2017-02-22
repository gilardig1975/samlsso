<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ISP Demo</title>
<style type="text/css">
ul {
	list-style: none;
	padding-left: 20px;
}
</style>
</head>
<body>
	<table style="border: 1px solid;" width="100%">
		<tr>
			<td align="center" style="border-bottom: 1px solid;" colspan="2">
				<jsp:include page="header.jsp" />
			</td>
		</tr>
		<tr>
			<TD valign="top" width="300px"
				style="border-right: 1px solid; padding-right: 20px;"><jsp:include
					page="nav.jsp" /></TD>
			<td valign="top" style="padding-left: 20px; padding-right: 20px;">
				<jsp:include page="${requestScope.content}" />
			</td>
		</tr>
	</table>
</body>
</html>
