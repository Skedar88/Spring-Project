<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
<style>
    body {
        font-family: Arial, sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        background: linear-gradient(to right, #6a11cb, #2575fc);
    }
    .id-card {
        background: white;
        padding: 20px;
        border-radius: 15px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        text-align: center;
        width: 300px;
    }
    .id-card h2 {
        margin: 10px 0;
        color: #333;
    }
    .id-card p {
        margin: 5px 0;
        font-size: 18px;
    }
    .id-card .highlight {
        font-weight: bold;
        color: #2575fc;
    }
</style>
</head>
<body>

    <div class="id-card">
        <h2>Employee Details</h2>
        <p><span class="highlight">ID:</span> ${e.getId()}</p>
        <p><span class="highlight">Name:</span> ${e.getName()}</p>
        <p><span class="highlight">Phone:</span> ${e.getPhone()}</p>
        <p><span class="highlight">Salary:</span> ${e.getSalary()}</p>
    </div>

</body>
</html>
