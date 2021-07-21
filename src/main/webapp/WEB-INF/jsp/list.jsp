<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<title>Web Application</title>
</head>

<body>

    Username: ${username}
    <p>Here is your to-do list:
    <p>Simple<br>
    ${listTodos}
    
    
    <p>Formatted<br>    
    <table border="1">
    	<tr>
    	<th>Desc</th>
    	<th>Target Date</th>
    	<th>Done</th>
    	</tr>
    	
    	<c:forEach var="item" items="${listTodos}">
    	<tr>
    		<td>${item.desc}</td>
    		<td>${item.targetDate}</td>
    		<td>${item.done}</td>
    	</tr>
    	</c:forEach>
    </table>
    
</body>
</html>
