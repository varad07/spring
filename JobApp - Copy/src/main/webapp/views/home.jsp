<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Job Portal Home</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(120deg, #f0f4f8, #d9e8ff);
            font-family: 'Segoe UI', sans-serif;
        }
        .navbar {
            background-color: #0d6efd;
        }
        .navbar a {
            color: white !important;
            font-weight: 500;
        }
        .hero {
            text-align: center;
            padding: 100px 20px;
        }
        .hero h1 {
            font-size: 48px;
            font-weight: bold;
            color: #333;
        }
        .hero p {
            font-size: 20px;
            margin-bottom: 30px;
            color: #555;
        }
        .btn-custom {
            width: 200px;
            margin: 10px;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand text-white" href="home.jsp">JobPortal</a>
        <div class="collapse navbar-collapse justify-content-end">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="allJobs">All Jobs</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="contact">Contact</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Hero Section -->
<div class="hero">
    <h1>Welcome to the Job Portal</h1>
    <p>Find your dream job or post a new opportunity</p>
    <a href="allJobs" class="btn btn-primary btn-custom">View All Jobs</a>
    <a href="addJob" class="btn btn-outline-primary btn-custom">Add Job</a>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
