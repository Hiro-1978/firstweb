<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<select>
		<%
			int i;
			for(i=2564; i>=2500; i--){
				out.print("<option>" + i + "</option>");		
			}
		%>	
	</select>
	<!-- Code JSP แบบย่อ -->
	<b><%= i %></b>
	Name : <%= request.getParameter("fname") %>
</body>
</html>