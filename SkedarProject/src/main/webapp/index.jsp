<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Welcome Page</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(135deg, #1e3c72, #2a5298);
            color: white;
            font-family: 'Arial', sans-serif;
            margin: 0;
        }
        h2 {
            font-size: 2.5rem;
            font-weight: bold;
            text-shadow: 0 0 10px rgba(255, 255, 255, 0.8);
            animation: fadeIn 2s ease-in-out, glow 1.5s infinite alternate;
        }
        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(-20px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }
        @keyframes glow {
            from {
                text-shadow: 0 0 10px rgba(255, 255, 255, 0.8);
            }
            to {
                text-shadow: 0 0 20px rgba(255, 255, 255, 1);
            }
        }
    </style>
</head>
<body>
    <h2><%= "Welcome Back, Kedar Swami" %></h2>
</body>
</html>
