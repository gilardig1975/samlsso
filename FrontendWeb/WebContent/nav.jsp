<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<ul>
	<li>
		<div id="home" style="padding: 10px;">
			<a href="home">Home</a><br />
			<p>A simple service available to all the trusted users (the users that has obtained a SAML token from the identity provider).</p>
		</div>
	</li>
	<li>
		<div id="frontendService" style="padding: 10px;">
			<a href="frontendService">Front-end Service</a><br />
			<p>A simple servlet available to authenticated users that belong to <b>FrontendServiceUsers</b> group.</p>
		</div>
	</li>
	<li>
		<div id="cloudService" style="padding: 10px;">
			<a href="cloudService">Cloud Service</a><br />
			<p>A servlet available to authenticated users that belong to <b>FrontendServiceUsers</b> group that calls a web service exposed by <b>CloudServices</b> application.</p>
		</div>
	</li>
	<li><div id="restrictedService" style="padding: 10px;">
			<a href="restrictedService">Restricted Service</a><br />
			<p>
			<p>Previous servlet that calls another web service operation which, in turn, calls a web service exposed by the <b>LocalServices</b> application.</p>
		</div>
	</li>
	<li>
		<div id="logout" style="padding: 10px;">
			<a href="ibm_security_logout?logoutExitPage=unprotected.jsp">Logout</a><br />
			<p></p>
		</div>
	</li>
</ul>
<script>
	var url = new String();
	url = window.location.href;
	var indOf = url.lastIndexOf('/');
	var id = url.substring(indOf + 1);
	var element = document.getElementById(id);
	if (element) {
		element.parentNode.style.background = 'lightblue';
	}
</script>