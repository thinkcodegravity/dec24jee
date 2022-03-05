<%@ page import="java.util.ArrayList" %> 

<%
	if( request.getAttribute("loginSuccess") == null )
		response.sendRedirect("/index.html");
		
	String address="new york";
%>
<div>
	WELCOME <%= request.getAttribute("name") %>   TO JAVA WEBSITE
	<br>
	address : <%= address %>   
</div>
 