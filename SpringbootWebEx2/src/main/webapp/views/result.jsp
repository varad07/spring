<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Result</title>
    <style>
        body {
            background: linear-gradient(to right, #83a4d4, #b6fbff);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        .result-box {
            background: #fff;
            padding: 2rem 3rem;
            border-radius: 16px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
            text-align: center;
        }
        h1 {
            font-size: 2rem;
            color: #333;
            margin-bottom: 1rem;
        }
        p {
            font-size: 1.25rem;
            margin: 0.75rem 0;
            color: #555;
        }
        .result {
            font-size: 2rem;
            font-weight: bold;
            color: #007bff;
            margin-top: 1rem;
        }
        .btn-back {
            margin-top: 2rem;
            display: inline-block;
            padding: 10px 20px;
            background: #007bff;
            color: white;
            text-decoration: none;
            border-radius: 8px;
            transition: background 0.3s ease;
        }
        .btn-back:hover {
            background: #0056b3;
        }
    </style>
</head>
<body>
    <div class="result-box">
                 <h1>Welcome</h1>
            <p><strong>${alien}</strong></p>
            <a class="btn-back" href="/">Go Back</a>
    </div>
</body>
</html>
