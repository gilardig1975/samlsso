<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Affinity Setup</title>
</head>
<body>
   <%
	boolean sessionfound =false;
	Cookie[] cs = request.getCookies();
	if(cs!=null){
		
		for(int index=0;index<cs.length;index++){
			Cookie c =cs[index];
			if(c!=null){
				if (c.getName()==null) continue;
				else
				if(c.getName().equalsIgnoreCase("JSESSIONID")){
					sessionfound=true;
					break;
				} else
				if(c.getName().equalsIgnoreCase("__VCAP_ID__")){
					sessionfound=true;
					break;	
				}
			}
		}
	}
	if(!sessionfound){
		request.getSession(true);
	}	
   %>
	<script type="text/javascript">
		window.location.href = 'home';
	</script>

</body>
</html>
