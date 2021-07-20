<%-- Controller JSP --%>

<jsp:useBean id="Lgn" class="com.phoenix.web.models.LoginBean" scope="request">
</jsp:useBean>

<jsp:setProperty property="username" name="Lgn"/>
<jsp:setProperty property="password" name="Lgn" param="passwd"/>

<%
	if(Lgn.isValid()){ 
	%>
	<jsp:forward page="/welcome.jsp">
		<jsp:param value="Core Java" name="book1" />
		<jsp:param value="JSP" name="book2" />
	</jsp:forward>

<%	} else{ 
%>
<h2 style= 'color:red;'>Invalid login</h2>
<jsp:include page="/login.html" />
<%  
	}  
%>