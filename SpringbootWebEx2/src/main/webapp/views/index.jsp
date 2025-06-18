<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Number Input Form</title>
    <style>
        /* Reset some default */
        * {
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        body {
            background: #f0f2f5;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background: #fff;
            padding: 2.5rem 3rem;
            border-radius: 12px;
            box-shadow: 0 12px 24px rgba(0,0,0,0.15);
            width: 320px;
            text-align: center;
        }
        h1 {
            margin-bottom: 1.5rem;
            color: #333;
            font-weight: 700;
        }
        form {
            display: flex;
            flex-direction: column;
            gap: 1.25rem;
        }
        input[type="number"] {
            padding: 12px 15px;
            font-size: 1rem;
            border: 2px solid #ddd;
            border-radius: 8px;
            transition: border-color 0.3s ease;
        }
        input[type="number"]:focus {
            border-color: #007bff;
            outline: none;
            box-shadow: 0 0 8px rgba(0,123,255,0.3);
        }
        input[type="text"] {
                    padding: 12px 15px;
                    font-size: 1rem;
                    border: 2px solid #ddd;
                    border-radius: 8px;
                    transition: border-color 0.3s ease;
                }
        input[type="text"]:focus {
            border-color: #007bff;
            outline: none;
            box-shadow: 0 0 8px rgba(0,123,255,0.3);
                }
        button {
            padding: 12px 0;
            font-size: 1.1rem;
            font-weight: 600;
            border: none;
            border-radius: 8px;
            background: linear-gradient(90deg, #007bff, #0056b3);
            color: white;
            cursor: pointer;
            transition: background 0.3s ease;
        }
        button:hover {
            background: linear-gradient(90deg, #0056b3, #003f7f);
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Enter Two Numbers</h1>
        <form action="add" method="get">
            <input type="number" name="id" placeholder="id" required />
            <input type="text" name="name" placeholder="name" required />
            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>
