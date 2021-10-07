<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="firstweb.*" %>
 
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
	Name : <%= request.getParameter("fname") %><br><br>
	<!--ทำหน้าที่เป็น View ที่รับค่าจาก DetailConcroller -->
	<%
		Product result = (Product)request.getAttribute("result");
	%>
	
	<b><%=result.getProductName() %></b><br>
	<b><%=result.getProductDetail() %></b><br>
	<b>ราคา<%=result.getPrice() %> บาท</b>
	
</body>
</html>