<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 20px;

}

.head{
       background-color: gray;
    }

th, td {
    border: 1px solid black;
    padding: 10px;
    text-align: left;
    
}
th {
    background-color: green;
    color: white;
}
button {
    padding: 5px 10px;
    margin: 2px;
    cursor: pointer;
    border: none;
    font-size: 14px;
}


.update {
    background-color: green !important;
    color: white !important;
}

.delete {
    background-color: red !important;
    color: white !important;
}

    </style>

</head>
<body>

    <table border="1">
		<tr class="head">
			<td>ID</td>
			<td>NAME</td>
			<td>PHONE</td>
			<td>SALARY</td>
			<td>UPDATE</td>
			<td>DELETE</td>
		</tr>
		<c:forEach var="emp" items="${employees}">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.phone}</td>
				<td>${emp.salary}</td>
				
				
	      <td><a href="edit?id=${emp.id}"><button class="update">Update</button></a></td>
          <td><a href="delete?id=${emp.id}"><button class="delete">Delete</button></a></td>
				
				
			</tr>
		</c:forEach>

	</table>
    

</body>
</html>